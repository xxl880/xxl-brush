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
 * todo App微鲤看看新闻
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App微鲤看看 {
    private static Logger log = LoggerFactory.getLogger(App微鲤看看.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try{
        log.info("********************************微鲤看看操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup微鲤看看);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
        try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl1.click();
            handle1(robot, androidId, driver);
            handle8(robot, androidId, driver);
        }catch (Exception e){}

        handle2(robot,androidId,driver);
        handle4(robot,androidId,driver);

        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cn.weli.story:id/iv_tab_2\")");
            wl2.click();
        }catch (Exception e){  }
        handle20(robot,androidId,driver);
        handle21(robot,androidId,driver);
        handle6(robot,androidId,driver);
        }catch (Exception e){}


    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
       log.info("微鲤看看-签到");
        try {
            WebElement wl =  null;
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

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频立领\")");
            wl1.click();
            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("微鲤看看-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微鲤看看-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cn.weli.story:id/iv_tab_1\")");
            wl1.click();

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"继续播放\")");
                wl2.click();
            }catch (Exception e){}

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("微鲤看看-看视频异常");
        }
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
        log.info("微鲤看看-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"cn.weli.story:id/iv_tab_0\")");
            wl1.click();
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(9000));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(660)));
                for(int i=0;i<8;i++) {
                    robot.delay(RandomTools.init(15000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("微鲤看看-看新闻异常");
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
        log.info("微鲤看看-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看3次指定视频，每次均可获得大额金币奖励\").fromParent(text(\"看视频\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看3次指定视频，每次均可获得大额金币奖励\").fromParent(text(\"看视频\"))");
            }
            wl.click();
            robot.delay(59000);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("微鲤看看-看广告异常");
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
        log.info("微鲤看看-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领取\")");
            wl1.click();

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"再领\")");
            wl2.click();
            robot.delay(32000);

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("微鲤看看-领红包异常");
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
     * todo 20.搜索
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微鲤看看-搜索");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即搜索\")");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即搜索\")");
            }
            wl.click();

            for(int a=0;a<12;a++) {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去搜索+400\")");
                wl2.click();
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(660)));
                for (int i = 0; i < 8; i++) {
                    robot.delay(2000);
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }

            for(int a=0;a<22;a++) {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去搜索+500\")");
                wl2.click();
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(660)));
                for (int i = 0; i < 8; i++) {
                    robot.delay(2000);
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }

            for(int a=0;a<32;a++) {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去搜索+600\")");
                wl2.click();
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(660)));
                for (int i = 0; i < 8; i++) {
                    robot.delay(2000);
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("微鲤看看-搜索异常");
        }
    }

    /**
     * todo 21.分享
     * @param robot
     */
    public static void handle21(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微鲤看看-分享");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"分享视频给微信好友，好友观看后可领取50金币\").fromParent(text(\"去分享\"))");
                wl1.click();
                robot.delay(2000);
                AdbTools.process(robot, operateBack);
                wl1.click();
                robot.delay(1000);
            }catch (Exception e){}

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"分享微鲤看看到朋友圈领金币\").fromParent(text(\"去分享\"))");
                wl2.click();
                robot.delay(2000);
                AdbTools.process(robot, operateBack);
                wl2.click();
                robot.delay(1000);
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"分享微鲤看看到微信群中领金币\").fromParent(text(\"去分享\"))");
                wl3.click();
                robot.delay(2000);
                AdbTools.process(robot, operateBack);
                wl3.click();
                robot.delay(1000);
            }catch (Exception e){}

        }catch (Exception e){
            log.info("微鲤看看-分享异常");
        }
    }




/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


