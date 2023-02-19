package com.springboot.zq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.springboot.zq.*")
@MapperScan("com.springboot.zq.mapper")
public class MyApplication {

//    @RequestMapping("/hello")
//    String home() {
//        return "Hello World!";
//    }

    public static void main(String[] args) {
            SpringApplication.run(MyApplication.class, args);
    }

}