package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringRunner.class,args);
        SpringApplication.run(ForumUser.class,args);

    }
}
