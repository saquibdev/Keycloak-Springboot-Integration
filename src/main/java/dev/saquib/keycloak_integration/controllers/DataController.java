package dev.saquib.keycloak_integration.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/data")
public class DataController {

    @GetMapping(value = "/user")
    @PreAuthorize("hasRole('client_user')")
    public String userApi(){
        return "I am a user";
    }

    @GetMapping(value = "/admin")
    @PreAuthorize("hasRole('client_admin')")
    public String adminApi(){
        return "I am an Admin";
    }

}
