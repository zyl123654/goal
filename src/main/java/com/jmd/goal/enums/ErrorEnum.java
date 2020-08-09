package com.jmd.goal.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@AllArgsConstructor
@Getter
public enum ErrorEnum {
    SUCCESS(200,"成功"),
    ERROR_ONE(10000,"错误1"),
    ERROR_TWO(10001,"错误3"),
    ERROR_THREE(10002,"错误3");
    Integer value;
    String desc;
}
