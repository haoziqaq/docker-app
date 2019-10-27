package com.wjsrz.doctorApp.service.Impl;

import com.wjsrz.doctorApp.entity.User;
import com.wjsrz.doctorApp.mapper.UserMapper;
import com.wjsrz.doctorApp.service.UserService;
import com.wjsrz.doctorApp.utils.Result;
import com.wjsrz.doctorApp.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Result selectUserList() {
        User user = userMapper.selectById(2);
        return new Result().setMsg(ResultCode.SUCCESS, user);
    }

    @Override
    public Result register(User user, String confirmPassword) {
        if (confirmPassword == null || confirmPassword.isEmpty()) {
            return new Result().setMsg(ResultCode.PASSWORD_IS_NOT_EXIST);
        }
        if (!user.getPassword().equals(confirmPassword)) {
            return new Result().setMsg(ResultCode.PASSWORD_IS_NOT_EQUAL);
        }
        if (user.getAvatar() == null || user.getAvatar().isEmpty()) {
            user.setAvatar("/doctorApp/avatar.jpg");
        }
        user.setRole("1");
        userMapper.insert(user);
        return new Result().setMsg(ResultCode.SUCCESS);
    }


}
