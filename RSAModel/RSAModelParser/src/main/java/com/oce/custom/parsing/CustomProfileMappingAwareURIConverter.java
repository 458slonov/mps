package com.oce.custom.parsing;

import com.google.common.collect.Maps;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.URIMappingRegistryImpl;
import org.eclipse.papyrus.interoperability.rsa.RSAToPapyrusParameters.URIMapping;
import org.eclipse.papyrus.interoperability.rsa.transformation.DependencyAnalysisHelper;


import java.util.Map;
import java.util.Optional;

public class CustomProfileMappingAwareURIConverter extends ExtensibleURIConverterImpl {
    private final ResourceSet owner;
    private final CustomDependencyAnalysisHelper dependencyHelper;
    private final Map<URI, Optional<URIMapping>> profileMappings = Maps.newConcurrentMap();

    public CustomProfileMappingAwareURIConverter(ResourceSet owner, CustomDependencyAnalysisHelper dependencyHelper) {
        this.owner = owner;
        this.dependencyHelper = dependencyHelper;
    }

    protected URIMap getInternalURIMap() {
        if (this.uriMap == null) {
            final URIMap delegate = super.getInternalURIMap();
            this.uriMap = (URIMap) (new URIMappingRegistryImpl() {
                private static final long serialVersionUID = 1L;

                protected URI delegatedGetURI(URI uri) {
                    URI result;
                    if (!"epx".equalsIgnoreCase(uri.fileExtension())) {
                        result = delegate.getURI(uri);
                    } else {
                        Optional<URIMapping> mapping = CustomProfileMappingAwareURIConverter.this.getProfileMapping(uri);
                        result = (URI) mapping.map((m) -> {
                            return URI.createURI(m.getTargetURI());
                        }).orElseGet(() -> {
                            return delegate.getURI(uri);
                        });
                    }

                    return result;
                }
            }).map();
        }

        return this.uriMap;
    }

    private Optional<URIMapping> getProfileMapping(URI uri) {
        return (Optional) this.profileMappings.computeIfAbsent(uri, this::findProfileMapping);
    }

    private Optional<URIMapping> findProfileMapping(URI uri) {
        URIMapping result = URIConverter.INSTANCE.exists(uri, (Map) null) ? null : this.dependencyHelper.findExistingProfileMapping(uri, this.owner);
        return Optional.ofNullable(result);
    }
}

