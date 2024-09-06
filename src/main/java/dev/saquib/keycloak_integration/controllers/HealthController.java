package dev.saquib.keycloak_integration.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthController {

    @GetMapping
    public String checkHealth(){
        return "I am up and running";
    }
}
