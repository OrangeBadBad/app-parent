package com.pzc.app.photoweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pzc.app.photoweb.mapper")
public class AppPhotowebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppPhotowebApplication.class, args);
    }
}
