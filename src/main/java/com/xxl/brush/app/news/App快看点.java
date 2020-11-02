package com.xxl.brush.app.news;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * todo App快看点
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App快看点 {
    private static Logger log = LoggerFactory.getLogger(App快看点.class);

    /**
     * todo 1.凌晨0:00-2:00(签到)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void start(Robot robot,String robotCode){
        try{
            log.info("********************************快看点操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl.click();

            handle1(robot,androidId,driver);
            handle8(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle6(robot,androidId,driver);
        }catch (Exception e){}


    }

    /**
     * todo 2.早上6:00-8:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section1(Robot robot,String robotCode){
        try{
            log.info("********************************快看点操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl.click();

            handle8(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle6(robot,androidId,driver);
        }catch (Exception e){}


    }



    /**
     * todo 3.中午10：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section2(Robot robot,String robotCode){
        try{
            log.info("********************************快看点操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl.click();

            handle8(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle6(robot,androidId,driver);
        }catch (Exception e){}


    }


    /**
     * todo 4.下午18：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section3(Robot robot,String robotCode){

        try{
            log.info("********************************快看点操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl.click();

            handle8(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle6(robot,androidId,driver);
        }catch (Exception e){}

    }



    /**
     * todo 5.晚上22：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section4(Robot robot,String robotCode){
        try{
            log.info("********************************快看点操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl.click();

            handle8(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle6(robot,androidId,driver);
        }catch (Exception e){}


    }




    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String robotCode){

        try{
            log.info("********************************快看点操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl.click();

            handle8(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle6(robot,androidId,driver);
        }catch (Exception e){}

    }



    /**
     * todo 退出
     * @param robot

     */
    public static void quit(Robot robot, AndroidDriver driver){

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
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
       log.info("快看点-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                wl.click();
            }

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频再领\")");
            wl1.click();
            robot.delay(32000);

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"跳过\")");
                wl2.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yuncheapp.android.pearl:id/close\")");
                wl3.click();
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("快看点-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){

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
        log.info("快看点-领金币广告");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";


            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yuncheapp.android.pearl:id/gold\")");
            wl1.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").textContains(\"再赚\")");
            wl3.click();

            for(int i=0;i<20;i++) {
                WebElement wl5 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").textContains(\"今日剩余\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl5.getLocation().getY() + 160)));
                robot.delay(36000);

                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yuncheapp.android.pearl:id/close\")");
                    wl6.click();
                } catch (Exception e) {
                }
            }

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("快看点-领金币广告异常");
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
        log.info("快看点-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取\")");
            wl1.click();

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yuncheapp.android.pearl:id/close\")");
                wl3.click();
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("快看点-领红包异常");
        }
    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver){

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

    /**
     * todo 20.晒收入(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("快看点-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yuncheapp.android.pearl:id/cover\")");
            wl1.click();

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"微信\")");
                wl3.click();
                robot.delay(2000);
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("快看点-领红包异常");
        }
    }




/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


