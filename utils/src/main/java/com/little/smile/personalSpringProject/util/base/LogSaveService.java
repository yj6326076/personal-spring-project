/*
 * this is little boy's personal project,right received by yj6326076@hotmail.com from 2020 to 2020
 */

package com.little.smile.personalSpringProject.util.base;

/**
 * 日志保存服务接口
 *
 * @author yj6326076
 * @since 2020-12-07
 */
public interface LogSaveService {
    /**
     * 保持所有日志
     * @param object 保存参数
     * @return 保存成功数量
     */
    int save(Object object);
}

