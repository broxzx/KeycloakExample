package com.messageservice.keycloakexample.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("api")
@Log4j2
public class HomeController {


    @GetMapping("/home")
    public String home(Principal principal) {
        log.info(principal);
        return "Hello World!";
    }
}
