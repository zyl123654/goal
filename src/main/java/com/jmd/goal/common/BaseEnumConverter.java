package com.jmd.goal.common;

import com.jmd.goal.enums.BaseEnum;
import lombok.NonNull;
import lombok.SneakyThrows;

/**
 * @author Cao Fuqiang
 */
@SuppressWarnings("rawtypes")
public interface BaseEnumConverter<E extends BaseEnum> {
    /**
     * set {@link BaseEnum} class
     *
     * @param enumClass {@link BaseEnum} class
     */
    void setEnumClass(Class<E> enumClass);

    /**
     * get {@link BaseEnum} value class
     *
     * @return {@link BaseEnum} value class
     */
    Class<?> getValueClass();

    /**
     * set {@link BaseEnum} value class
     *
     * @param valueClass {@link BaseEnum} value class
     */
    void setValueClass(Class<?> valueClass);

    /**
     * initialization
     *
     * @param enumClass {@link BaseEnum} class
     */
    @SneakyThrows
    default void initialize(@NonNull Class<E> enumClass) {
        setEnumClass(enumClass);
//        setValueClass(enumClass.getMethod(BaseEnum.METHOD_NAME).getReturnType());
        if (!isType(Integer.class) && !isType(String.class)) {
            throw new IllegalArgumentException(
                    String.format("BaseEnum %s's value type is %s, but value type must be Integer or String",
                            enumClass.getName(),
                            getValueClass().getSimpleName()));
        }
    }

    /**
     * check if value class equals expected class
     *
     * @param clazz expected class
     * @return is clazz Type
     */
    default boolean isType(@NonNull Class<?> clazz) {
        return clazz.isAssignableFrom(getValueClass());
    }
}
