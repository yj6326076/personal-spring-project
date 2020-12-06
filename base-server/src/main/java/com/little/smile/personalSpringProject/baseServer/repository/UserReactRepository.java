/*
 * this is little boy's personal project,right received by yj6326076@hotmail.com from 2020 to 2020
 */

package com.little.smile.personalSpringProject.baseServer.repository;

import com.little.smile.personalSpringProject.baseServer.entity.UserEntity;
import org.springframework.data.repository.reactive.RxJava3CrudRepository;

/**
 * UserReactRepository
 *
 * @author yj632
 * @since 2020-12-06
 */
public interface UserReactRepository extends RxJava3CrudRepository<UserEntity,Long> {
}
