package com.xxl.brush.controller;

import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.response.BaseResponse;
import com.xxl.brush.service.AppService;
import com.xxl.brush.service.InstallService;
import com.xxl.brush.tools.AdbTools;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/install")
@Api(tags = "install-控制器")
public class InstallController {

    @Autowired
    private InstallService installService;

    @GetMapping("process")
    @ApiOperation("安装app")
    public BaseResponse process(){
        java.util.List<String> list =  AdbTools.getAndroidId();
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                installService.process(androidId);
            }
        }

        return BaseResponse.newSuccess();
    }

 

}
