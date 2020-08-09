package com.jmd.goal.dao.entity;

import com.jmd.goal.enums.TestEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test {
    String testUid;
    String testId;
    LocalDateTime datetime;
    BigDecimal money;
    TestEnum state;
}
