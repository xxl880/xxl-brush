package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.RandomTools;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;

/*
*
 * todo AppApp晴象浏览器
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App晴象浏览器 {
    private static Logger log = LoggerFactory.getLogger(App晴象浏览器.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
            try {
                log.info("********************************App晴象浏览器操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup晴象);

                AdbTools.clear(androidId);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 970, y);
                handle1(androidId);
            } catch (Exception e) {
                e.printStackTrace();
            }

    }

/*
*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/


    public static void circulate1(String androidId){
        try {
                log.info("********************************App晴象浏览器操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup晴象);

                AdbTools.clear(androidId);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }

                AdbTools.tap(androidId, 110, y);
                handle8(androidId);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
/*
*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/


    public static void circulate2(String androidId){
        AppTools.appTime();
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup晴象);

            AdbTools.clear(androidId);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.tap(androidId, 110, y);
            handle81(androidId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
/*

*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
*/


    public static void circulate3( String androidId){
        AppTools.appTime();
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup晴象);

            AdbTools.clear(androidId);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.tap(androidId, 110, y);
            handle82(androidId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

/*
*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/


    public static void circulate4( String androidId){
        AppTools.appTime();
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup晴象);

            AdbTools.clear(androidId);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.tap(androidId, 110, y);
            handle83(androidId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/


    public static void circulate5( String androidId){
        AppTools.appTime();
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup晴象);

            AdbTools.clear(androidId);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.tap(androidId, 110, y);

            handle84(androidId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/


    public static void circulate6( String androidId){
        AppTools.appTime();
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup晴象);

            log.info("3.清除");
            AdbTools.clear(androidId);

            handle10(androidId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

/*
*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
*/


    public static void circulate7(String androidId){
        AppTools.appTime();
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup晴象);

            log.info("3.清除");
            AdbTools.clear(androidId);

            handle19(androidId);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


/**
     * todo 退出
     * @param */
    @SneakyThrows
    public static void quit(String androidId){
        int y = 110;
        int y1 = 1780;
        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
            y = 180;
            y1 = 1890;
        }
        AdbTools.tap(androidId, 960, y);
        if(androidId.equals(PhoneConstants.phone001)) {
            Thread.sleep(1000);
            AdbTools.tap(androidId, 540, y1);
        }
    }


/*
*
     * todo 清除
     * @param 
*/
    public static void clear(String androidId){

    }



/*
*
     * todo 1.签到
     * @param 
*/
    public static void handle1( String androidId){
        log.info("App晴象浏览器-签到");
        try {
     /*
            Thread.sleep(36000);
            quit(androidId);*/

        }catch (Exception e){
            log.info("App晴象浏览器-签到异常");
        }
    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2( String androidId){
        log.info("App晴象浏览器-看视频");
        try {

            int x = RandomTools.init(6);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("App晴象浏览器-看视频异常");
        }
    }


/*
*
     * todo 3.看小视频
     * @param 
*/


    public static void handle3( String androidId){

    }


/**
     * todo 4.看新闻
     * @param */


    public static void handle4( String androidId){

    }


/**
     * todo 5.看小说
     * @param */


    public static void handle5( String androidId){

    }


/**
     * todo 6.看广告
     * @param */


    public static void handle6( String androidId){


    }

/**
     * todo 7.玩游戏
     * @param */


    public static void handle7( String androidId){

    }


/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param */


    public static void handle8( String androidId){
        log.info("App晴象浏览器-红包");
        try {
            //App晴象浏览器-左上方红包异常
                Thread.sleep(2000);
                AdbTools.upPage(androidId);
                AdbTools.tap(androidId, 240, 170);
                Thread.sleep(59000);
                quit( androidId);
        }catch (Exception e){
            log.info("App晴象浏览器-红包异常");
        }

    }

/**
     * todo 8.1领红包(操作流程：1-点击红包，2-看广告)
     * @param */
    public static void handle81( String androidId){
        log.info("App晴象浏览器-红包");
        try {
            //App晴象浏览器-左下方红包异常
            try {
                Thread.sleep(2000);
                AdbTools.upPage(androidId);
                AdbTools.tap(androidId, 150, 410);
                Thread.sleep(59000);
                quit( androidId);
            }catch (Exception e){log.info("App晴象浏览器-左下方红包异常");}

        }catch (Exception e){
            log.info("App晴象浏览器-红包异常");
        }

    }


/*
*
     * todo 8.2领红包(操作流程：1-点击红包，2-看广告)
     * @param 
*/
    public static void handle82( String androidId){
        log.info("App晴象浏览器-红包");
        //App晴象浏览器-右上方红包异常
        try {
            Thread.sleep(2000);
            AdbTools.upPage(androidId);
            AdbTools.tap(androidId, 610, 170);
            Thread.sleep(59000);
            quit( androidId);
        }catch (Exception e){log.info("App晴象浏览器-右上方红包异常");}

    }

/**
     * todo 8.3领红包(操作流程：1-点击红包，2-看广告)
     * @param */


    public static void handle83( String androidId){
        log.info("App晴象浏览器-红包");
        //App晴象浏览器-右下方红包异常
        try {
            Thread.sleep(2000);
            AdbTools.upPage(androidId);
            AdbTools.tap(androidId, 930, 410);
            Thread.sleep(59000);
            quit( androidId);
        }catch (Exception e){log.info("App晴象浏览器-右下方红包异常");}

    }

/*
*
     * todo 8.4领红包(操作流程：1-点击红包，2-看广告)
     * @param 
*/
    public static void handle84( String androidId){
        log.info("App晴象浏览器-红包");
        //App晴象浏览器-右下下方红包异常
        try {
            Thread.sleep(2000);
            AdbTools.upPage(androidId);
            AdbTools.tap(androidId, 700, 410);
            Thread.sleep(59000);
            quit(androidId);
        }catch (Exception e){log.info("App晴象浏览器-右下下方红包异常");}

    }

/**
     * todo 9.开宝箱
     * @param */
    public static void handle9( String androidId){

    }

/*
*
     * todo 10.抽奖
     * @param */
    public static void handle10( String androidId){
        log.info("App晴象浏览器-抽奖");
        try {
            int y = 1950;
            int y1 = 840;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
                y1 = 940;
            }
            AdbTools.tap(androidId, 540, y);

            AdbTools.tap(androidId, 540, 1540);
            Thread.sleep(6000);
            AdbTools.tap(androidId, 540, y1);
            Thread.sleep(59000);

            quit(androidId);
        }catch (Exception e){
            log.info("App晴象浏览器-抽奖异常");
        }
    }


/**
     * todo 11.睡觉
     * @param */
    public static void handle11( String androidId){

    }

/**
     * todo 12.走路
     * @param */


    public static void handle12( String androidId){


    }


/**
     * todo 13.喝水
     * @param */


    public static void handle13( String androidId){

    }


/**
     * todo 14.充电
     * @param */


    public static void handle14( String androidId){

    }

/*
*
     * todo 15.听歌曲
     * @param 
*/


    public static void handle15( String androidId){

    }

/**
     * todo 16.吃饭
     * @param */


    public static void handle16( String androidId){


    }

/**
     * todo 17.分享
     * @param */


    public static void handle17( String androidId){

    }

/**
     * todo 18.摇钱树
     * @param */


    public static void handle18( String androidId){

    }
/*
*
     * todo 19.刮奖
     * @param */


    public static void handle19( String androidId){
        log.info("App晴象浏览器-刮奖");
        try {
            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.tap(androidId, 320, y);

            Thread.sleep(1000);
            AdbTools.tapDraw(androidId, 80, 1310);

            Thread.sleep(3000);
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId, 540, 830);
            }else {
                AdbTools.tap(androidId, 540, 940);
            }
            Thread.sleep(59000);

            quit(androidId);

        }catch (Exception e){
            log.info("App晴象浏览器-刮奖异常");
        }
    }


/*
*
     * todo 20.打卡
     * @param */


    public static void handle20( String androidId){
        log.info("App晴象浏览器-打卡");
        try {



        }catch (Exception e){
            log.info("App晴象浏览器-打卡异常");
        }
    }



}


