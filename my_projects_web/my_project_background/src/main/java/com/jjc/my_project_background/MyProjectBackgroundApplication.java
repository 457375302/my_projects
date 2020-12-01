package com.jjc.my_project_background;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class MyProjectBackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectBackgroundApplication.class, args);
    }

}
