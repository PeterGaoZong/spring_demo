package com.example.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: spring_demo
 * @description
 * @author: PeterGao
 * @create: 2021-03-31 17:45
 **/
@Table(name = "user")
@Entity
@Data
public class UserBean {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

}
