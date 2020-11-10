package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App抖音极速 {
    private static Logger log = LoggerFactory.getLogger(App抖音极速.class);

    /**
     * todo 循环(用户行为-开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下e不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort){
        try{
            log.info("********************************抖音极速操作********************************************");
            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup抖音);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            log.info("4.清除");
            AdbTools.clear(driver);
            clear(robot,driver);

            handle2(robot, androidId, driver);

            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 2140));
            }else{
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1950));
            }
        /*    try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                AdbTools.process(robot, AdbTools.tap(androidId, 540, wl.getLocation().getY() + 20));
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 2140));
            }*/

            handle1(robot, androidId, driver);

            handle9(robot,androidId,driver);
            handle6(robot,androidId,driver);

            handle12(robot,androidId,driver);
            handle16(robot,androidId,driver);
            handle11(robot,androidId,driver);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * todo 退出
     * @param robot
     */
    public static void quit(Robot robot,AndroidDriver driver){

    }

    /**
     * todo 清除
     * @param robot
     */
    public static void clear(Robot robot,AndroidDriver driver){
        try{
            WebElement wl11 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"以后再说\")");
            wl11.click();
        }catch (Exception e){}

    }


    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-签到");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            try {
                List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().text(\"签到\")");
                wls.get(1).click();
            }catch (Exception e){}

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即签到\")");
                wl1.click();
            }catch (Exception e){}

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看广告视频再赚\")");
            wl2.click();
            robot.delay(36000);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音极速-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-看视频");
        try {
            int x = RandomTools.init(6)+6;
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("抖音极速-看视频异常");
        }
    }


    /**
     * todo 3.看小视频
     * @param robot
     */
    public static void handle3(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 4.看新闻
     * @param robot
     */
    public static void handle4(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-看广告");
        try{
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"每20分钟完成一次广告任务，单日最高可赚21960金币\").fromParent(text(\"去领取\"))");
            wl2.click();
            robot.delay(36000);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音极速-看广告异常");
        }

    }

    /**
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(Robot robot,String androidId,  AndroidDriver driver){

    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-开宝箱");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();
            robot.delay(1000);
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1290));
            }else{
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1190));
            }
/*
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看广告视频再赚\")");
            wl3.click();*/
            robot.delay(36000);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音极速-开宝箱异常");
        }
    }


    /**
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 11.睡觉
     * @param robot
     */
    public static void handle11(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-睡觉");
        int hour = LocalDateTime.now().getHour();
        if(hour==22) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                WebElement wl2 = null;
                try {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"睡觉可以赚钱啦！快来开启吧\").fromParent(text(\"去查看\"))");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"睡觉可以赚钱啦！快来开启吧\").fromParent(text(\"去查看\"))");
                }
                wl2.click();

                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"我要睡了\")");
                wl3.click();

                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                log.info("抖音极速-睡觉异常");
            }
        }

    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-走路");
        int hour = LocalDateTime.now().getHour();
       if(hour==20) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                WebElement wl2 = null;
                try {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"走得越多赚的越多\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"走得越多赚的越多\")");
                }
                wl2.click();

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看广告视频可领\")");
                    wl3.click();
                    robot.delay(36000);
                    AdbTools.process(robot, operateBack);
                } catch (Exception e) {
                    try {
                        WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                        wl4.click();
                        robot.delay(36000);
                        AdbTools.process(robot, operateBack);
                    } catch (Exception e1) {
                    }
                }
                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                log.info("抖音极速-走路异常");
            }
       }

    }


    /**
     * todo 13.喝水
     * @param robot
     */
    public static void handle13(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 14.充电
     * @param robot
     */
    public static void handle14(Robot robot,String androidId,  AndroidDriver driver){

    }

    /**
     * todo 15.听歌曲
     * @param robot
     */
    public static void handle15(Robot robot,String androidId,  AndroidDriver driver){

    }

    /**
     * todo 16.吃饭
     * @param robot
     */
    public static void handle16(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-吃饭");
      int hour = LocalDateTime.now().getHour();
      if(hour==8||hour==12||hour==18||hour==22) {
             try {
                 String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                 WebElement wl2 = null;
                 try {
                     AdbTools.process(robot, AdbTools.upPage(androidId));
                     wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"限时福利，每天饭点领补贴\").fromParent(text(\"去领取\"))");
                 } catch (Exception e) {
                     AdbTools.process(robot, AdbTools.downPage(androidId));
                     wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"限时福利，每天饭点领补贴\").fromParent(text(\"去领取\"))");
                 }
                 wl2.click();

                 WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                 wl3.click();

                 AdbTools.process(robot, operateBack);
             } catch (Exception e) {
                 log.info("抖音极速-吃饭异常");
             }
         }

    }

    /**
     * todo 17.分享
     * @param robot
     */
    public static void handle17(Robot robot,String androidId,  AndroidDriver driver){

    }

    /**
     * todo 18.摇钱树
     * @param robot
     */
    public static void handle18(Robot robot,String androidId,  AndroidDriver driver){

    }

    /**
     * todo 19.刮奖
     * @param robot
     */
    public static void handle19(Robot robot,String androidId,  AndroidDriver driver){

    }






    public static void main(String args[]) throws AWTException {
        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);

    }



}


