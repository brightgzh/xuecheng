package com.xuecheng.orders.api;

import com.xuecheng.learning.mapper.XcCourseTablesMapper;
import com.xuecheng.learning.model.dto.XcCourseTablesDto;
import com.xuecheng.learning.model.po.XcCourseTables;
import com.xuecheng.learning.service.MyCourseTableService;
import io.swagger.annotations.ApiOperation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XuechengPlusOrdersApiApplicationTests {

    @Autowired
    private MyCourseTableService myCourseTableService;
    @Autowired
    private XcCourseTablesMapper xcCourseTablesMapper;
    @Test
    void testMyCourseService() {
        XcCourseTables select = xcCourseTablesMapper.select("50", 126L);
        System.out.println(select);
    }

}
