package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@RequestMapping("remote-service-api")
public interface RemoteServiceApi {
    @RequestMapping("test1") String test1();
    @RequestMapping("test2") String test2();
    @RequestMapping("test3") String test3();
}
