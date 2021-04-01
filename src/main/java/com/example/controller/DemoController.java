package com.example.controller;

import com.example.bean.UserBean;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: spring_demo
 * @description
 * @author: PeterGao
 * @create: 2021-04-01 09:18
 **/
@RestController
@RequestMapping("/api/user")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/findAll")
    public List<UserBean> findAll(){
        return demoService.findAll();
    }


}
