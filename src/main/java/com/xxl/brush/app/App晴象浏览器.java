package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * todo AppApp晴象浏览器
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App晴象浏览器 {
    private static Logger log = LoggerFactory.getLogger(App晴象浏览器.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==1||hour==2||hour==3) {
            try {
                log.info("********************************App晴象浏览器操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(robot, androidId);

                log.info("2.启动app");
                AdbTools.startup(robot, androidId, AppConstants.startup晴象);

                log.info("3.启动appium");
                AndroidDriver driver = AppiumTools.init(androidId, port, systemPort);
                AdbTools.clear(driver);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.process(robot, AdbTools.tap(androidId, 970, y));
                handle1(robot, androidId, driver, map);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate1(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.process(robot, AdbTools.tap(androidId, 110, y));
            handle8(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate2(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.process(robot, AdbTools.tap(androidId, 110, y));
            handle81(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate3(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.process(robot, AdbTools.tap(androidId, 110, y));
            handle82(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate4(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }

            AdbTools.process(robot, AdbTools.tap(androidId, 110, y));
            handle83(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate5(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 110, y));

            handle84(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate6(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            handle10(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate7(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            handle19(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * todo 退出
     * @param robot

     */
    public static void quit(Robot robot, AndroidDriver driver, String androidId){
        int y = 110;
        int y1 = 1780;
        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
            y = 180;
            y1 = 1890;
        }
        AdbTools.process(robot, AdbTools.tap(androidId, 960, y));
        if(androidId.equals(PhoneConstants.phone001)) {
            robot.delay(1000);
            AdbTools.process(robot, AdbTools.tap(androidId, 540, y1));
        }
    }


    /**
     * todo 清除
     * @param robot

     */
    public static void clear(Robot robot, AndroidDriver driver){

    }



    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-签到");
        try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看视频金币翻倍\")");
            wl1.click();
            robot.delay(36000);
            quit(robot,driver,androidId);

        }catch (Exception e){
            log.info("App晴象浏览器-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-看视频");
        try {

            try{
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频\")");
                wl1.click();
                robot.delay(59000);

                WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl6.click();

                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

            int x = RandomTools.init(6);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("App晴象浏览器-看视频异常");
        }
    }


    /**
     * todo 3.看小视频
     * @param robot
     */
    public static void handle3(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 4.看新闻
     * @param robot
     */
    public static void handle4(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){


    }

    /**
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-红包");
        try {
            //App晴象浏览器-左上方红包异常
                robot.delay(2000);
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, 240, 170));
                robot.delay(59000);
                quit(robot, driver, androidId);
        }catch (Exception e){
            log.info("App晴象浏览器-红包异常");
        }

    }

    /**
     * todo 8.1领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle81(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-红包");
        try {
            //App晴象浏览器-左下方红包异常
            try {
                robot.delay(2000);
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, 150, 410));
                robot.delay(59000);
                quit(robot, driver, androidId);
            }catch (Exception e){log.info("App晴象浏览器-左下方红包异常");}

        }catch (Exception e){
            log.info("App晴象浏览器-红包异常");
        }

    }


    /**
     * todo 8.2领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle82(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-红包");
        //App晴象浏览器-右上方红包异常
        try {
            robot.delay(2000);
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, 610, 170));
            robot.delay(59000);
            quit(robot, driver, androidId);
        }catch (Exception e){log.info("App晴象浏览器-右上方红包异常");}

    }

    /**
     * todo 8.3领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle83(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-红包");
        //App晴象浏览器-右下方红包异常
        try {
            robot.delay(2000);
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, 930, 410));
            robot.delay(59000);
            quit(robot, driver, androidId);
        }catch (Exception e){log.info("App晴象浏览器-右下方红包异常");}

    }

    /**
     * todo 8.4领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle84(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-红包");
        //App晴象浏览器-右下下方红包异常
        try {
            robot.delay(2000);
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, 700, 410));
            robot.delay(59000);
            quit(robot, driver, androidId);
        }catch (Exception e){log.info("App晴象浏览器-右下下方红包异常");}

    }

    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-抽奖");
        try {
            int y = 1950;
            int y1 = 840;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
                y1 = 940;
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 540, y));

            AdbTools.process(robot, AdbTools.tap(androidId, 540, 1540));
            robot.delay(6000);
            AdbTools.process(robot, AdbTools.tap(androidId, 540, y1));
            robot.delay(59000);

            quit(robot,driver,androidId);
        }catch (Exception e){
            log.info("App晴象浏览器-抽奖异常");
        }
    }


    /**
     * todo 11.睡觉
     * @param robot
     */
    public static void handle11(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){


    }


    /**
     * todo 13.喝水
     * @param robot
     */
    public static void handle13(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 14.充电
     * @param robot
     */
    public static void handle14(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 15.听歌曲
     * @param robot
     */
    public static void handle15(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 16.吃饭
     * @param robot
     */
    public static void handle16(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){


    }

    /**
     * todo 17.分享
     * @param robot
     */
    public static void handle17(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 18.摇钱树
     * @param robot
     */
    public static void handle18(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 19.刮奖
     * @param robot
     */
    public static void handle19(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-刮奖");
        try {
            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 320, y));

            robot.delay(1000);
            AdbTools.process(robot, AdbTools.tapDraw(androidId, 80, 1310));

            robot.delay(3000);
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 830));
            }else {
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 940));
            }
            robot.delay(59000);

            quit(robot,driver,androidId);

        }catch (Exception e){
            log.info("App晴象浏览器-刮奖异常");
        }
    }



    /**
     * todo 20.打卡
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App晴象浏览器-打卡");
        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"打卡赚钱\")");
            wl2.click();

            try {
                WebElement wl33 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/close\")");
                wl33.click();
            }catch (Exception e){}

            List<WebElement> wl4 = null;
            try {
                wl4 = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"去补卡\")");
            }catch (Exception e){
                try {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl4 = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"去补卡\")");
                }catch (Exception e1){
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl4 = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"去补卡\")");
                }
            }
            for(WebElement wl :wl4){
                wl.click();
                robot.delay(2000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看视频金币翻倍\")");
                wl1.click();
                robot.delay(59000);

                quit(robot,driver,androidId);
            }



        }catch (Exception e){
            log.info("App晴象浏览器-打卡异常");
        }
    }



/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


