package com.example.service.impl;

import com.example.bean.UserBean;
import com.example.dao.DemoDao;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring_demo
 * @description
 * @author: PeterGao
 * @create: 2021-04-01 09:17
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;
    @Override
    public List<UserBean> findAll() {
        return demoDao.findAll();
    }
}
