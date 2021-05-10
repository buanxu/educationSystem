package com.buanxu.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmApplication {

    public static void main(String[] args) {
        System.out.println("开启项目");
        System.out.println("springboot");
        SpringApplication.run(CrmApplication.class, args);
    }

}
