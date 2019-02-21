package com.njbdqn.mysptnews;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.njbdqn.mysptnews.dao")
public class MysptnewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysptnewsApplication.class, args);
    }
}
