package com.example.demosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockApi {

    @GetMapping("/public")
    public String publicApi() {
        return "public api";
    }

    @GetMapping("/private")
    public String privateApi() {
        return "private api";
    }
}
