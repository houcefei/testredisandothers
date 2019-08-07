package com.zc.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcf
 * @create 2019-08-07 10:08
 */
@RestController
public class ConfigController {
    @Value("${server.port}")
    private int port;
    @RequestMapping("/index")
    public String index(){
        return port+"=============";
    }
}
