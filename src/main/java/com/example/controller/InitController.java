package com.example.controller;

import com.example.service.InitService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @program: nox
 * @description: 初始化
 * @author: loy
 * @create: 2018-07-23 14:46
 **/
@RestController
@RequestMapping("/v1/init")
@Api(value = "初始化",description = "初始化服务接口")
@Validated
public class InitController {

    @Autowired
    private InitService initService;

    @ApiOperation(value = "测试",notes = "测试")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test(
    ) throws IOException {
        return initService.test();
    }
}
