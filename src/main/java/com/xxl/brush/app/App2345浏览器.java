package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * todo AppApp2345浏览器
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App2345浏览器 {
    private static Logger log = LoggerFactory.getLogger(App2345浏览器.class);

    /**
     * todo 1.凌晨0:00-2:00(签到)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    @SneakyThrows
    public static void start(Robot robot, String robotCode){
        try {
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            appClear(robot, androidId, driver);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
            handle1(robot, androidId, driver);
            handle21(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8(robot, androidId, driver);

            wl1.click();
            handle2(robot, androidId, driver);

            wl1.click();
            handle3(robot, androidId, driver);

            wl1.click();
            handle4(robot, androidId, driver);

            wl1.click();
            handle5(robot, androidId, driver);
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
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            appClear(robot, androidId, driver);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
            handle21(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8(robot, androidId, driver);

            wl1.click();
            handle2(robot, androidId, driver);

            wl1.click();
            handle3(robot, androidId, driver);

            wl1.click();
            handle4(robot, androidId, driver);

            wl1.click();
            handle5(robot, androidId, driver);
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
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            appClear(robot, androidId, driver);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
            handle21(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8(robot, androidId, driver);

            wl1.click();
            handle2(robot, androidId, driver);

            wl1.click();
            handle3(robot, androidId, driver);

            wl1.click();
            handle4(robot, androidId, driver);

            wl1.click();
            handle5(robot, androidId, driver);
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
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            appClear(robot, androidId, driver);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
            handle21(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8(robot, androidId, driver);

            wl1.click();
            handle2(robot, androidId, driver);

            wl1.click();
            handle3(robot, androidId, driver);

            wl1.click();
            handle4(robot, androidId, driver);

            wl1.click();
            handle5(robot, androidId, driver);
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
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            appClear(robot, androidId, driver);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
            handle21(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8(robot, androidId, driver);

            wl1.click();
            handle2(robot, androidId, driver);

            wl1.click();
            handle3(robot, androidId, driver);

            wl1.click();
            handle4(robot, androidId, driver);

            wl1.click();
            handle5(robot, androidId, driver);
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
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);

            AdbTools.clear(driver);
            appClear(robot, androidId, driver);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
             handle21(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8(robot, androidId, driver);

            wl1.click();
            handle2(robot, androidId, driver);

            wl1.click();
            handle3(robot, androidId, driver);

            wl1.click();
            handle4(robot, androidId, driver);

            wl1.click();
            handle5(robot, androidId, driver);
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
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App2345浏览器极速-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"签到\")");
            wl.click();



            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("App2345浏览器极速-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App2345浏览器极速-看视频");
        try {
            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/观看视频\").fromParent(text(\"立即观看\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/观看视频\").fromParent(text(\"立即观看\"))");
            }

            robot.delay(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\") .text(\"/推荐\")");
            wl1.click();
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(270), String.valueOf(600)));
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看视频异常");
        }
    }


    /**
     * todo 3.看小视频
     * @param robot
     */
    public static void handle3(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App2345浏览器极速-看小视频");
        try {

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/18\").fromParent(text(\"立即观看\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/18\").fromParent(text(\"立即观看\"))");
            }
            wl.click();
            robot.delay(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\") .text(\"/小视频\")");
            wl1.click();
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(270), String.valueOf(600)));
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看小视频异常");
        }
    }


    /**
     * todo 4.看新闻
     * @param robot
     */
    public static void handle4(Robot robot,String androidId,  AndroidDriver driver){
        log.info("2345浏览器-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";


            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"轻松阅读可赚金币，共10轮，最高1000金币\").fromParent(text(\"立即阅读\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"轻松阅读可赚金币，共10轮，最高1000金币\").fromParent(text(\"立即阅读\"))");
            }
            wl.click();

            int x = RandomTools.init(3)+5;
            for (int a = 0; a < x; a++) {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\") .text(\"阅读可领金币\")");

                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf( wls.get(0).getLocation().getY()+200)));
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, operateBack);
                AdbTools.process(robot, operateBack);
            }

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("2345浏览器-看新闻异常");
        }
    }


    /**
     * todo 4.1看首页新闻
     * @param robot
     */
    public static void handle41(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App2345浏览器极速-看首页新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/15\").fromParent(text(\"立即阅读\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/15\").fromParent(text(\"立即阅读\"))");
            }
            wl.click();
            robot.delay(1000);


            int x = RandomTools.init(20);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(8000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                for(int i=0;i<6;i++){
                    robot.delay(RandomTools.init(6000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看首页新闻异常");
        }
    }



    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App2345浏览器极速-看小说");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.downPage(androidId));
            AdbTools.process(robot, AdbTools.downPage(androidId));
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"正常阅读小说，每天最高可获得1000金币\").fromParent(text(\"立即阅读\"))");
            wl.click();
            robot.delay(1000);


            int x = RandomTools.init(20);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(8000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1600)));
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"开始阅读\")");
                wl3.click();
                robot.delay(2000);
                for(int i=0;i<20;i++){
                    robot.delay(RandomTools.init(6000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
                AdbTools.process(robot, operateBack);
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看小说异常");
        }
    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver){


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
        log.info("App2345浏览器极速-领红包");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领钱\")");
            wl2.click();

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("App2345浏览器极速-领红包异常");
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
     * todo 20.app清除
     * @param robot
     */
    public static void appClear(Robot robot,String androidId,  AndroidDriver driver){
      try{
          robot.delay(1000);

          WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即升级\")");
          wl3.click();
          robot.delay(2000);
          WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"确定下载\")");
          wl4.click();
          robot.delay(3000);
          WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"继续安装\")");
          wl5.click();
          robot.delay(22000);
      }catch (Exception e){}


    }



    /**
     * todo 21.搜索
     * @param robot
     */
    public static void handle21(Robot robot,String androidId,  AndroidDriver driver){
        try {
            robot.delay(1000);

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"正常搜索可获奖励，每天2次，最高250金币\").fromParent(text(\"立即搜索\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"正常搜索可获奖励，每天2次，最高250金币\").fromParent(text(\"立即搜索\"))");
            }
            wl2.click();

            for(int i=0;i<2;i++) {
                List<String> list = new ArrayList();
                list.add("ligangjianying");
                list.add("jianqianyankai");
                list.add("tianjingdiyi");
                list.add("detianduhou");
                list.add("chuitousanqi");
                list.add("moshouchenggui");
                list.add("gangbiziyong");
                list.add("lijingtuzhi");
                list.add("xinkuangshenyi");
                list.add("duoduobiren");
                list.add("haogaowuyuan");
                list.add("heaikeqin");
                list.add("jianfengshiduo");
                list.add("yuanmuqiuyu");
                list.add("kuizhirenkou");
                list.add("laojianjuhua");
                list.add("maogusongran");
                list.add("mingguanjiuzhou");
                list.add("ouxinlixue");
                list.add("rencaijiji");
                list.add("ruyuanyichuang");
                list.add("ruobujingfeng");
                list.add("sesanbanlan");
                list.add("bixinliyi");
                list.add("suijiyingbian");
                list.add("chujiubuxin");
                list.add("haogaowuyuan");

                WebElement wl3 = driver.findElementByAndroidUIAutomator("resourceId(\"com.browser2345:id/home_urlbar\").childSelector(textContains(\"...\"))");
                wl3.click();
                AdbTools.process(robot, AdbTools.text(androidId, list.get(RandomTools.init(23))));
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(1000), String.valueOf(wl3.getLocation().getY())));
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(680)));
            }

        }catch (Exception e){}


    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


