package com.service.huawei.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-24T08:08:35.048Z")

@RestSchema(schemaId = "huawei")
@RequestMapping(path = "/huawei", produces = MediaType.APPLICATION_JSON)
public class HuaweiImpl {

    @Autowired
    private HuaweiDelegate userHuaweiDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHuaweiDelegate.helloworld(name);
    }

}
