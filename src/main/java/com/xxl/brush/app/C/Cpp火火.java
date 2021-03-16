package com.xxl.brush.app.C;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.Map;

/**
 * todo App火火
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class Cpp火火 {
    private static Logger log = LoggerFactory.getLogger(Cpp火火.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************火火操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup火火视频);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"看视频\")");
                wl.click();
            }catch (Exception e){ }

            handle8(robot, androidId, driver, map);
            handle2(robot, androidId, driver, map);
            handle3(robot, androidId, driver, map);

        }catch (Exception e){}

    }



/**
     * todo 退出
     * @param robot*/
    public static void quit(Robot robot, AndroidDriver driver){

    }


/**
     * todo 清除
     * @param robot*/
    public static void clear(Robot robot, AndroidDriver driver){

    }




/**
     * todo 1.签到
     * @param robot*/
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("火火-签到");
        try {
            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                wl.click();
            } catch (Exception e) {
                 AdbTools.downPage(androidId);
                 AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                wl.click();
            }


            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"金币翻倍\")");
            wl1.click();
            robot.delay(32000);

            try{
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"再接再厉，赚更多哦~\")");
                wl2.clear();
            }catch (Exception e){

            }

           AdbTools.back(androidId);
        }catch (Exception e){
            log.info("火火-签到异常");
        }
    }


/**
     * todo 2.看视频
     * @param robot*/


    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("火火-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
            wl1.click();

            try {
                WebElement wl11 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金蛋大奖\")");
                wl11.click();

                WebElement wl111 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"看视频再送\")");
                wl111.click();
                robot.delay(32000);
            }catch (Exception e){}
            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"继续播放\")");
                wl2.click();
            }catch (Exception e){}

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.downPage(androidId);
                AdbTools.tap(androidId, 540, 600);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("火火-看视频异常");
        }
    }


/**
     * todo 3.看小视频
     * @param robot*/


    public static void handle3(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("火火-看小视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
            wl1.click();

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"继续播放\")");
                wl2.click();
            }catch (Exception e){}

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                 AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                     AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("火火-看小视频异常");
        }
    }


/*
*
     * todo 4.看新闻
     * @param robot
*/


    public static void handle4(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 5.看小说
     * @param robot*/


    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 6.看广告
     * @param robot*/


    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 7.玩游戏
     * @param robot*/


    public static void handle7(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot*/


    public static void handle8(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("火火-领红包");
        try {
            robot.delay(1000);

            AdbTools.upPage(androidId);
            AdbTools.upPage(androidId);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"480\")");
            wl1.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("火火-领红包异常");
        }
    }

 




}


