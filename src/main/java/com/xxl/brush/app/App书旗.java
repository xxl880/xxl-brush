package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * todo App书旗小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App书旗 {
    private static Logger log = LoggerFactory.getLogger(App书旗.class);

    /**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort){
        try {
            log.info("********************************书旗小说操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot, androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup书旗);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"福利\")");
            wl.click();

            handle1(robot, androidId, driver);
            handle6(robot, androidId, driver);
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
        try{
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"取消\")");
            wl.click();
        }catch (Exception e){}
    }


    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("书旗小说-签到");
        try {
            robot.delay(1000);
            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"每日签到轻松得海量金币\")");
                wl.click();
            }catch (Exception e){}


            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看视频奖励立即翻倍\")");
            wl1.click();
            robot.delay(59000);

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.shuqi.controller:id/tt_video_ad_close_layout\")");
                wl2.click();
            }catch (Exception e){
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                AdbTools.process(robot, operateBack);
            }


        }catch (Exception e){
            log.info("书旗小说-签到异常");
        }
    }


    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver){
        log.info("书旗小说-看广告");
        try{
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"快速得百万金币\")");
                wl2.click();
                robot.delay(32000);

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.shuqi.controller:id/tt_video_ad_close_layout\")");
                    wl3.click();
                } catch (Exception e) {
                    String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                    AdbTools.process(robot, operateBack);
                }
        }catch (Exception e){
            log.info("书旗小说-看广告异常");
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


