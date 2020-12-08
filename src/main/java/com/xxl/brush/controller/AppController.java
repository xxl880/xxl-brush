package com.xxl.brush.controller;

import com.xxl.brush.response.BaseResponse;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AdbTools;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/app")
@Api(tags = "app-控制器")
public class AppController {
    @Autowired
    private AppService appService;

    @GetMapping("circulate")
    @ApiOperation("羊毛")
    public BaseResponse circulate(){
        List<String> list = AdbTools.getAndroidId();
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                appService.circulate(androidId);
            }
        }
        return BaseResponse.newSuccess();
    }

    @GetMapping("capture")
    @ApiOperation("获取所有手机界面截图")
    public BaseResponse capture(){
        List<String> list = AdbTools.getAndroidId();
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                appService.capture(androidId);
            }
        }
        return BaseResponse.newSuccess();
    }

    @GetMapping("tap")
    @ApiOperation("指定某个手机点击某个位置")
    public BaseResponse tap(@ApiIgnore @RequestParam Map<String, Object> params){
        String androidId = MapUtils.getString(params,"androidId");
        String x = MapUtils.getString(params,"x");
        String y = MapUtils.getString(params,"y");
        AdbTools.tap(androidId,Integer.valueOf(x), Integer.valueOf(y));
        return BaseResponse.newSuccess();
    }

    @GetMapping("swipe")
    @ApiOperation("指定某个手机滑动")
    public BaseResponse swipe(@ApiIgnore @RequestParam Map<String, Object> params){
        String androidId = MapUtils.getString(params,"androidId");
        AdbTools.swipe(androidId);
        return BaseResponse.newSuccess();
    }


    @GetMapping("cache")
    @ApiOperation("清除手机缓存")
    public BaseResponse cache(){
        List<String> list = AdbTools.getAndroidId();
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                appService.cache(androidId);
            }
        }
        return BaseResponse.newSuccess();
    }


}
