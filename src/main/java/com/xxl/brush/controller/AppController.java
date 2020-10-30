package com.xxl.brush.controller;

import com.xxl.brush.app.*;
import com.xxl.brush.app.medias.*;
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
        App抖音极速.handle(robot,"phone003");
        App火山极速.handle(robot,"phone003");
        App快手极速.handle(robot,"phone003");
        App今日头条.handle(robot,"phone003");
        App趣头条.handle(robot,"phone003");
        AppQQ阅读.handle(robot,"phone003");
        App火山小说.handle(robot,"phone003");
        AppNOW直播.handle(robot,"phone003");
        App搜狗.handle(robot,"phone003");
        App拼多多.handle(robot,"phone003");
        App微博.handle(robot,"phone003");
        App书旗小说.handle(robot,"phone003");
        App番茄小说.handle(robot,"phone003");
        App奇热小说.handle(robot,"phone003");
        App抖音火山.handle(robot,"phone003");
        App晴象浏览器.handle(robot,"phone003");
        App米读小说.handle(robot,"phone003");
        App必看小说.handle(robot,"phone003");
        App牛角小说.handle(robot,"phone003");
        App2345浏览器.handle(robot,"phone003");
        App刷宝视频.handle(robot,"phone003");
        App小吃货视频.handle(robot,"phone003");
        App火火视频.handle(robot,"phone003");
        App红包视频.handle(robot,"phone003");
        App彩蛋视频.handle(robot,"phone003");
        App热火视频.handle(robot,"phone003");
        App长豆视频.handle(robot,"phone003");









        return BaseResponse.newSuccess();
    }

 

}
