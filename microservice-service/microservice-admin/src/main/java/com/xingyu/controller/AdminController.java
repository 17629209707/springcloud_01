package com.xingyu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("AdminController")
public class AdminController {
    @GetMapping("admin")
    public ResponseEntity<Object> admin(String userId){
        System.out.println("admin");
        return ResponseEntity.ok("admin");
    }
}
