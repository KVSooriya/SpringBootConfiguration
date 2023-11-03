package com.vismee.springbootconfiguration.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController
{
    // Injection of properties from properties file
    @Value("${application.name}")
    private String applicationName;
    @Value("${application.description}")
    private String applicationDescription;

    @GetMapping("/")
    public String basicRestMapping()
    {
        return "Hello Rest Controller";
    }

    @GetMapping("/appdetail")
    public String getApplicationDetail()
    {
        return applicationName + " : " + applicationDescription;
    }

}
