package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>@EnableEurekaServer 该注解启动一个服务注册中心提供给其他应用进行对话。</p>
 */
@SpringBootApplication
@EnableEurekaServer
public class StartRegistCenter {

	public static void main(String[] args) {
		SpringApplication.run(StartRegistCenter.class, args);
	}
}
