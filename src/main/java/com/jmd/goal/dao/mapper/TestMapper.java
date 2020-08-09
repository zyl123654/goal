package com.jmd.goal.dao.mapper;

import com.jmd.goal.dao.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@Repository
@Mapper
public interface TestMapper {
    @Select({
            "<script>",
            "select * from TEST",
            "<where>",
            "   <if test='null != testId'>",
            "       TEST_ID = #{testId, jdbcType=VARCHAR}",
            "   </if>",
            "</where>",
            "order by DATETIME desc",
            "</script>"
    })
    List<Test> listByPage(Test test);
}
