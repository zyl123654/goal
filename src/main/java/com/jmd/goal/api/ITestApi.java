package com.jmd.goal.api;

import com.jmd.goal.common.ApiResult;
import com.jmd.goal.dto.TestQueryReq;
import com.jmd.goal.dto.TestQueryResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@RestController
public interface ITestApi {

    @GetMapping(value = "/test")
    ApiResult<TestQueryResp> test(TestQueryReq req);
}
