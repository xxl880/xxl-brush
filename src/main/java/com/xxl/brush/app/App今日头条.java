package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App今日头条 {
    private static Logger log = LoggerFactory.getLogger(App今日头条.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try {
            log.info("********************************今日头条操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot, androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup今日头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            handle2(robot, androidId, driver, map);

            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 760, 2140));
            }else{
                AdbTools.process(robot, AdbTools.tap(androidId, 760, 1950));
            }

            handle1(robot, androidId, driver, map);

            handle9(robot, androidId, driver, map);
            handle5(robot, androidId, driver, map);

            handle20(robot, androidId, driver, map);
            handle21(robot, androidId, driver, map);
            handle16(robot, androidId, driver, map);

            handle12(robot, androidId, driver, map);
            handle11(robot, androidId, driver, map);

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
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==1||hour==6) {
            log.info("今日头条-签到");
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                try {
                    WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                    wl.click();
                } catch (Exception e) {
                }

                robot.delay(2000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频再\")");
                wl1.click();
                robot.delay(32000);

                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                log.info("今日头条-签到异常");
            }
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 3.看小视频
     * @param robot
     */
    public static void handle3(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 4.看新闻
     * @param robot
     */
    public static void handle4(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-看小说");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==1) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                WebElement wl2 = null;
                try {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看小说赚金币\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看小说赚金币\")");
                }
                wl2.click();
                robot.delay(2000);
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, 160, 1580));
                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"立即阅读\")");
                    wl3.click();
                } catch (Exception e) {
                    try {
                        WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"继续阅读\")");
                        wl4.click();
                    } catch (Exception e1) {
                        AdbTools.process(robot, AdbTools.down(androidId));
                        AdbTools.process(robot, AdbTools.tap(androidId, 160, 1580));
                        WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"阅读\")");
                        wl5.click();
                    }
                }

                for (int i = 0; i < 60; i++) {
                    try {
                        robot.delay(3000);
                        if (i % 5 == 0) {
                            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频\")");
                            wl4.click();
                            robot.delay(20000);
                            AdbTools.process(robot, operateBack);
                        }
                    } catch (Exception e) {
                    }

                    AdbTools.process(robot, AdbTools.tap(androidId, 1030, 600));
                }

            } catch (Exception e) {
                log.info("今日头条-看小说异常");
            }
        }
    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-开宝箱");
        try {
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.process(robot, AdbTools.tap(androidId, 930, 1950));
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1440));
            }else{
                AdbTools.process(robot, AdbTools.tap(androidId, 930, 1440));
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1340));
            }
            robot.delay(32000);

            AdbTools.process(robot, AdbTools.back(androidId));
        }catch (Exception e){
            log.info("今日头条-开宝箱异常");
        }
    }


    /**
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 11.睡觉
     * @param robot
     */
    public static void handle11(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-睡觉");
        int hour = LocalDateTime.now().getHour();
/*        if(hour==23) {*/
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                WebElement wl2 = null;
                try {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"睡觉赚钱\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"睡觉赚钱\")");
                }
                wl2.click();

                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"我睡醒了\")");
                    wl6.click();
                } catch (Exception e) {  }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                    wl3.click();
                } catch (Exception e) {
                    AdbTools.process(robot, operateBack);
                }

                robot.delay(1000);
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频\")");
                wl4.click();
                robot.delay(32000);
                AdbTools.process(robot, operateBack);


            } catch (Exception e) {
                log.info("今日头条-睡觉异常");
            }
      /*  }*/


    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-走路");
        int hour = LocalDateTime.now().getHour();
        if(hour==20||hour==22) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                WebElement wl2 = null;
                try {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"走路赚钱\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"走路赚钱\")");
                }
                wl2.click();

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                    wl3.click();
                    robot.delay(2000);

                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频再领\")");
                    wl4.click();
                    robot.delay(30000);
                    AdbTools.process(robot, operateBack);
                    AdbTools.process(robot, operateBack);

                } catch (Exception e) {

                }
                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                log.info("今日头条-走路异常");
            }
        }
    }


    /**
     * todo 13.喝水
     * @param robot
     */
    public static void handle13(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    /**
     * todo 14.充电
     * @param robot
     */
    public static void handle14(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 15.听歌曲
     * @param robot
     */
    public static void handle15(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 16.吃饭
     * @param robot
     */
    public static void handle16(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-吃饭");
        int hour = LocalDateTime.now().getHour();
       if(hour==8||hour==12||hour==18||hour==22) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                WebElement wl2 = null;
                try {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"吃饭补贴\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"吃饭补贴\")");
                }
                wl2.click();

                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                wl3.click();

                robot.delay(1000);
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频\")");
                wl4.click();
                robot.delay(32000);

                AdbTools.process(robot, operateBack);
                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                log.info("今日头条-吃饭异常");
            }

        }



    }

    /**
     * todo 17.分享
     * @param robot
     */
    public static void handle17(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 18.摇钱树
     * @param robot
     */
    public static void handle18(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 19.刮奖
     * @param robot
     */
    public static void handle19(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    /**
     * todo 20.模拟开店赚钱
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-模拟开店赚钱");
        int hour = LocalDateTime.now().getHour();
       if(hour==0||hour==18) {
            try {
                WebElement wl2 = null;
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                try {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"模拟开店赚钱\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"模拟开店赚钱\")");
                }
                wl2.click();
                robot.delay(6000);

                AdbTools.process(robot, AdbTools.tap(androidId, 950, 960));
                AdbTools.process(robot, AdbTools.tap(androidId, 950, 870));
                AdbTools.process(robot, AdbTools.tap(androidId, 950, 930));
                AdbTools.process(robot, AdbTools.tap(androidId, 1000, 470));
                AdbTools.process(robot, AdbTools.tap(androidId, 1000, 400));

                AdbTools.process(robot, AdbTools.tap(androidId, 970, 300));
                AdbTools.process(robot, AdbTools.tap(androidId, 970, 320));
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, 970, 320));
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, 970, 320));

                AdbTools.process(robot, AdbTools.tap(androidId, 950, 840));
                AdbTools.process(robot, AdbTools.tap(androidId, 950, 930));
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.process(robot, AdbTools.tap(androidId, 990, 140));
                }else {
                    AdbTools.process(robot, AdbTools.tap(androidId, 1000, 130));
                }
            } catch (Exception e) {
                log.info("今日头条-模拟开店赚钱异常");
            }
      }

    }

    /**
     * todo 21.种菜赚金币
     * @param robot
     */
    public static void handle21(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("今日头条-种菜赚金币");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==18) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                WebElement wl2 = null;
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                try {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"种菜赚金币\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"种菜赚金币\")");
                }
                wl2.click();
                robot.delay(6000);

                AdbTools.process(robot, AdbTools.tap(androidId, 970, 800));
                AdbTools.process(robot, AdbTools.tap(androidId, 970, 880));
                AdbTools.process(robot, AdbTools.tap(androidId, 970, 470));
                AdbTools.process(robot, AdbTools.tap(androidId, 970, 460));
                for (int i = 0; i < 3; i++) {
                    AdbTools.process(robot, AdbTools.tap(androidId, 970, 300));
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1260));
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1360));
                    robot.delay(18000);
                    AdbTools.process(robot, operateBack);
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1260));
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1360));
                }

                AdbTools.process(robot, AdbTools.tap(androidId, 950, 840));
                AdbTools.process(robot, AdbTools.tap(androidId, 950, 930));
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.process(robot, AdbTools.tap(androidId, 990, 140));
                }else {
                    AdbTools.process(robot, AdbTools.tap(androidId, 1000, 130));
                }

            } catch (Exception e) {
                log.info("今日头条-种菜赚金币异常");
            }
       }
    }


    /**
     * todo 22.搜索
     * @param robot
     */
    public static void handle22(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


