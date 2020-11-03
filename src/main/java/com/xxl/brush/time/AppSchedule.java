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



//************************一种类型：签到********************************************************
    /**
     * todo 1-签到00:00-1:00
     */
     @Scheduled(cron = "0 0 0 * * ?")
    public void start() throws AWTException {
        log.info("********************1-签到00:00-2:00定时器启动**************************");
        Robot robot = new Robot();
         robot.delay(RandomTools.init(6000));
         appService.start("phone001");
         appService.start("phone002");
         appService.start("phone003");
         appService.start("phone0031");
         appService.start("phone0032");
         appService.start("phone0033");
         appService.start("phone0034");
         appService.start("phone0035");


     }

//************************二种类型：分段（一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）*****************************************
    /**
     * todo 2.1-早上6:00-8:00  （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
     */
    @Scheduled(cron = "0 0 6 * * ?")
    public void section1() throws AWTException {
        log.info("********************2.1-早上8:00-10:00  （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）定时器启动**************************");
        Robot robot = new Robot();
        robot.delay(RandomTools.init(6000));
        appService.section1("phone001");
        appService.section1("phone002");
        appService.section1("phone003");
        appService.section1("phone0031");
        appService.section1("phone0032");
        appService.section1("phone0033");
        appService.section1("phone0034");
        appService.section1("phone0035");



    }


    /**
     * todo 2.2-中午10：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     */
    @Scheduled(cron = "0 0 10 * * ?")
    public void section2() throws AWTException {
        log.info("********************2.2-中午11：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）定时器启动**************************");
        Robot robot = new Robot();
        robot.delay(RandomTools.init(6000));
        appService.section2("phone001");
        appService.section2("phone002");
        appService.section2("phone003");
        appService.section2("phone0031");
        appService.section2("phone0032");
        appService.section2("phone0033");
        appService.section2("phone0034");
        appService.section2("phone0035");



    }

    /**
     *  todo 2.3-下午18：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     */
    @Scheduled(cron = "0 0 18 * * ?")
    public void section3() throws AWTException {
        log.info("********************2.3-下午19：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）定时器启动**************************");
        Robot robot = new Robot();
        robot.delay(RandomTools.init(6000));
        appService.section3("phone001");
        appService.section3("phone002");
        appService.section3("phone003");
        appService.section3("phone0031");
        appService.section3("phone0032");
        appService.section3("phone0033");
        appService.section3("phone0034");
        appService.section3("phone0035");



    }

    /**
     * todo 2.4-晚上22：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
     */
    @Scheduled(cron = "0 0 22 * * ?")
    public void section4() throws AWTException {
        log.info("********************2.4-晚上23：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）定时器启动**************************");
        Robot robot = new Robot();
        robot.delay(RandomTools.init(6000));
        appService.section4("phone001");
        appService.section4("phone002");
        appService.section4("phone003");
        appService.section4("phone0031");
        appService.section4("phone0032");
        appService.section4("phone0033");
        appService.section4("phone0034");
        appService.section4("phone0035");




    }

    /**
     * todo 3.1-循环收取金币大于200金币
     * 执行时间 00：00-6：00，10：00-11：00，12：00-19：00，20：00-23：00
     */
    @Scheduled(cron = "0 0 2,4,8,12,14,16,20 * * ?")
    public void circulate1() throws AWTException {
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

