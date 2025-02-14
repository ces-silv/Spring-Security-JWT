package org.cash.SpringSecurityWithJWT.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/msg")
    public String getMsg(){
        return "Good Morning";
    }

}
