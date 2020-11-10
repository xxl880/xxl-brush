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

/**
 * todo App番茄小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App番茄 {
    private static Logger log = LoggerFactory.getLogger(App番茄.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort){
        try{
            log.info("********************************番茄小说操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup番茄);
            robot.delay(3000);
            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 540, y));

            handle1(robot,androidId,driver);

            handle9(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle5(robot,androidId,driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 退出
     * @param robot

     */
    public static void quit(Robot robot, AndroidDriver driver){
        try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.dragon.read:id/tt_video_ad_close_layout\")");
            wl1.click();
        }catch (Exception e){ }
        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.dragon.read:id/tt_video_ad_close\")");
            wl2.click();
        }catch (Exception e){ }
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
        log.info("番茄小说-签到");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==1||hour==2) {
            try {
                robot.delay(2000);
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").textStartsWith(\"看视频再领\")");
                wl1.click();
                robot.delay(36000);

                clear(robot, driver);
            } catch (Exception e) {
                log.info("番茄小说-签到异常");
            }
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
        log.info("番茄小说-看小说");
        try{
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 110, y));

            AdbTools.process(robot, AdbTools.upPage(androidId));
            robot.delay(2000);
            AdbTools.process(robot, AdbTools.tap(androidId, 170, 620));
            robot.delay(3000);

            //加入书架
            try{
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.dragon.read:id/aq_\")");
                wl4.click();
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.tap(androidId, 870, 136));
            }
            robot.delay(2000);
            //分享
            try {
                WebElement wl46 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.dragon.read:id/aot\")");
                wl46.click();
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.tap(androidId, 990, 136));
            }
            WebElement wl45 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"微信\")");
            wl45.click();
            AdbTools.process(robot, operateBack);

            AdbTools.process(robot, AdbTools.tap(androidId, 850, 430));
            for(int i=0;i<50;i++){
                AdbTools.process(robot, AdbTools.tap(androidId, 990, 136));
                robot.delay(RandomTools.init(6000)+8000);
            }

        }catch (Exception e){
            log.info("番茄小说-看小说异常");
        }
    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver){
        log.info("番茄小说-看广告");
        try{
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"立即观看\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"立即观看\")");
            }
            int x = wl2.getLocation().getX();
            int y = wl2.getLocation().getY();
            for(int i=0;i<10;i++) {
                robot.delay(2000);
                AdbTools.process(robot, AdbTools.tap(androidId, x, y));
                robot.delay(36000);
                quit(robot,driver);
            }

        }catch (Exception e){
            log.info("番茄小说-看广告异常");
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
        log.info("番茄小说-开宝箱");
        try {
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();

            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1310));
            }else {
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1210));
            }
            robot.delay(59000);
            quit(robot,driver);

        }catch (Exception e){
            log.info("番茄小说-开宝箱异常");
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




/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


