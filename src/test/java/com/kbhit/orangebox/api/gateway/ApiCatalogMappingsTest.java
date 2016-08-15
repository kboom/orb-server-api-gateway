package com.kbhit.orangebox.api.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kbhit.orangebox.api.gateway.domain.model.ApiCatalog;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiCatalogMappingsTest extends IntegrationTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void canSerializeApiCatalog() {
        assertThat(objectMapper.canSerialize(ApiCatalog.class)).isTrue();
    }

}
