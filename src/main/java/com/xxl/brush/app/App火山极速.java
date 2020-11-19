package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * todo App火山
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class App火山极速 {
    private static Logger log = LoggerFactory.getLogger(App火山极速.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){

        try {
                log.info("********************************火山极速操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(robot, androidId);

                log.info("2.启动app");
                AdbTools.startup(robot, androidId, AppConstants.startup火山);

                log.info("3.启动appium");
                AndroidDriver driver = AppiumTools.init(androidId, port, systemPort);

                log.info("4.清除");
                AdbTools.clear(driver);

                handle2(robot, androidId, driver, map);

                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.process(robot, AdbTools.tap(androidId, 680, 2140));
                } else {
                    AdbTools.process(robot, AdbTools.tap(androidId, 680, 1950));
                }
                clear(robot, androidId, driver);

                if(handle1(robot, androidId, driver, map)){
                    driver.runAppInBackground(Duration.ofSeconds(3));
                    handle1(robot, androidId, driver, map);
                }

                if(handle6(robot, androidId, driver, map)){
                    driver.runAppInBackground(Duration.ofSeconds(3));
                    handle6(robot, androidId, driver, map);
                }

                if(handle9(robot, androidId, driver, map)){
                    driver.runAppInBackground(Duration.ofSeconds(3));
                    handle9(robot, androidId, driver, map);
                }

                if(handle20(robot, androidId, driver, map)){
                    driver.runAppInBackground(Duration.ofSeconds(3));
                    handle20(robot, androidId, driver, map);
                }

                if(handle21(robot, androidId, driver, map)){
                    driver.runAppInBackground(Duration.ofSeconds(3));
                    handle21(robot, androidId, driver, map);
                }

                if(handle11(robot, androidId, driver, map)){
                    driver.runAppInBackground(Duration.ofSeconds(3));
                    handle11(robot, androidId, driver, map);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }







    /**
     * todo 退出
     * @param robot
     */
    public static void quit(Robot robot,AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 清除
     * @param robot
     */
    public static void clear(Robot robot,String androidId, AndroidDriver driver){
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.app.Dialog\").childSelector(text(\"sentinelEnd\"))");
            wl.click();
            robot.delay(1000);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){   }

    }



    /**
     * todo 1.签到
     * @param robot

     */
    public static boolean handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        boolean bool = false;
        AppTools.appTime();
        log.info("火山极速-签到");
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看广告 再领\")");
                wl1.click();
                robot.delay(32000);

                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                bool = true;
                log.info("火山极速-签到异常");
            }
            return bool;
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("火山极速-看视频");
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
            log.info("火山极速-看视频异常");
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
    public static boolean handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        boolean bool = false;
        log.info("火山极速-看广告");
        try{
            AdbTools.process(robot, AdbTools.upPage(androidId));

            String ykey = androidId+"火山极速-广告-y";
            Integer y = map.get(ykey);
            if(null==y) {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"看视频赚海量金币\")");
                y = wl2.getLocation().getY();
                map.put(ykey,y);
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 540, y));
            robot.delay(36000);

            AdbTools.process(robot, AdbTools.back(androidId));
        }catch (Exception e){
            bool = true;
            log.info("火山极速-看广告异常");
        }
        return bool;
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

    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static boolean handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        boolean bool = false;
        log.info("火山极速-开宝箱");
        try {
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 930, 1900));
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1450));
            }else{
                AdbTools.process(robot, AdbTools.tap(androidId, 930, 1700));
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1340));
            }
            robot.delay(36000);

            AdbTools.process(robot, AdbTools.back(androidId));
        }catch (Exception e){
            bool = true;
            log.info("火山极速-开宝箱异常");
        }
        return bool;
    }


    /**
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 11.睡觉
     * @param robot
     */
    public static boolean handle11(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        boolean bool = false;
        log.info("火山极速-睡觉");
        int hour = LocalDateTime.now().getHour();
        if(hour==22) {
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"睡觉赚金币\")");
                wl2.click();

                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 2050));
                }else{
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1850));
                }

                AdbTools.process(robot, AdbTools.back(androidId));
            } catch (Exception e) {
                bool = true;
                log.info("火山极速-睡觉异常");
            }
        }
        return  bool;
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

    }


    /**
     * todo 20.晒收入
     * @param robot
     */
    public static boolean handle20(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour==3||hour==4) {
            log.info("火山极速-晒收入");
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"晒收入\")");
                wl2.click();
                for (int i = 0; i < 3; i++) {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"微信\")");
                    wl3.click();

                    WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"去粘贴\")");
                    wl4.click();
                    AdbTools.process(robot, operateBack);
                }
            } catch (Exception e) {
                 bool = true ;
                log.info("火山极速-晒收入异常");
            }
        }
        return bool;
    }


    /**
     * todo 21.摇钱树
     * @param robot
     */
    public static boolean handle21(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour==5||hour==6) {
            log.info("火山极速-摇钱树");
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"摇钱树\")");
                wl2.click();
                robot.delay(8000);
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1100));

                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.process(robot, AdbTools.tap(androidId, 900, 1850));
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1850));
                    AdbTools.process(robot, AdbTools.tap(androidId, 880, 1240));
                } else {
                    AdbTools.process(robot, AdbTools.tap(androidId, 900, 1750));
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1750));
                    AdbTools.process(robot, AdbTools.tap(androidId, 880, 1050));
                }

                AdbTools.process(robot, AdbTools.back(androidId));
            } catch (Exception e) {
                bool = true;
                log.info("火山极速-摇钱树异常");
            }
        }
        return  bool;
    }

/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


