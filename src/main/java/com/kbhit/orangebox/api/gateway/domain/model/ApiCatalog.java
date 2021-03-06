package com.kbhit.orangebox.api.gateway.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class ApiCatalog implements Serializable {

    @JsonProperty
    private List<ApiResource> resources;

    public static ApiCatalogBuilder apiCatalog() {
        return new ApiCatalogBuilder();
    }

    public static class ApiCatalogBuilder {

        private ApiCatalog catalog = new ApiCatalog();

        private ApiCatalogBuilder() {
            catalog.resources = newArrayList();
        }

        public ApiCatalogBuilder withResources(List<ApiResource> apiResources) {
            catalog.resources.addAll(apiResources);
            return this;
        }

        public ApiCatalog build() {
            return catalog;
        }

    }

}
