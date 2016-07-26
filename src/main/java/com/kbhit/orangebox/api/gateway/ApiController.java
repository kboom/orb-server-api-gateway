package com.kbhit.orangebox.api.gateway;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ApiController {

    @ApiOperation(value = "api", nickname = "api")
    @RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
