package com.little.smile.personalSpringProject.baseServer;

import com.little.smile.personalSpringProject.baseServer.entity.UserEntity;
import com.little.smile.personalSpringProject.baseServer.repository.UserReactRepository;
import io.reactivex.rxjava3.core.Flowable;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.inject.Inject;
import java.util.ArrayList;

@Slf4j
@SpringBootTest
class PersonalSpringProjectApplicationTests {
	@Inject
	private UserReactRepository userReactRepository;

	@Test
	void contextLoads() {
		Flowable<UserEntity> r = userReactRepository.saveAll(new ArrayList<>());
		r.forEach(userEntity -> log.info("userInfo--->{}",userEntity)).dispose();
//		r.safeSubscribe(System.out::println);
	}

}
