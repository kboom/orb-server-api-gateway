package com.kbhit.orangebox.api.gateway;

import com.kbhit.orangebox.api.gateway.domain.ApiResolver;
import com.kbhit.orangebox.api.gateway.domain.model.ApiCatalog;
import com.kbhit.orangebox.api.gateway.domain.model.ApiResource;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ApiController {

    @Autowired
    private ApiResolver apiResolver;

    @ApiOperation(value = "api", nickname = "api")
    @RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiCatalog getApi() {
        return apiResolver.resolveApi();
    }

}
