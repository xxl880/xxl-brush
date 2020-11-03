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

    @GetMapping("start")
    @ApiOperation("羊毛")
    public BaseResponse start() throws AWTException {
     /*   appService.start("phone001");
        appService.start("phone002");*/
        appService.start("phone003");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section1")
    @ApiOperation("羊毛")
    public BaseResponse section1() throws AWTException {
      /*  appService.section1("phone001");
        appService.section1("phone002");*/
        appService.section1("phone003");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section2")
    @ApiOperation("羊毛")
    public BaseResponse section2() throws AWTException {
      /*  appService.section2("phone001");
        appService.section2("phone002");*/
        appService.section2("phone003");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section3")
    @ApiOperation("羊毛")
    public BaseResponse section3() throws AWTException {
      /*  appService.section3("phone001");
        appService.section3("phone002");*/
        appService.section3("phone003");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section4")
    @ApiOperation("羊毛")
    public BaseResponse section4() throws AWTException {
      /*  appService.section4("phone001");
        appService.section4("phone002");*/
        appService.section4("phone003");
        return BaseResponse.newSuccess();
    }

    @GetMapping("circulate")
    @ApiOperation("羊毛")
    public BaseResponse circulate() throws AWTException {
      /*  appService.circulate("phone001");
        appService.circulate("phone002");*/
        appService.circulate("phone003");
        return BaseResponse.newSuccess();
    }

 

}
