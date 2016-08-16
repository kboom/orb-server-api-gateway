package com.kbhit.orangebox.api.gateway.domain.service;

import com.kbhit.orangebox.api.gateway.domain.model.ApiCatalog;
import com.kbhit.orangebox.api.gateway.domain.model.ApiResource;
import com.kbhit.orangebox.api.gateway.domain.repository.ApiResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.kbhit.orangebox.api.gateway.domain.model.ApiCatalog.apiCatalog;

public class DatabaseApiResolver implements ApiResolver {

    @Autowired
    private ApiResourceRepository resourceRepository;

    @Override
    public ApiCatalog resolveApi() {
        List<ApiResource> resources = resourceRepository.findAll();
        return apiCatalog().withResources(resources).build();
    }

}
