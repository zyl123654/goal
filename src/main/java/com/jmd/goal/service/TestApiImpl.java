package com.jmd.goal.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jmd.goal.api.ITestApi;
import com.jmd.goal.common.ApiResult;
import com.jmd.goal.dao.entity.Test;
import com.jmd.goal.dao.mapper.TestMapper;
import com.jmd.goal.dto.TestQueryReq;
import com.jmd.goal.dto.TestQueryResp;
import com.jmd.goal.dto.TestVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@Service
public class TestApiImpl implements ITestApi {
    @Autowired
    TestMapper testMapper;
    @Override
    public ApiResult<TestQueryResp> test(TestQueryReq req) {
        Integer pageNo = req.getPageNo();
        Integer pageSize = req.getPageSize();
        if (null == pageNo){
            pageNo = 1;
        }
        if (null == pageSize){
            pageSize = 10;
        }
        Test test = new Test();
        BeanUtils.copyProperties(req,test);
        PageHelper.startPage(pageNo, pageSize);
        List<Test> tests = testMapper.listByPage(test);
        PageInfo<Test> pageInfo = new PageInfo<> (tests);
        long total = pageInfo.getTotal();
        List<TestVo> testVos = new ArrayList<>();
        for (Test t : tests){
            TestVo tv = new TestVo();
            BeanUtils.copyProperties(t, tv);
            testVos.add(tv);
        }
        TestQueryResp resp = TestQueryResp.builder()
                .pageNo(pageNo)
                .pageSize(pageSize)
                .total(total)
                .testVos(testVos)
                .build();
        return ApiResult.success(resp);
    }
}
