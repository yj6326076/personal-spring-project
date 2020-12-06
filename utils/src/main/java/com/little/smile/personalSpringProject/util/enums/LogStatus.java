/*
 * this is little boy's personal project,right received by yj6326076@hotmail.com from 2020 to 2020
 */

package com.little.smile.personalSpringProject.util.enums;

import lombok.Getter;

/**
 * LogStatus
 *
 * @author yj6326076
 * @since 2020-12-07
 */
@Getter
public enum LogStatus {
    // 成功
    SUCCESS("success"),
    // 失败
    ERROR("error"),
    // 开始
    START("start"),
    // 运行中
    RUNNING("running");
    private final String status;
    LogStatus(String status) {
        this.status = status;
    }
}
