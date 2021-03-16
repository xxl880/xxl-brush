package com.xxl.brush.app.A;

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
 * todo App趣故事新闻
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */




public class App趣故事 {
    private static Logger log = LoggerFactory.getLogger(App趣故事.class);

    
/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */

    public static void circulate(String androidId,int port,int systemPort, Map<String,Integer> map){
        try {
            log.info("********************************趣故事操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup趣故事);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(androidId);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
            wl1.click();

            handle40(androidId, driver, map);
            handle41(androidId, driver, map);
            handle42(androidId, driver, map);
            handle43(androidId, driver, map);
            handle44(androidId, driver, map);
            handle6(androidId, driver, map);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
            wl2.click();
            handle4(androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    
/**
     * todo 退出
     * @param 

     */

    public static void quit( AndroidDriver driver){

    }


/**
     * todo 清除
     * @param 

     */

    public static void clear( AndroidDriver driver){

    }



/**
     * todo 1.签到
     * @param 

     */

    public static void handle1(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣故事-签到");
        try {
            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"签到\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"签到\")");
                wl.click();
            }


            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"再赚\")");
            wl1.click();
            Thread.sleep(32000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ziqun.story:id/tt_video_ad_close_layout\")");
            wl2.click();

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-签到异常");
        }
    }


/**
     * todo 2.看视频
     * @param 
     */

    public static void handle2(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 3.看小视频
     * @param 
     */

    public static void handle3(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }




/**
     * todo 4看新闻
     * @param 
     */

    public static void handle4(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣头条-看新闻");
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.tap(androidId, 540, 1000);

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.down(androidId);
            }
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣头条-看新闻异常");
        }
    }


/**
     * todo 4.0阅读文章90秒
     * @param 
     */

    public static void handle40(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章90秒\").fromParent(text(\"+150\"))");
            } catch (Exception e) {
               AdbTools.downPage(androidId);
                 AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章90秒\").fromParent(text(\"+150\"))");
            }
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章90秒，即可获得奖励\").fromParent(text(\"去阅读\"))");
            wl1.click();

            for(int i=0;i<4;i++){
                AdbTools.down(androidId);
                Thread.sleep(2000);
                try{
                WebElement wl2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                wl2.click();
                }catch (Exception e){}
                AdbTools.tap(androidId, 540, 600);
                for(int a=0;a<8;a++){
                    AdbTools.down(androidId);
                    Thread.sleep(3000);
                    AdbTools.back(androidId);
                }
            }

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-阅读文章90秒异常");
        }
    }


/*
     * todo 4.1看文章2分钟
     * @param 
     */

    public static void handle41(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

             AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看文章2分钟\").fromParent(text(\"+150\"))");
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看文章2分钟，即可获得该金币\").fromParent(text(\"去领取\"))");
            wl1.click();

            for(int i=0;i<4;i++){
                AdbTools.down(androidId);
                Thread.sleep(2000);
                try{
                WebElement wl2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                wl2.click();
                }catch (Exception e){}
                AdbTools.tap(androidId, 540, 600);
                for(int a=0;a<8;a++){
                     AdbTools.down(androidId);
                    Thread.sleep(5000);
                    AdbTools.back(androidId);
                }
            }

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-看文章2分钟");
        }
    }

/**
     * todo 4.2 阅读文章90秒
     * @param 
     */

    public static void handle42(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            WebElement    wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章90秒\").fromParent(text(\"+100\"))");
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章90秒，即可获得奖励\").fromParent(text(\"去阅读\"))");
            wl1.click();

            for(int i=0;i<4;i++){
                AdbTools.down(androidId);
                Thread.sleep(2000);
                try{
                    WebElement wl2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                    wl2.click();
                }catch (Exception e){}
                AdbTools.tap(androidId, 540, 600);
                for(int a=0;a<8;a++){
                    AdbTools.down(androidId);
                    Thread.sleep(3000);
                    AdbTools.back(androidId);
                }
            }

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-阅读文章90秒异常");
        }
    }



/**
     * todo 4.3 阅读文章得奖励
     * @param 
     */

    public static void handle43(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            WebElement    wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章得奖励\").fromParent(text(\"+150\"))");
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读文章2分钟，即可获得收益\").fromParent(text(\"去阅读\"))");
            wl1.click();

            for(int i=0;i<4;i++){
                AdbTools.down(androidId);
                Thread.sleep(2000);
                try{
                    WebElement wl2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                    wl2.click();
                }catch (Exception e){}
                AdbTools.tap(androidId, 540, 600);
                for(int a=0;a<8;a++){
                    AdbTools.down(androidId);
                    Thread.sleep(3000);
                    AdbTools.back(androidId);
                }
            }

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-阅读文章得奖励异常");
        }
    }


/**
     * todo 4.4 看新闻赚金币
     * @param 
     */

    public static void handle44(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            WebElement    wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看新闻赚金币\").fromParent(text(\"+150\"))");
            wl.click();
            Thread.sleep(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"阅读新闻2分钟，即可领取奖励\").fromParent(text(\"去领取\"))");
            wl1.click();

            for(int i=0;i<4;i++){
                AdbTools.down(androidId);
                Thread.sleep(2000);
                try{
                    WebElement wl2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
                    wl2.click();
                }catch (Exception e){}
                AdbTools.tap(androidId, 540, 600);
                for(int a=0;a<8;a++){
                     AdbTools.down(androidId);
                    Thread.sleep(3000);
                    AdbTools.back(androidId);
                }
            }

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-看新闻赚金币异常");
        }
    }


/**
     * todo 5.看小说
     * @param 
     */

    public static void handle5(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }



/**
     * todo 6.看广告
     * @param 
     */

    public static void handle6(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣故事-看广告");
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看单个视频领金币\")");
            wl2.click();
            Thread.sleep(1000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看完整视频领金币\").fromParent(text(\"立即领取\"))");
            wl3.click();
            Thread.sleep(32000);

            WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"再赚\")");
            wl4.click();
            Thread.sleep(32000);

            WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ziqun.story:id/tt_video_ad_close_layout\")");
            wl5.click();

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("趣故事-看广告异常");
        }

    }


/**
     * todo 7.玩游戏
     * @param 
     */

    public static void handle7(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param 
     */

    public static void handle8(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 9.开宝箱
     * @param 
     */

    public static void handle9(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 10.抽奖
     * @param 
     */

    public static void handle10(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 11.睡觉
     * @param 
     */

    public static void handle11(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

/**
     * todo 12.走路
     * @param 
     */

    public static void handle12(String androidId,  AndroidDriver driver, Map<String,Integer> map){


    }


/**
     * todo 13.喝水
     * @param 
     */

    public static void handle13(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 14.充电
     * @param 
     */

    public static void handle14(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

/**
     * todo 15.听歌曲
     * @param 
     */

    public static void handle15(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 16.吃饭
     * @param 
     */

    public static void handle16(String androidId,  AndroidDriver driver, Map<String,Integer> map){



    }


/**
     * todo 17.分享
     * @param 
     */

    public static void handle17(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 18.摇钱树
     * @param 
     */
    public static void handle18(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


/**
     * todo 19.刮奖
     * @param 
     */

    public static void handle19(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


}
