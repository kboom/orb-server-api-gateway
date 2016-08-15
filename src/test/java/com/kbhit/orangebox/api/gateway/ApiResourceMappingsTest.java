package com.kbhit.orangebox.api.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kbhit.orangebox.api.gateway.domain.model.ApiResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = ApiGatewayApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ApiResourceMappingsTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void canSerializeApiResource() {
        assertThat(objectMapper.canSerialize(ApiResource.class)).isTrue();
    }

}
