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
public enum TestEnum implements BaseEnum{
    STAUTS1(1,"描述1"),
    STAUTS2(2,"描述1"),
    STAUTS3(4,"描述1"),
    STAUTS4(8,"描述1");
    Integer value;
    String label;

    TestEnum(String label,Integer value){
        this.label = label;
        this.value = value;
    }

    @Override
    public String toString() {
        return  value.toString() ;
    }
}
