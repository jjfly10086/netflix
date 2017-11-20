package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@RestController
public class RestConsumerService {
    @Autowired
    private ConsumerService consumerService;

    @HystrixCommand(fallbackMethod = "error") //服务中断/调用失败之后返回的方法
    @RequestMapping("/test")
    public String testConsumer(){
        return consumerService.test1();
    }

    public String error(){
        return "error!";
    }
}
