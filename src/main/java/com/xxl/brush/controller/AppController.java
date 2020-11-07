package com.xxl.brush.controller;

import com.xxl.brush.response.BaseResponse;
import com.xxl.brush.service.AppService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.*;

@RestController
@RequestMapping(value = "/app")
@Api(tags = "app-控制器")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("circulate")
    @ApiOperation("羊毛")
    public BaseResponse circulate() throws AWTException {
        appService.circulate("phone001");
        appService.circulate("phone002");
         appService.circulate("phone003");
        appService.circulate("phone0031");
        appService.circulate("phone0032");
        return BaseResponse.newSuccess();
    }

 

}
