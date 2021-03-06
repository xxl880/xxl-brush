package com.xxl.brush.time;

import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.RandomTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *  App自动化操作手机
 */
@Component
public class AppSchedule {
  private static final Logger log = LoggerFactory.getLogger(AppSchedule.class);
    //增加全局map事件处理，用于保存数据
    Map<String,Integer> map = new HashMap<String,Integer>();


    @Autowired
    private AppService appService;


    /**
     * todo 循环收取金币 定时器启动
     * 执行时间 每隔60分钟
     */
     @Scheduled(cron = "0 20 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23 * * ?")
    public void circulate(){
        log.info("********************循环收取金币 定时器启动**************************");
        List<String> list = AdbTools.getAndroidId();
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                appService.circulate(androidId,list.indexOf(androidId));
            }
        }


    }












}

