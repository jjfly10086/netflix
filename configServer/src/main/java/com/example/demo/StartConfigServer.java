package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
@SpringBootApplication
@EnableConfigServer //配置中心
@EnableDiscoveryClient //注册服务
public class StartConfigServer {
    public static void main(String[] args){
        SpringApplication.run(StartConfigServer.class,args);
    }
}
