package com.xxl.brush.app.sports;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.awt.*;
import java.util.List;
import java.util.Map;

/**
 * todo App多宝运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App多宝 {
    private static Logger log = LoggerFactory.getLogger(App多宝.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String, String> map){

        try{
            log.info("********************************多宝操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup多宝);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每日打卡\")");
                wl.click();
            }catch (Exception e){}
            handle21(robot, androidId, driver, map);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"存钱罐\")");
                wl.click();
            }catch (Exception e){ }
            handle9(robot, androidId, driver, map);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"走路赚\")");
                wl.click();
            }catch (Exception e){ }
            handle8(robot, androidId, driver, map);
            handle9(robot, androidId, driver, map);
            handle12(robot, androidId, driver, map);
            handle19(robot, androidId, driver, map);
            handle22(robot, androidId, driver, map);
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
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
       log.info("多宝-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即打卡\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即打卡\")");
                wl.click();
            }
            robot.delay(1000);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"收下\")");
            wl1.click();
            robot.delay(32000);
            quit(robot, androidId, driver, map);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("多宝-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 3.看小视频
     * @param robot
     */
    public static void handle3(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 4.看新闻
     * @param robot
     */
    public static void handle4(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){


    }


    /**
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
        log.info("多宝-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/tv_water\")");
            for(WebElement wl:wls){
                wl.click();
                robot.delay(3000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"翻倍\")");
                wl1.click();
                robot.delay(32000);
                quit(robot, androidId, driver, map);
            }

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("多宝-领红包异常");
        }
    }



    /**
     * todo 9.开宝箱-存钱罐
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
        log.info("多宝-存钱罐");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/tv_water\")");
            for(WebElement wl:wls){
                wl.click();
                robot.delay(3000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"收下\")");
                wl1.click();
                robot.delay(32000);
                quit(robot, androidId, driver, map);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("多宝-存钱罐异常");
        }
    }


    /**
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 11.睡觉
     * @param robot
     */
    public static void handle11(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
        log.info("多宝-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"兑换金币\")");
            wl1.click();

            robot.delay(2000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"翻倍\")");
            wl2.click();
            robot.delay(32000);
            quit(robot, androidId, driver, map);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("多宝-走路异常");
        }

    }


    /**
     * todo 13.喝水
     * @param robot
     */
    public static void handle13(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }


    /**
     * todo 14.充电
     * @param robot
     */
    public static void handle14(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }

    /**
     * todo 15.听歌曲
     * @param robot
     */
    public static void handle15(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }

    /**
     * todo 16.吃饭
     * @param robot
     */
    public static void handle16(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){



    }

    /**
     * todo 17.分享
     * @param robot
     */
    public static void handle17(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }

    /**
     * todo 18.摇钱树
     * @param robot
     */
    public static void handle18(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){

    }

    /**
     * todo 19.刮奖
     * @param robot
     */
    public static void handle19(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
        log.info("多宝-刮奖");
        try{
            robot.delay(1000);
            List<WebElement> wls = null ;
            AdbTools.process(robot, AdbTools.down(androidId));
            wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"om.lotus.town.news:id/tv_reward\")");
            if(CollectionUtils.isEmpty(wls)){
                AdbTools.process(robot, AdbTools.down(androidId));
                wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"om.lotus.town.news:id/tv_reward\")");
            }
            for(WebElement wl:wls){
                robot.delay(2000);
                wl.click();
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/gv_card\")");
                AdbTools.process(robot, AdbTools.tapDraw(androidId, wl2.getLocation().getX()+20, wl2.getLocation().getY()+20));
                robot.delay(5000);
                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/iv_type\")");
                    wl3.click();
                    robot.delay(32000);
                }catch (Exception e){}
                quit(robot, androidId, driver, map);
            }
        }catch (Exception e){
            log.info("多宝-刮奖异常");
        }
    }


    /**
     * todo 20.退出
     * @param robot
     */
    public static void quit(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
       try{
           robot.delay(1000);
           WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/tt_video_ad_close_layout\")");
           wl2.click();
       }catch (Exception e){ }

        try{
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/iv_close\")");
            wl2.click();
        }catch (Exception e){ }

    }



    /**
     * todo 21.打卡
     * @param robot
     */
    public static void handle21(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
        log.info("多宝-打卡");
        try{
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取\")");
            wl2.click();
            robot.delay(2000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"收下\")");
            wl1.click();
            robot.delay(32000);
            quit(robot, androidId, driver, map);

        }catch (Exception e){
            log.info("多宝-打卡异常");
        }
    }



    /**
     * todo 22.礼包
     * @param robot
     */
    public static void handle22(Robot robot,String androidId,  AndroidDriver driver, Map<String,String> map){
        log.info("多宝-礼包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.lotus.town.news:id/tv_have_receive\")");
            for(WebElement wl:wls){
                wl.click();
                robot.delay(3000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"收下\")");
                wl1.click();
                robot.delay(32000);
                quit(robot, androidId, driver, map);
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("多宝-礼包异常");
        }
    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


