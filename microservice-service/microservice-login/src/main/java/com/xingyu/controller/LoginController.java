package com.xingyu.controller;

import com.xingyu.pojo.User;
import com.xingyu.service.UserService;
import com.xingyu.vo.Result;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("loginController")
@Slf4j
public class LoginController {
    @Resource
    private UserService userService;

    @GetMapping("getUser")
    public Result<Object> getUser() {
        log.info("getUser start");
        List<User> userList = userService.list();
        log.info("getUser end");
        return Result.builder().status(true).code(200).data(userList).build();
    }
}
