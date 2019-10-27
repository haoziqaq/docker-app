package com.wjsrz.doctorApp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wjsrz.doctorApp.mapper")
public class DoctorAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorAppApplication.class, args);
    }

}
