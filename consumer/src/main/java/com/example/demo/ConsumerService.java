package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Administrator on 2017/6/13 0013.
 * 该注解指定服务名来绑定服务。该注解同时会使服务调用具有负载均衡的能力。
 * value为服务提供者对应application.properties/yml中spring.application.name
 */
@FeignClient(value = "service-provider")
public interface ConsumerService extends RemoteServiceApi{
}
