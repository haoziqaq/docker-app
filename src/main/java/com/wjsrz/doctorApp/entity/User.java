package com.wjsrz.doctorApp.entity;

import com.wjsrz.doctorApp.controller.validate.UserValidate;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

@Data
public class User {
    private long id;

    @NotNull(message = "用户名不能为空", groups = {UserValidate.RegisterGroup.class})
    private String username;

    @NotNull(message = "密码不能为空", groups = {UserValidate.RegisterGroup.class})
    @Length(min = 6, max = 18, message = "密码长度为6-18位", groups = {UserValidate.RegisterGroup.class})
    private String password;

    private String nickname;
    private String avatar;
    private String role;
}
