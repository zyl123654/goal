package com.jmd.goal.dto;

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
public class TestQueryReq {
    Long total;

    Integer pageSize;
    Integer pageNo;
    String testId;
    String testUid;
    LocalDateTime dateTime;
    BigDecimal money;
    TestEnum state;
}
