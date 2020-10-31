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
 * todo App快手
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App快手极速 {
    private static Logger log = LoggerFactory.getLogger(App快手极速.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try {
            log.info("********************************快手极速操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup快手);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            handle2(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"/6\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(90), String.valueOf(440)));
            }
            handle1(robot, androidId, driver);
            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle20(robot, androidId, driver);

        }catch (Exception e){
            e.printStackTrace();
        }
    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("快手极速-签到");
        try {
            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"去签到\")");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"去签到\")");
            }
            wl.click();

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("快手极速-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("快手极速-看视频");
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
            log.info("快手极速-看视频异常");
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
        log.info("快手极速-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl2 = null;
            try{
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\") .textContains(\"task_icon_list_video\").fromParent(textContains(\"福利\"))");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\") .textContains(\"task_icon_list_video\").fromParent(textContains(\"福利\"))");

            }
            wl2.click();
            robot.delay(32000);
            AdbTools.process(robot, operateBack);


        }catch (Exception e){
            log.info("快手极速-看广告异常");
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
        log.info("快手极速-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看广告视频再赚\")");
            wl3.click();
            robot.delay(2000);

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"HGGPyDxR67B6PpvwC+B+CeSgKklEgAAAABJRU5ErkJggg==\")");
                wl4.click();
            }catch (Exception e){
                log.info("快手极速-开宝箱返回异常");
            }

        }catch (Exception e){
            log.info("快手极速-开宝箱异常");
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

    /**
     * todo 20.直播
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("快手极速-直播");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").text(\"观看精彩直播得100金币，已完成 10/10\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").text(\"看直播领金币\")");
                AdbTools.process(robot,AdbTools.tap(androidId,"880",String.valueOf(wl3.getLocation().getY())));
                robot.delay(32000);
                AdbTools.process(robot, operateBack);
            }

        }catch (Exception e){
            log.info("快手极速-直播异常");
        }
    }



/*

    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
       //  handle(robot,"phone003");
        AndroidDriver driver = AppiumTools.init("phone003");
        log.info(driver.getPageSource());
        robot.delay(3000);
        WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"HGGPyDxR67B6PpvwC+B+CeSgKklEgAAAABJRU5ErkJggg==\")");
        wl4.click();
    }
*/


}


