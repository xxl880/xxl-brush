package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
/*

*
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)

*/
public class App趣头条 {
    private static Logger log = LoggerFactory.getLogger(App趣头条.class);

/*
*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
*/
    public static void circulate(String androidId,int port,int systemPort){
        AppTools.appTime();
             try {
                log.info("********************************趣头条操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup趣头条);

                log.info("3.启动appium");
                AndroidDriver driver = AppiumTools.init(androidId, port, systemPort);

                log.info("4.清除");
                AdbTools.clear(driver);

                clear(androidId, driver);

                int y = 1960;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }

                AdbTools.tap(androidId, 970, y);
                handle5(androidId, driver);

                Thread.sleep(1000);
                AdbTools.tap(androidId, 110, y);
                handle8(androidId, driver);
                handle4(androidId, driver);

                Thread.sleep(1000);
                AdbTools.tap(androidId, 540, y);
                handle2(androidId, driver);

                Thread.sleep(1000);
                AdbTools.tap(androidId, 755, y);
                handle1(androidId, driver);
                handle9(androidId, driver);
                handle6(androidId, driver);
                Thread.sleep(1000);
                AdbTools.tap(androidId, 755, y);
                handle61(androidId, driver);
                handle11(androidId, driver);
                handle18(androidId, driver);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }


/*

*
     * todo 退出
     * @param 

*/


    public static void quit(String androidId, AndroidDriver driver){
         try{
             WebElement wl11 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"拒绝\")");
             wl11.click();
         }catch (Exception e){}
    }

/*

*
     * todo 清除
     * @param 

*/


    public static void clear( String androidId, AndroidDriver driver){
        String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
        try{
            WebElement wl11 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.kuaishou.nebula:id/login_dialog_cancel\")");
            wl11.click();
        }catch (Exception e){}
        try{
            WebElement wl12 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.jifen.qukan:id/afk\")");
            wl12.click();
        }catch (Exception e){}

        AdbTools.back(androidId);

    }
/*

*
     * todo 初始化
     * @param 


*/

    public static void init(String androidId, AndroidDriver driver){
        try{
            AdbTools.upPage(androidId);
            AdbTools.upPage(androidId);
            WebElement wl11 = null;
            try {
                AdbTools.down(androidId);
                AdbTools.down(androidId);
                wl11 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"点击展开更多\")");
            }catch (Exception e1){
                AdbTools.down(androidId);
                wl11 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"点击展开更多\")");
            }
            wl11.click();
            Thread.sleep(1000);
        }catch (Exception e){}

    }


/*
*
     * todo 1.签到
     * @param 

*/


    public static void handle1(String androidId,  AndroidDriver driver){
        AppTools.appTime();
            log.info("趣头条-签到");
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                Thread.sleep(4000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看广告视频再赚\")");
                wl1.click();
                Thread.sleep(36000);

                AdbTools.back(androidId);
            } catch (Exception e) {
                log.info("趣头条-签到异常");
            }
    }

/*
*
     * todo 2.看视频
     * @param */


    public static void handle2(String androidId,  AndroidDriver driver){
        log.info("趣头条-看视频");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
             Thread.sleep(2000);
            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"继续播放\")");
                wl2.click();
            }catch (Exception e){}

            try{
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.FrameLayout\").childSelector(className(\"android.widget.ImageView\")).fromParent(className(\"android.view.View\"))");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频再\")");
                wl2.click();
                Thread.sleep(46000);
                AdbTools.wakeup(androidId, AppConstants.startup趣头条);
                quit(androidId,driver);
            }catch (Exception e){}

            int x = RandomTools.init(8)+6;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("趣头条-看视频异常");
        }
    }
/*

*
     * todo 3.看小视频
     * @param */


    public static void handle3(String androidId,  AndroidDriver driver){

    }

/*
*
     * todo 4.看新闻
     * @param */


    public static void handle4(String androidId,  AndroidDriver driver){
        log.info("趣头条-看新闻");
        try {
            AdbTools.tap(androidId, 540, 1000);

            try{
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.FrameLayout\").childSelector(className(\"android.widget.ImageView\")).fromParent(className(\"android.view.View\"))");
                wl1.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频再\")");
                wl2.click();
                Thread.sleep(46000);
                AdbTools.wakeup(androidId, AppConstants.startup趣头条);
                quit(androidId,driver);
            }catch (Exception e){}

            int x = RandomTools.init(8)+6;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.down(androidId);
            }
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣头条-看新闻异常");
        }
    }

/*
*
     * todo 5.看小说
     * @param */


    public static void handle5(String androidId,  AndroidDriver driver){
        AppTools.appTime();
            log.info("趣头条-看小说");
            try {
                AdbTools.upPage(androidId);
                AdbTools.down(androidId);
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看小说\")");
                wl2.click();
                try {
                    AdbTools.down(androidId);
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即领取\")");
                    wl3.click();
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                AdbTools.back(androidId);

            } catch (Exception e) {
                log.info("趣头条-看小说异常");
            }
    }

/*
*
     * todo 6.看广告
     * @param */


    public static void handle6(String androidId,  AndroidDriver driver){
        log.info("趣头条-看广告");
        try{
            AdbTools.upPage(androidId);
            try {
                List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().text(\"看视频领金币\")");
                if (!CollectionUtils.isEmpty(wls)) {
                    wls.get(0).click();
                    Thread.sleep(36000);
                    AdbTools.wakeup(androidId, AppConstants.startup趣头条);
                    AdbTools.back(androidId);
                    wls.get(1).click();
                    Thread.sleep(36000);
                    AdbTools.wakeup(androidId, AppConstants.startup趣头条);
                    AdbTools.back(androidId);
                    wls.get(2).click();
                    Thread.sleep(36000);
                    AdbTools.wakeup(androidId, AppConstants.startup趣头条);
                    AdbTools.back(androidId);
                }
            }catch (Exception e){
                List<WebElement> wls1 = driver.findElementsByAndroidUIAutomator("new UiSelector().textStartsWith(\"体验\")");
                for(WebElement web:wls1){
                    web.click();
                    AdbTools.back(androidId);
                }
            }

        }catch (Exception e){
            log.info("趣头条-看广告异常");
        }

    }


/*

*
     * todo 6.1 列表看广告
     * @param 
*/


    public static void handle61(String androidId,  AndroidDriver driver){
        log.info("趣头条-列表看广告");
        try{
            Thread.sleep(1000);
            init(androidId, driver);
            WebElement wl2 = null;
            try {
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看视频领金币,每日可领6次\").fromParent(text(\"立即观看\"))");
            }catch (Exception e){
                try {
                    AdbTools.down(androidId);
                    AdbTools.down(androidId);
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看视频领金币,每日可领6次\").fromParent(text(\"立即观看\"))");
                }catch (Exception e1){
                    AdbTools.upPage(androidId);
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看视频领金币,每日可领6次\").fromParent(text(\"立即观看\"))");
                }
            }
            wl2.click();
            Thread.sleep(36000);
            AdbTools.wakeup(androidId, AppConstants.startup趣头条);
            quit(androidId,driver);
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣头条-列表看广告异常");
        }

    }


/*
*
     * todo 7.玩游戏
     * @param */


    public static void handle7(String androidId,  AndroidDriver driver){

    }


/*
*
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param 
*/


    public static void handle8(String androidId,  AndroidDriver driver){
        log.info("趣头条-领红包");
        try {
            Thread.sleep(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取\")");
            wl1.click();
            Thread.sleep(3000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textStartsWith(\"再领\")");
            wl2.click();
            Thread.sleep(36000);

            AdbTools.wakeup(androidId, AppConstants.startup趣头条);
            quit(androidId,driver);
            AdbTools.back(androidId);

        }catch (Exception e){
            log.info("趣头条-领红包异常");
        }
    }

/*


*
     * todo 9.开宝箱
     * @param 

*/

    public static void handle9(String androidId,  AndroidDriver driver){
        log.info("趣头条-开宝箱");
        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"最高\")");
            wl2.click();
            Thread.sleep(36000);

            AdbTools.wakeup(androidId, AppConstants.startup趣头条);
            quit(androidId,driver);
            AdbTools.back(androidId);

        }catch (Exception e){
            log.info("趣头条-开宝箱异常");
        }
    }

/*

*
     * todo 10.抽奖
     * @param 

*/

    public static void handle10(String androidId,  AndroidDriver driver){

    }
/*

*
     * todo 11.睡觉
     * @param */


    public static void handle11(String androidId,  AndroidDriver driver){
        log.info("趣头条-睡觉");
        int hour = LocalDateTime.now().getHour();
        if(hour==22) {
            try {
                int y = 1860;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2060;
                }
                init(androidId, driver);
                WebElement wl2 = null;
                try {
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"睡觉赚金币\")");
                } catch (Exception e) {
                    try {
                        AdbTools.down(androidId);
                        AdbTools.down(androidId);
                        wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"睡觉赚金币\")");
                    } catch (Exception e1) {
                        AdbTools.upPage(androidId);
                        wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"睡觉赚金币\")");
                    }
                }
                wl2.click();
                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"我醒来啦\")");
                    wl3.click();
                    wl3.click();
                    AdbTools.tap(androidId, 540, 1200);
                    AdbTools.tap(androidId, 540, 1290);
                } catch (Exception e) {
                    AdbTools.tap(androidId, 540, y);
                }

                quit(androidId, driver);
                AdbTools.back(androidId);

            } catch (Exception e) {
                log.info("趣头条-睡觉");
            }
        }
    }
/*

*
     * todo 12.走路
     * @param 
*/


    public static void handle12(String androidId,  AndroidDriver driver){


    }

/*

*
     * todo 13.喝水
     * @param 

*/

    public static void handle13(String androidId,  AndroidDriver driver){

    }

/*

*
     * todo 14.充电
     * @param 
*/


    public static void handle14(String androidId,  AndroidDriver driver){

    }
/*

*
     * todo 15.听歌曲
     * @param 
*/


    public static void handle15(String androidId,  AndroidDriver driver){

    }

/*
*
     * todo 16.吃饭
     * @param 

*/

    public static void handle16(String androidId,  AndroidDriver driver){



    }

/*
*
     * todo 17.分享
     * @param 
*/


    public static void handle17(String androidId,  AndroidDriver driver){

    }

/*
*
     * todo 18.摇钱树
     * @param 
*/


    public static void handle18(String androidId,  AndroidDriver driver){
        log.info("趣头条-摇钱树");
        int hour = LocalDateTime.now().getHour();
        if(hour==20) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                init(androidId, driver);
                WebElement wl2 = null;
                try {
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"摇钱树领金币\")");
                } catch (Exception e) {
                    try {
                        AdbTools.down(androidId);
                        AdbTools.down(androidId);
                        wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"摇钱树领金币\")");
                    } catch (Exception we) {
                        AdbTools.upPage(androidId);
                        wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"摇钱树领金币\")");
                    }
                }
                wl2.click();
                for (int i = 0; i < 5; i++) {
                    AdbTools.tap(androidId, 540, 1660);
                    Thread.sleep(32000);
                    AdbTools.wakeup(androidId, AppConstants.startup趣头条);
                    quit(androidId, driver);
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("趣头条-摇钱树");
            }
        }
    }

/*
*
     * todo 19.刮奖
     * @param 

*/

    public static void handle19(String androidId,  AndroidDriver driver){

    }






}


