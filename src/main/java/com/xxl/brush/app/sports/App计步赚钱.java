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
 * todo App计步赚钱运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App计步赚钱 {
    private static Logger log = LoggerFactory.getLogger(App计步赚钱.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        log.info("********************************计步赚钱操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup计步赚钱);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

        try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
            wl.click();
        }catch (Exception e){  }
        handle1(robot,androidId,driver);

        try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"赚金币\")");
            wl.click();
        }catch (Exception e){}
        handle6(robot,androidId,driver);
        handle17(robot,androidId,driver);

    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("计步赚钱-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement  wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"签到\")");
            wl.click();
            robot.delay(2000);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即签到\")");
            wl1.click();
            robot.delay(32000);

            quit(robot,androidId,driver);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("计步赚钱-签到异常");
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
        log.info("计步赚钱-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try{
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取奖励\")");
                wl1.click();
            }catch (Exception e){}
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看视频广告，领取金币\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(930), String.valueOf(wl.getLocation().getY())));
                robot.delay(32000);
            }catch (Exception e){}
            quit(robot,androidId,driver);
        }catch (Exception e){
            log.info("计步赚钱-看广告异常");
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
        log.info("走种赚钱-分享");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try{
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取奖励\")");
                wl1.click();
            }catch (Exception e){}
            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"分享成功后返回app得金币\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(930), String.valueOf(wl2.getLocation().getY())));

                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"发送我的邀请\")");
                wl3.click();
                robot.delay(2000);
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}

            quit(robot,androidId,driver);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("走种赚钱-分享异常");
        }
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
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.quzhuan.app:id/tt_video_ad_close\")");
            wl1.click();
        }catch (Exception e){}

        try{
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.quzhuan.app:id/lx_close_end\")");
            wl1.click();
        }catch (Exception e){}

    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


