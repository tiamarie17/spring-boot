package com.pluralsight.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HomeController {
    @Value("${app.version}") //inject the custom app version from the properties file into the private string appVersion
    private String appVersion;
    @GetMapping
    @RequestMapping("/")
    public Map getStatus(){
        //print map and its key value pairs to the response as a JSON payload

    }
}
