package com.kbhit.orangebox.api.gateway;

import com.kbhit.orangebox.api.gateway.domain.ApiResolver;
import com.kbhit.orangebox.api.gateway.domain.DatabaseApiResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableJpaRepositories("com.kbhit.orangebox.api.gateway.domain.repository")
public class ApiGatewayApplication {

    @Bean
    public ApiResolver apiResolver() {
        return new DatabaseApiResolver();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
