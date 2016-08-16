package com.kbhit.orangebox.api.gateway;

import com.kbhit.orangebox.api.gateway.domain.service.ApiResolver;
import com.kbhit.orangebox.api.gateway.domain.model.ApiCatalog;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ApiController {

    @Autowired
    private ApiResolver apiResolver;

    @ApiOperation(value = "api", nickname = "api")
    @RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ApiCatalog getApi() {
        return apiResolver.resolveApi();
    }

}
