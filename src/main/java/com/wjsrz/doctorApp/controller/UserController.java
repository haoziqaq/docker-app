package com.wjsrz.doctorApp.controller;

import com.wjsrz.doctorApp.controller.validate.UserValidate;
import com.wjsrz.doctorApp.entity.User;
import com.wjsrz.doctorApp.service.UserService;
import com.wjsrz.doctorApp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/selectUserList")
    public Result selectUserList() {
        return userService.selectUserList();
    }

    @PostMapping("/register")
    public Result register(@Validated(UserValidate.RegisterGroup.class) User user, String confirmPassword) {
        return userService.register(user, confirmPassword);
    }
}
