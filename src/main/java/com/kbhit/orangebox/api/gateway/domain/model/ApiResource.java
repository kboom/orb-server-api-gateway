package com.kbhit.orangebox.api.gateway.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Entity(name = "API_RESOURCE")
public class ApiResource implements Serializable {

    @Id
    private String name;

    @Column(unique = true)
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
