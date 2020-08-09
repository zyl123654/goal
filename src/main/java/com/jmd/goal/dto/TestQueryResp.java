package com.jmd.goal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestQueryResp {
    Long total;
    Integer pageSize;
    Integer pageNo;
    List<TestVo> testVos;
}
