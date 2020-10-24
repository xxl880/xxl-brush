package com.xxl.brush.controller;

import com.xxl.brush.app.*;
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


    //************************一种类型：签到********************************************************
    @GetMapping("start")
    @ApiOperation("1-签到")
    public BaseResponse start() throws AWTException {
        Robot robot = new Robot();
      /*  App抖音极速.handle(robot,"phone003");
        App火山极速.handle(robot,"phone003");
        App快手极速.handle(robot,"phone003");
        App今日头条.handle(robot,"phone003");
        App趣头条.handle(robot,"phone003");
        AppQQ阅读.handle(robot,"phone003");
        App火山小说.handle(robot,"phone003");
        AppNOW直播.handle(robot,"phone003");
        App搜狗.handle(robot,"phone003");*/
        App拼多多.handle(robot,"phone003");

        return BaseResponse.newSuccess();
    }


    //************************二种类型：分段（一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）*****************************************
    @GetMapping("section1")
    @ApiOperation("2.1-早上8:00-9:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）")
    public BaseResponse section1() {
        appService.section1("phone001");
        appService.section1("phone002");
        appService.section1("phone003");
        appService.section1("phone0031");
        appService.section1("phone0032");
        appService.section1("phone0033");
        appService.section1("phone0034");
        appService.section1("phone0035");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section2")
    @ApiOperation("2.2-中午11：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）")
    public BaseResponse section2() {
        appService.section2("phone001");
        appService.section2("phone002");
        appService.section2("phone003");
        appService.section2("phone0031");
        appService.section2("phone0032");
        appService.section2("phone0033");
        appService.section2("phone0034");
        appService.section2("phone0035");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section3")
    @ApiOperation("2.3-下午19：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）")
    public BaseResponse section3() {
        appService.section3("phone001");
        appService.section3("phone002");
        appService.section3("phone003");
        appService.section3("phone0031");
        appService.section3("phone0032");
        appService.section3("phone0033");
        appService.section3("phone0034");
        appService.section3("phone0035");
        return BaseResponse.newSuccess();
    }

    @GetMapping("section4")
    @ApiOperation("2.4-晚上23：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）")
    public BaseResponse section4() {
        appService.section4("phone001");
        appService.section4("phone002");
        appService.section4("phone003");
        appService.section4("phone0031");
        appService.section4("phone0032");
        appService.section4("phone0033");
        appService.section4("phone0034");
        appService.section4("phone0035");
        return BaseResponse.newSuccess();
    }


    //*************************三种类型：循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)********************************************************
    @GetMapping("circulate1")
    @ApiOperation("3.1-循环收取金币大于200金币")
    public BaseResponse circulate1() {
        appService.circulate1("phone001");
        appService.circulate1("phone002");
        appService.circulate1("phone003");
        appService.circulate1("phone0031");
        appService.circulate1("phone0032");
        appService.circulate1("phone0033");
        appService.circulate1("phone0034");
        appService.circulate1("phone0035");

        return BaseResponse.newSuccess();
    }


    @GetMapping("circulate2")
    @ApiOperation("3.2-循环收取金币小于200金币")
    public BaseResponse circulate2() {
        appService.circulate2("phone001");
        appService.circulate2("phone002");
        appService.circulate2("phone003");
        appService.circulate2("phone0031");
        appService.circulate2("phone0032");
        appService.circulate2("phone0033");
        appService.circulate2("phone0034");
        appService.circulate2("phone0035");
        return BaseResponse.newSuccess();
    }

}
