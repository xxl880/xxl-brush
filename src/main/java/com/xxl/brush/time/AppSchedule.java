package com.xxl.brush.time;

import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.RandomTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.awt.*;


/**
 *  App自动化操作手机
 */
@Component
public class AppSchedule {
  private static final Logger log = LoggerFactory.getLogger(AppSchedule.class);

    @Autowired
    private AppService appService;


    /**
     * todo 3.1-循环收取金币大于200金币
     * 执行时间 00：00-6：00，10：00-11：00，12：00-19：00，20：00-23：00
     */
    @Scheduled(cron = "0 0/59 * * * ?")
    public void circulate() throws AWTException {
        log.info("********************3.1-循环收取金币大于200金币 定时器启动**************************");
        appService.circulate("phone001");
        appService.circulate("phone002");
        appService.circulate("phone003");
        appService.circulate("phone0031");
        appService.circulate("phone0032");
        appService.circulate("phone0033");
        appService.circulate("phone0034");
        appService.circulate("phone0035");


    }











}

