package com.jmd.goal.enums;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * @author Cao Fuqiang
 */
public interface BaseEnum<E extends Enum<?>,T> extends Serializable {
    public String getLabel();
    public T getValue();

    @Override
    public String toString();
}
