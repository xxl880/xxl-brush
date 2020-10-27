package com.xxl.brush.app.medias;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.awt.*;
import java.util.List;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App追看视频 {
    private static Logger log = LoggerFactory.getLogger(App追看视频.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        log.info("********************************追看操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup追看);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

        try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
            wl.click();
        }catch (Exception e){}
        appClear(robot,androidId,driver);
        handle2(robot,androidId,driver);
        handle8(robot,androidId,driver);

        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"赚钱\")");
            wl2.click();
        }catch (Exception e){   }
        handle1(robot,androidId,driver);
        handle9(robot,androidId,driver);
        handle62(robot,androidId,driver);
        handle61(robot,androidId,driver);
        handle10(robot,androidId,driver);
        handle19(robot,androidId,driver);
        handle6(robot,androidId,driver);

    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("追看-签到");
        try {
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

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频再赚\")");
            wl1.click();
            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("追看-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("追看-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("追看-看视频异常");
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
        log.info("追看-看广告");
        try{
            robot.delay(2000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看创意视频赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看创意视频赚金币\")");
            }
            wl.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("追看-看广告异常");
        }

    }




    /**
     * todo 6.1 看广告
     * @param robot
     */
    public static void handle61(Robot robot,String androidId,  AndroidDriver driver){
        log.info("追看-看直播广告");
        try{
            robot.delay(2000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"(0/1) 去YY直播观看任意直播间30秒即可获得\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"(0/1) 去YY直播观看任意直播间30秒即可获得\")");
            }
            wl.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("追看-看广告异常");
        }

    }


    /**
     * todo 6.2 看广告
     * @param robot
     */
    public static void handle62(Robot robot,String androidId,  AndroidDriver driver){
        log.info("追看-点击广告赚金币");
        try{
            robot.delay(2000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"点击广告赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"点击广告赚金币\")");
            }
            wl.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("追看-点击广告赚金币异常");
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
        log.info("追看-领红包");
        try {
            robot.delay(2000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"点我领钱\")");
            wl2.click();

            robot.delay(31000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("追看-领红包异常");
        }
    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver){
        log.info("追看-开宝箱");
        try {
            robot.delay(2000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"领金币\")");
            wl2.click();

            robot.delay(31000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("追看-开宝箱异常");
        }
    }


    /**
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(Robot robot,String androidId,  AndroidDriver driver){
        log.info("追看-抽奖");
        try {
            robot.delay(2000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"去抽奖\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").textContains(\"领额外奖励\")");
            wl3.click();
            robot.delay(31000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("追看-抽奖异常");
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
        log.info("追看-刮奖");
        try {
            robot.delay(2000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"去刮卡\")");
            wl2.click();

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.view.View\").text(\"现金\")");
            wls.get(0).click();
            robot.delay(2000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"奖励\")");
            AdbTools.process(robot, AdbTools.tapDraw(androidId, String.valueOf(wl3.getLocation().getX()+10), String.valueOf(wl3.getLocation().getY()+120)));

            WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").textContains(\"领额外奖励\")");
            wl4.click();

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("追看-刮奖异常");
        }
    }



    /**
     * todo 20.清除
     * @param robot
     */
    public static void appClear(Robot robot,String androidId,  AndroidDriver driver){
          try{
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"设置青少年模式\").fromParent(text(\"我知道了\"))");
            wl3.click();
        }catch (Exception e){}

        try{
            WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"继续播放\")");
            wl4.click();
        }catch (Exception e){}

    }



/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


