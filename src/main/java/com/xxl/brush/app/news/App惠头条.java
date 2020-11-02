package com.xxl.brush.app.news;

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



public class App惠头条 {
    private static Logger log = LoggerFactory.getLogger(App惠头条.class);

    /**
     * todo 1.凌晨0:00-2:00(签到)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void start(Robot robot,String robotCode){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup惠头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务中心\")");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
                wl2.click();
                handle1(robot, androidId, driver);
                handle41(robot, androidId, driver);
                handle42(robot, androidId, driver);
                handle43(robot, androidId, driver);
                handle44(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
        }catch (Exception e){}

    }

    /**
     * todo 2.早上6:00-8:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section1(Robot robot,String robotCode){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup惠头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务中心\")");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
                wl2.click();
                handle41(robot, androidId, driver);
                handle42(robot, androidId, driver);
                handle43(robot, androidId, driver);
                handle44(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
        }catch (Exception e){}

    }



    /**
     * todo 3.中午10：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section2(Robot robot,String robotCode){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup惠头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务中心\")");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
                wl2.click();
                handle41(robot, androidId, driver);
                handle42(robot, androidId, driver);
                handle43(robot, androidId, driver);
                handle44(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
        }catch (Exception e){}

    }


    /**
     * todo 4.下午18：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section3(Robot robot,String robotCode){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup惠头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务中心\")");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
                wl2.click();
                handle41(robot, androidId, driver);
                handle42(robot, androidId, driver);
                handle43(robot, androidId, driver);
                handle44(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
        }catch (Exception e){}

    }



    /**
     * todo 5.晚上22：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section4(Robot robot,String robotCode){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup惠头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务中心\")");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
                wl2.click();
                handle41(robot, androidId, driver);
                handle42(robot, androidId, driver);
                handle43(robot, androidId, driver);
                handle44(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
        }catch (Exception e){}

    }




    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String robotCode){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup惠头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);
            handle4(robot,androidId,driver);

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务中心\")");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
                wl2.click();
                handle41(robot, androidId, driver);
                handle42(robot, androidId, driver);
                handle43(robot, androidId, driver);
                handle44(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"头条\")");
                wl.click();
            }catch (Exception e){  }

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
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
       log.info("惠头条-签到");
        try {
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/tv_sign_benefit\")");
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"忽略\")");
            wl1.click();

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-签到异常");
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
        log.info("惠头条-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            int aa  = RandomTools.init(8);
            for (int a = 0; a < aa; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
                for (int i = 0; i < 5; i++) {
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-看新闻异常");
        }
    }


    /**
     * todo 4.1看新闻-浏览赚金币
     * @param robot
     */
    public static void handle41(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-浏览赚金币");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"【快速赚】浏览赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.up(androidId));
                AdbTools.process(robot, AdbTools.up(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"【快速赚】浏览赚金币\")");
            }
            wl2.click();
            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任意浏览3篇文章或广告，60秒后即可获得金币奖励\").fromParent(text(\"立即领取\"))");
                wl4.click();
                robot.delay(3000);
                WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/iv_dialog_close_bottom\")");
                wl5.click();
            }catch (Exception e){}
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任意浏览3篇文章或广告，60秒后即可获得金币奖励\").fromParent(text(\"去领取\"))");
            wl3.click();
            robot.delay(3000);
            for (int a = 0; a < 3; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
                for (int i = 0; i < 5; i++) {
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-浏览赚金币异常");
        }
    }

    /**
     * todo 4.2看新闻-玩转新闻得金币
     * @param robot
     */
    public static void handle42(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-玩转新闻得金币");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"玩转新闻得金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.up(androidId));
                AdbTools.process(robot, AdbTools.up(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"玩转新闻得金币\")");
            }
            wl2.click();
            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任意浏览3篇文章，60秒后即可获得金币奖励\").fromParent(text(\"立即领取\"))");
                wl4.click();
                robot.delay(3000);
                WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/iv_dialog_close_bottom\")");
                wl5.click();
            }catch (Exception e){}
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任意浏览3篇文章或广告，60秒后即可获得金币奖励\").fromParent(text(\"去赚钱\"))");
            wl3.click();
            robot.delay(3000);
            for (int a = 0; a < 3; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
                for (int i = 0; i < 6; i++) {
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-玩转新闻得金币异常");
        }
    }


    /**
     * todo 4.3看新闻-看内容赚金币
     * @param robot
     */
    public static void handle43(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-看内容赚金币");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看内容赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.up(androidId));
                AdbTools.process(robot, AdbTools.up(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看内容赚金币\")");
            }
            wl2.click();
            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任意浏览6篇文章或广告，60秒后可获得金币奖励\").fromParent(text(\"立即领取\"))");
                wl4.click();
                robot.delay(3000);
                WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/iv_dialog_close_bottom\")");
                wl5.click();
            }catch (Exception e){}
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任意浏览6篇文章或广告，60秒后可获得金币奖励\").fromParent(text(\"去赚钱\"))");
            wl3.click();
            robot.delay(3000);
            for (int a = 0; a < 6; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
                for (int i = 0; i < 6; i++) {
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                    robot.delay(RandomTools.init(5000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-看内容赚金币异常");
        }
    }


    /**
     * todo 4.4看新闻-看看文章拿金币
     * @param robot
     */
    public static void handle44(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-看看文章拿金币");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看看文章拿金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.up(androidId));
                AdbTools.process(robot, AdbTools.up(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看看文章拿金币\")");
            }
            wl2.click();
            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"浏览至少3篇文章或广告，60秒后即可获得金币奖励\").fromParent(text(\"立即领取\"))");
                wl4.click();
                WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/iv_dialog_close_bottom\")");
                wl5.click();
            }catch (Exception e){}
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"浏览至少3篇文章或广告，60秒后即可获得金币奖励\").fromParent(text(\"去赚钱\"))");
            wl3.click();
            robot.delay(3000);
            for (int a = 0; a < 3; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
                for (int i = 0; i < 6; i++) {
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-看看文章拿金币异常");
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
        log.info("惠头条-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wls2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看广告领奖励\").fromParent(text(\"+50\"))");
            wls2.click();
            WebElement wls3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/tt_video_ad_close_layout\")");
            wls3.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"忽略\")");
            wl1.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-看广告异常");
        }

    }


    /**
     * todo 6.1看广告-戳我看广告
     * @param robot
     */
    public static void handle61(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-戳我看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wls2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"戳我\").fromParent(text(\"+50\"))");
            wls2.click();
            WebElement wls3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/tt_video_ad_close_layout\")");
            wls3.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"忽略\")");
            wl1.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("惠头条-戳我看广告异常");
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
        log.info("惠头条-点我领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"惠头条\").fromParent(text(\"点击领取\"))");
            wl1.click();
            robot.delay(2000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"金币翻倍\")");
            wl2.click();
            robot.delay(59000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")");
            wl3.click();

            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"忽略\")");
            wl4.click();

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("惠头条-点我领红包异常");
        }
    }

    /**
     * todo 8.1领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle81(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-点我领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"浏览广告赢更多金币\")");
            wl1.click();

            robot.delay(32000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")");
            wl3.click();

            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"忽略\")");
            wl4.click();

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("惠头条-点我领红包异常");
        }
    }

    /**
     * todo 8.2领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle82(Robot robot,String androidId,  AndroidDriver driver){
        log.info("惠头条-领取奖励");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/tv_reward\")");
            wl1.click();

            robot.delay(32000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")");
            wl3.click();

            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"忽略\")");
            wl4.click();

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("惠头条-领取奖励异常");
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
        log.info("惠头条-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"走路赚\")");
            wl1.click();


            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取金币\")");
            wl2.click();

            AdbTools.process(robot, operateBack);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/iv_close\")");
            wl3.click();

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("惠头条-走路异常");
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
     * todo 20.刮奖
     * @param robot
     */
    public static void clear(Robot robot,String androidId,  AndroidDriver driver){
        try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.cashtoutiao:id/img_close\")");
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


