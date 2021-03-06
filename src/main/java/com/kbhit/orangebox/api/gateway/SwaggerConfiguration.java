package com.kbhit.orangebox.api.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket storageApplicationAPI() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("api")
                .apiInfo(new ApiInfoBuilder()
                        .title("Orangebox Api Gateway Service")
                        .description("Service responsible for routing")
                        .build())
                .select()
                .paths(regex("(/.*)"))
                .build();
    }

}
