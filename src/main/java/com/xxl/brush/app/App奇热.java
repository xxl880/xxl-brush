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
 * todo App奇热小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App奇热 {
    private static Logger log = LoggerFactory.getLogger(App奇热.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try {
            log.info("********************************奇热小说操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup奇热);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            handle2(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.RadioButton\").text(\"书城\")");
                wl.click();
                handle8(robot, androidId, driver);
            } catch (Exception e) {
            }

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.RadioButton\").text(\"赚钱\")");
                wl2.click();
            } catch (Exception e) {
            }

            handle1(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle10(robot, androidId, driver);
            handle101(robot, androidId, driver);

            handle4(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("奇热小说-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去签到\")");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去签到\")");
            }
            wl.click();

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即翻倍\")");
            wl2.click();
            robot.delay(32000);

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/tt_video_ad_close\")");
                wl4.click();
            } catch (Exception e) {
                AdbTools.process(robot, operateBack);
            }
            WebElement wl5 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"好的\")");
            wl5.click();
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("奇热小说-签到异常");
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
        log.info("奇热小说-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"金币领不停\")");
            wl4.click();

            for (int a = 0; a < 3; a++) {
                robot.delay(RandomTools.init(2000));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(200)));
                for(int i=0;i<3;i++){
                    robot.delay(RandomTools.init(2000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
            AdbTools.process(robot, operateBack);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即翻倍\")");
            wl2.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("奇热小说-看新闻异常");
        }
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
        log.info("奇热小说-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"立即观看\")");
            wl2.click();
            robot.delay(32000);

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/xm_iv_close\")");
                wl4.click();
            } catch (Exception e) {
                AdbTools.process(robot, operateBack);
            }

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"立即翻倍\")");
            wl3.click();
            robot.delay(32000);

            WebElement wl4 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView");
            wl4.click();

        }catch (Exception e){
            log.info("奇热小说-看广告异常");
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
        log.info("奇热小说-领红包");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/svg_red_packet_rain\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即翻倍\")");
            wl3.click();

            robot.delay(32000);

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/xm_iv_close\")");
                wl4.click();
            } catch (Exception e) {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                AdbTools.process(robot, operateBack);
            }
            WebElement wl5 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"好的\")");
            wl5.click();
        }catch (Exception e){
            log.info("奇热小说-领红包异常");
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
        log.info("奇热小说-抽奖");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去抽奖\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去抽奖\")");
            }
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/turntable\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl3.getLocation().getY() + wl3.getLocation().getY())));

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/turntable\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl4.getLocation().getY() + 400)));
                WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/xm_iv_close\")");
                wl5.click();

            }catch (Exception e){}


            WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即翻倍\")");
            wl6.click();

            robot.delay(32000);

        }catch (Exception e){
            log.info("奇热小说-抽奖异常");
        }

    }


    /**
     * todo 10.1抽奖
     * @param robot
     */
    public static void handle101(Robot robot,String androidId,  AndroidDriver driver){
        log.info("奇热小说-抽奖手机");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我要抽\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我要抽\")");
            }
            wl2.click();
            robot.delay(32000);
            WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.qixiao.qrxs:id/xm_iv_close\")");
            wl5.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"剩余\")");
            wl3.click();

            WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即翻倍\")");
            wl6.click();

            robot.delay(32000);

        }catch (Exception e){
            log.info("奇热小说-抽奖手机异常");
        }

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


