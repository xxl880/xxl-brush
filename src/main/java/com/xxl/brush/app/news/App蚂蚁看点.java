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
import java.util.Map;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App蚂蚁看点 {
    private static Logger log = LoggerFactory.getLogger(App蚂蚁看点.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************蚂蚁看点操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup蚂蚁看点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            AdbTools.clear(driver);
            clear(robot, androidId, driver, map);

            handle4(robot, androidId, driver, map);

            handle2(robot, androidId, driver, map);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("resourceId(\"com.ldzs.zhangxin:id/tv_home_tab\")");
                wl.click();
            }catch (Exception e){ }

            handle8(robot, androidId, driver, map);
            handle81(robot, androidId, driver, map);
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
       log.info("蚂蚁看点-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement  wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即签到\")");
            wl.click();
            robot.delay(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"免费领取\")");
            wl1.click();
            robot.delay(32000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/iv_close\")");
            wl2.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("蚂蚁看点-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("蚂蚁看点-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/tv_find_tab\")");
            wl1.click();

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"取消\")");
                wl2.click();
                robot.delay(RandomTools.init(36000));
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("蚂蚁看点-看视频异常");
        }
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
        log.info("蚂蚁看点-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/center_button\")");
            wl1.click();

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"阅读文章\").fromParent(text(\"去完成\"))");
                wl2.click();
                for(int i=0;i<3;i++) {
                    try {
                        WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"close200713\")");
                        wl21.click();
                    }catch (Exception e){}
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    WebElement wl22 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"下一章\")");
                    wl22.click();
                }
                try{
                    AdbTools.process(robot, operateBack);
                    WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"close200713\")");
                    wl21.click();
                }catch (Exception e){}
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}


            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"阅读红包\").fromParent(text(\"去完成\"))");
                wl3.click();
                for(int i=0;i<6;i++) {
                    try {
                        WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"close200713\")");
                        wl21.click();
                    }catch (Exception e){}
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    robot.delay(9000);
                    WebElement wl22 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"下一章\")");
                    wl22.click();
                }
                try{
                    AdbTools.process(robot, operateBack);
                    WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"close200713\")");
                    wl21.click();
                }catch (Exception e){}
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}


            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"搜索领金币\").fromParent(text(\"去完成\"))");
                wl4.click();
                for(int i=0;i<16;i++) {
                    try {
                        WebElement wl212 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"今日热词 refresh.png 换一批\")");
                        wl212.click();
                    }catch (Exception e11){}
                    try {
                        WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"close200713\")");
                        wl21.click();
                    }catch (Exception e11){}
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 1500));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    robot.delay(RandomTools.init(6000));
                    AdbTools.process(robot, operateBack);

                    WebElement wl22 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"下一章\")");
                    wl22.click();
                }
                try{
                    AdbTools.process(robot, operateBack);
                    WebElement wl21 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"close200713\")");
                    wl21.click();
                }catch (Exception e){}
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}



            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("蚂蚁看点-看新闻异常");
        }
    }


    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

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
        log.info("蚂蚁看点-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取\")");
            wl1.click();

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金币翻倍\")");
            wl2.click();
            robot.delay(32000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/tt_video_ad_close_layout\")");
            wl3.click();
            robot.delay(3000);

            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/iv_close\")");
            wl4.click();

        }catch (Exception e){
            log.info("蚂蚁看点-领红包异常");
        }
    }


    /**
     * todo 8.1领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle81(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("蚂蚁看点-点我领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/ll_article_list_video\")");
            wl4.click();
            robot.delay(59000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/tt_video_ad_close_layout\")");
            wl3.click();
            robot.delay(3000);

            WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/iv_close\")");
            wl6.click();

        }catch (Exception e){
            log.info("蚂蚁看点-领红包异常");
        }
    }


    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

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

    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){


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
     * todo 20.清除
     * @param robot
     */
    public static void clear(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
          try{
              try {
                  WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ldzs.zhangxin:id/iv_close\")");
                  wl3.click();
              }catch (Exception e1){}
              WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button2\")");
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


