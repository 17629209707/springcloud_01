package com.xingyu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loginController")
public class LoginController {
    @GetMapping("login")
    public ResponseEntity<Object> login(String userName){
        System.out.println(userName);
        return ResponseEntity.ok("success");
    }
}
