package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by jwh on 2017/6/13 0013.
 * <p>@EnableFeignClients 服务消费者，调用服务;在spring Cloud Netflix栈中，各个微服务都是以HTTP接口的形式暴露自身服务的，因此在调用远程服务时就必须使用HTTP客户端</p>
 * <p>Feigh是一个HTTP客户端，通过HTTP请求方式调用远程服务;类似URLConnection，HttpClient,Spring的RestTemplate等HTTP客户端</p>
 * <p>@EnableEurekaClient 服务提供者，向注册中心注册服务,注册的是Rest层服务</p>
 * <p>@EnableCircuitBreaker 表明使用断路器</p>
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
//@EnableDiscoveryClient
public class StartConsumer {
    public static void main(String[] args){
        SpringApplication.run(StartConsumer.class,args);
    }
}
