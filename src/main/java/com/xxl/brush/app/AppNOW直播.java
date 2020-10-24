package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class AppNOW直播 {
    private static Logger log = LoggerFactory.getLogger(AppNOW直播.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        log.info("********************************抖音极速操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup抖音);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

        handle2(robot, androidId, driver);

         try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl.getLocation().getY() + 20)));
        }catch (Exception e){
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(2140)));
        }

        handle11(robot,androidId,driver);
        handle12(robot,androidId,driver);
        handle9(robot,androidId,driver);
        handle6(robot,androidId,driver);
        handle16(robot,androidId,driver);

    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-签到");
        try {
            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
            }
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看广告视频再赚\")");
            wl1.click();
            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
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
            int x = RandomTools.init(8);
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
            robot.delay(1000);
            WebElement wl2 = null;
            try{
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"每20分钟完成一次广告任务，单日最高可赚21960金币\").fromParent(text(\"去领取\"))");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"每20分钟完成一次广告任务，单日最高可赚21960金币\").fromParent(text(\"去领取\"))");
            }
            wl2.click();
            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
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
        log.info("抖音极速-玩游戏");
        try {
            robot.delay(1000);
            AdbTools.process(robot, AdbTools.downPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"玩游戏赚钱\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看广告视频再赚\")");
            wl3.click();

            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音极速-玩游戏异常");
        }
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
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看广告视频再赚\")");
            wl3.click();

            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
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

    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver){
        log.info("抖音极速-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"走得越多赚的越多\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"走得越多赚的越多\")");
            }
            wl2.click();

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看广告视频可领\")");
                wl3.click();
                robot.delay(32000);
                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                    wl4.click();
                    robot.delay(32000);
                    AdbTools.process(robot, operateBack);
                }catch (Exception e1){ }
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音极速-走路异常");
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
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"限时福利，每天饭点领补贴\").fromParent(text(\"去领取\"))");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"限时福利，每天饭点领补贴\").fromParent(text(\"去领取\"))");
            }
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
            wl3.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音极速-吃饭异常");
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





/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


