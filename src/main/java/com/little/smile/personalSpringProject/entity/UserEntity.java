package com.little.smile.personalSpringProject.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户类
 * @author yj632
 * @since 2020-12-03
 */
@Data
@Entity
@Table(name = "user")
public class UserEntity {
    /** 用户id */
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private long userId;

    @Column(length = 100)
    private String userName;

    @Column(length = 100)
    private String password;
}
