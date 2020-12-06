/*
 * this is little boy's personal project,right received by yj6326076@hotmail.com from 2020 to 2020
 */

package com.little.smile.personalSpringProject.util.config;

import com.little.smile.personalSpringProject.util.annotation.LogAnnotation;
import com.little.smile.personalSpringProject.util.base.LogRepository;
import com.little.smile.personalSpringProject.util.enums.LogStatus;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * LogAspect
 *
 * @author yj632
 * @since 2020-12-07
 */
@Aspect
@Slf4j
public class LogAspect {
    // 获取springBean
    private static ConfigurableApplicationContext configurableApplicationContext;
    @Pointcut(value = "@annotation(logAnnotation)")
    public void doLog(LogAnnotation logAnnotation){
    }

    @Around(value = "doLog(logAnnotation)", argNames = "proceedingJoinPoint,logAnnotation")
    public Object logAspect(ProceedingJoinPoint proceedingJoinPoint,LogAnnotation logAnnotation) throws Throwable {
        String logInfo = logAnnotation.value();
        Object repository = null;
        if (!logAnnotation.repository().equals(String.class)) {
            repository = getRepository(logAnnotation.repository());
        }
        log.info("start running the {} method",logInfo);
        try {
            Object o = proceedingJoinPoint.proceed();
            log.info("running method ======> {} success  !!!!",logInfo);
            return o;
        } catch (Throwable throwable) {
            log.error("running method =====> {} error!!!!!!!!!",logInfo);
            throw throwable;
        }
    }

    private Object getRepository(Class clazz) {
        return configurableApplicationContext.getBean(clazz);
    }

    private void saveLog(ProceedingJoinPoint proceedingJoinPoint,
                         LogAnnotation logAnnotation, Object repository, LogStatus logStatus){
        if (null == repository) {
            return;
        }
        if (repository instanceof LogRepository) {

        }

    }
}
