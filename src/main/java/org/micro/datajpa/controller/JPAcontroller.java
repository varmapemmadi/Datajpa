package org.micro.datajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAcontroller {

    @GetMapping("/hii")
    public String hii() {
        return "hii";
    }
}
