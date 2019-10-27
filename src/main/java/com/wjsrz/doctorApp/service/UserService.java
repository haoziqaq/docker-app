package com.wjsrz.doctorApp.service;

import com.wjsrz.doctorApp.entity.User;
import com.wjsrz.doctorApp.utils.Result;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public Result selectUserList();

    public Result register(User user, String confirmPassword);
}
