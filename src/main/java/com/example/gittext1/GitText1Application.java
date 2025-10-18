package com.example.gittext1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitText1Application {

    public static void main(String[] args) {
        SpringApplication.run(GitText1Application.class, args);
        System.out.println(("----- selectAll method test ------"));
        System.out.println("hello git1");
        System.out.println("hello git2");
        System.out.println("git push commit");

    }

}
