package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
@RestController
public class RemoteServiceImpl implements RemoteServiceApi {
    @Override
    public String test1() {
        return "Function test1";
    }

    @Override
    public String test2() {
        return "Function test2";
    }

    @Override
    public String test3() {
        return "Function test3";
    }
}
