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
 * todo AppQQ阅读
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class AppQQ阅读 {
    private static Logger log = LoggerFactory.getLogger(AppQQ阅读.class);

    /**
     * todo 1.凌晨0:00-2:00(签到)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void start(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * todo 2.早上6:00-8:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section1(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    /**
     * todo 3.中午10：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section2(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * todo 4.下午18：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section3(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    /**
     * todo 5.晚上22：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section4(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
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
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"书架\")");
                wl.click();
            } catch (Exception e) {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(93), String.valueOf(wl.getLocation().getY())));
            }

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"本周阅读/分钟\")");
                wl.click();
            } catch (Exception e) {

            }

            handle9(robot, androidId, driver);
            handle6(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle51(robot, androidId, driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
         log.info("QQ阅读-签到");
        try {
            try {
                WebElement wl = null;
                try {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                }
                wl.click();
            }catch (Exception e ){}

            robot.delay(2000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看小视频再领\")");
            wl1.click();
            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("QQ阅读-签到异常");
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
        log.info("QQ阅读-看小说");
        try {
            robot.delay(1000);
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"领300金币\")");
            wl.click();

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(800)));

            for(int i=0;i<10;i++) {
                robot.delay(31000);
                AdbTools.process(robot, AdbTools.left(androidId));
            }

        }catch (Exception e){
            log.info("QQ阅读-看小说异常");
        }
    }


    /**
     * todo 5.1看小说-加入书架
     * @param robot
     */
    public static void handle51(Robot robot,String androidId,  AndroidDriver driver){
        log.info("QQ阅读-看小说");
        try {
            robot.delay(1000);
            AdbTools.process(robot, AdbTools.down(androidId));
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"去精选\")");
            wl.click();
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1260)));

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"加书架\")");
            wl1.click();

        }catch (Exception e){
            log.info("QQ阅读-看小说异常");
        }
    }

    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver){
        log.info("QQ阅读-看广告");
        try{
            robot.delay(1000);
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl2 = null;
            try{
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"看视频拿大额金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"看视频拿大额金币\")");
            }
            wl2.click();
            robot.delay(59000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("QQ阅读-看广告异常");
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
        log.info("QQ阅读-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();

        }catch (Exception e){
            log.info("QQ阅读-开宝箱异常");
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


