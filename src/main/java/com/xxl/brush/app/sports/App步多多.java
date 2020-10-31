package com.xxl.brush.app.sports;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * todo App步多多运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App步多多 {
    private static Logger log = LoggerFactory.getLogger(App步多多.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try{
        log.info("********************************步多多操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup步多多);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
        try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"运动\")");
            wl.click();
        }catch (Exception e){   }
        handle12(robot,androidId,driver);
        handle8(robot,androidId,driver);

        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"步友圈\")");
            wl2.click();
        }catch (Exception e){   }
        handle1(robot,androidId,driver);

         try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"赚赚\")");
            wl1.click();
        }catch (Exception e){  }
        handle9(robot,androidId,driver);
        }catch (Exception e){
            e.printStackTrace();
        }


    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
       log.info("步多多-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"签到\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"签到\")");
                wl.click();
            }

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"签到翻倍\")");
            wl1.click();
            robot.delay(32000);

            quit(robot,androidId,driver);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步多多-签到异常");
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
        log.info("步多多-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qsmy.walkmonkey:id/oi\")");
                wl1.click();
                quit(robot,androidId,driver);
            }catch (Exception e){}

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qsmy.walkmonkey:id/al6\")");
                wl2.click();
                quit(robot,androidId,driver);
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("步多多-领红包异常");
        }
    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver){
        log.info("步多多-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"可领取\")");
            wl2.click();
            robot.delay(32000);
            quit(robot,androidId,driver);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步多多-开宝箱异常");
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
        log.info("步多多-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"领取\")");
            wl2.click();
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金币翻倍\")");
            wl3.click();
            robot.delay(32000);
            quit(robot,androidId,driver);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步多多-走路异常");
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
     * todo 20.退出
     * @param robot
     */
    public static void quit(Robot robot,String androidId,  AndroidDriver driver){
        try{
            robot.delay(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qsmy.walkmonkey:id/qt\")");
            wl1.click();
        }catch (Exception e){}

        try{
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qsmy.walkmonkey:id/azv\")");
            wl2.click();
        }catch (Exception e){}

        try{
            robot.delay(1000);
            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qsmy.walkmonkey:id/ao\")");
            wl3.click();
        }catch (Exception e){}

        try{
            robot.delay(1000);
            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qsmy.walkmonkey:id/ao\")");
            wl3.click();
        }catch (Exception e){}

    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


