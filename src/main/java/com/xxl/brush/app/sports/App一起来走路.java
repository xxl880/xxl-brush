package com.xxl.brush.app.sports;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.List;

/**
 * todo App一起来走路运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App一起来走路 {
    private static Logger log = LoggerFactory.getLogger(App一起来走路.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try{
        log.info("********************************一起来走路操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup一起来走路);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

        try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"走走\")");
            wl.click();
        }catch (Exception e){ }
        handle1(robot,androidId,driver);
        handle6(robot,androidId,driver);
        handle8(robot,androidId,driver);
        handle12(robot,androidId,driver);
        handle21(robot,androidId,driver);

         try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"福利\")");
            wl1.click();
        }catch (Exception e){ }
        handle22(robot,androidId,driver);

        }catch (Exception e){
            e.printStackTrace();
        }



    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
       log.info("一起来走路-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"签到\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"签到\")");
                wl.click();
            }

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"开心收下\")");
            wl1.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("一起来走路-签到异常");
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
        log.info("一起来走路-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement  wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即领取\")");
            wl1.click();
            robot.delay(36000);
           quit(robot,androidId,driver);
        }catch (Exception e){
            log.info("一起来走路-看广告异常");
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
        log.info("一起来走路-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yx.yqlzl:id/a8s\")");
                wl1.click();
                robot.delay(2000);
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(59000);
                quit(robot,androidId,driver);
            }catch (Exception e){}

            try {
                WebElement wl11 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yx.yqlzl:id/a8r\")");
                wl11.click();
                robot.delay(2000);
                WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl21.click();
                robot.delay(59000);
                quit(robot,androidId,driver);
            }catch (Exception e){}

            try {
                WebElement wl12 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yx.yqlzl:id/a8t\")");
                wl12.click();
                robot.delay(2000);
                WebElement wl22 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl22.click();
                robot.delay(59000);
                quit(robot,androidId,driver);
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("一起来走路-领红包异常");
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
        log.info("一起来走路-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取金币\")");
            wl1.click();

            quit(robot,androidId,driver);
            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("一起来走路-走路异常");
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
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").fromParent(className(\"android.widget.TextView\"))");
            wl2.click();
        }catch (Exception e){}

        try {
            robot.delay(1000);
            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yx.yqlzl:id/a8u\")");
            wl3.click();
        }catch (Exception e){}

    }



    /**
     * todo 21.分享
     * @param robot
     */
    public static void handle21(Robot robot,String androidId,  AndroidDriver driver){
        log.info("一起来走路-分享");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"分享到朋友圈可领取奖励\").fromParent(text(\"立即领取\"))");
                wl2.click();
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"分享到朋友圈可领取奖励\").fromParent(text(\"立即领取\"))");
                wl2.click();
            }
            quit(robot,androidId,driver);

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("一起来走路-分享出错");
        }
    }




    /**
     * todo 22.获取红心
     * @param robot
     */
    public static void handle22(Robot robot,String androidId,  AndroidDriver driver){
        log.info("一起来走路-获取红心");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.view.View\").text(\"立即领取\")");
            for(WebElement wl:wls){
                wl.click();
                robot.delay(45000);
                quit(robot,androidId,driver);
            }

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("一起来走路-获取红心出错");
        }
    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


