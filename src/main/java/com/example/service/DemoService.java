package com.example.service;

import com.example.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring_demo
 * @description
 * @author: PeterGao
 * @create: 2021-04-01 09:16
 **/

public interface DemoService {
    List<UserBean> findAll();
}
