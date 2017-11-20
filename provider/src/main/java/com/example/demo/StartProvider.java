package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/6/12 0012.
 */
@SpringBootApplication
@EnableEurekaClient
public class StartProvider {
    public static void main(String[] args){
        SpringApplication.run(StartProvider.class,args);
    }

}
