/*
 * this is little boy's personal project,right received by yj6326076@hotmail.com from 2020 to 2020
 */

package com.little.smile.personalSpringProject.baseServer.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * BaseEntity
 *
 * @author yj632
 * @since 2020-12-04
 */
@MappedSuperclass
@Data
public class BaseEntity {
    @CreatedBy
    @Column
    private Long creatBy;

    @CreatedDate
    @Column
    private Date creatDate;

    @LastModifiedBy
    @Column
    private Long updateBy;

    @LastModifiedDate
    @Column
    private Date updateDate;
}
