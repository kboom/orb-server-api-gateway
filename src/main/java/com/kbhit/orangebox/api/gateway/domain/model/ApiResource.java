package com.kbhit.orangebox.api.gateway.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "API_RESOURCE")
public class ApiResource {

    @Id
    private String name;

    private String url;

}
