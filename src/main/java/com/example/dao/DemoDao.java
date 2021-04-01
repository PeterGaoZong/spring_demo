package com.example.dao;

import com.example.bean.UserBean;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 * @program: spring_demo
 * @description
 * @author: PeterGao
 * @create: 2021-03-31 17:42
 **/
public interface DemoDao extends JpaRepositoryImplementation<UserBean, Integer> {
}
