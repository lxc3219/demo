package org.melody.demo.example.controller;

import org.melody.demo.example.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AController {

    @Autowired
    private AService aService;

    @PostMapping("/a")
    public void a() {
        aService.a();
    }
}
