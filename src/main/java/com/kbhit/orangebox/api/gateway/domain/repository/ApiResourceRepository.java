package com.kbhit.orangebox.api.gateway.domain.repository;

import com.kbhit.orangebox.api.gateway.domain.model.ApiResource;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ApiResourceRepository extends Repository<ApiResource, String> {

    List<ApiResource> findAll();

}
