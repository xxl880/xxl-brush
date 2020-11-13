package com.xxl.brush.controller;

import com.xxl.brush.response.BaseResponse;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AdbTools;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/app")
@Api(tags = "app-控制器")
public class AppController {
    //增加全局map事件处理，用于保存数据
    Map<String,Integer> map = new HashMap<String,Integer>();


    @Autowired
    private AppService appService;

    @GetMapping("circulate")
    @ApiOperation("羊毛")
    public BaseResponse circulate() throws AWTException {
        List<String> list = AdbTools.getAndroidId();
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                appService.circulate(androidId,list.indexOf(androidId),map);
            }
        }
  /*      appService.circulate("phone001");*/
    //    appService.circulate("phone002");

        /*  appService.circulate("phone0031");
        appService.circulate("phone0032");*/
        return BaseResponse.newSuccess();
    }

 

}
