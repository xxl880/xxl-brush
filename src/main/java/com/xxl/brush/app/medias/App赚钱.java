package com.xxl.brush.app.medias;

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



public class App赚钱 {
    private static Logger log = LoggerFactory.getLogger(App赚钱.class);
    /**
     * todo 1.凌晨0:00-2:00(签到)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void start(Robot robot,String robotCode){
        try{
            log.info("********************************赚钱操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl1.getLocation().getY())));
            }

            handle2(robot,androidId,driver);
            handle5(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(755), String.valueOf(wl1.getLocation().getY())));
            }

            handle18(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle9(robot,androidId,driver);
            handle11(robot,androidId,driver);

        }catch (Exception e){}

    }

    /**
     * todo 2.早上6:00-8:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section1(Robot robot,String robotCode){
        try{
            log.info("********************************赚钱操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl1.getLocation().getY())));
            }

            handle2(robot,androidId,driver);
            handle5(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(755), String.valueOf(wl1.getLocation().getY())));
            }

            handle18(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle9(robot,androidId,driver);
            handle11(robot,androidId,driver);

      }catch (Exception e){}

    }



    /**
     * todo 3.中午10：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section2(Robot robot,String robotCode){
        try{
            log.info("********************************赚钱操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl1.getLocation().getY())));
            }

            handle2(robot,androidId,driver);
            handle5(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(755), String.valueOf(wl1.getLocation().getY())));
            }
            handle18(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle9(robot,androidId,driver);
            handle11(robot,androidId,driver);

        }catch (Exception e){}

    }


    /**
     * todo 4.下午18：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section3(Robot robot,String robotCode){
        try{
            log.info("********************************赚钱操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl1.getLocation().getY())));
            }

            handle2(robot,androidId,driver);
            handle5(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(755), String.valueOf(wl1.getLocation().getY())));
            }

            handle18(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle9(robot,androidId,driver);
            handle11(robot,androidId,driver);

        }catch (Exception e){}

    }



    /**
     * todo 5.晚上22：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void section4(Robot robot,String robotCode){
        try{
            log.info("********************************赚钱操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl1.getLocation().getY())));
            }

            handle2(robot,androidId,driver);
            handle5(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(755), String.valueOf(wl1.getLocation().getY())));
            }

            handle18(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle9(robot,androidId,driver);
            handle11(robot,androidId,driver);

        }catch (Exception e){}

    }




    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String robotCode){
        try{
            log.info("********************************赚钱操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(wl1.getLocation().getY())));
            }

            handle2(robot,androidId,driver);
            handle5(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(755), String.valueOf(wl1.getLocation().getY())));
            }

            handle18(robot,androidId,driver);
            handle6(robot,androidId,driver);
            handle9(robot,androidId,driver);
            handle11(robot,androidId,driver);

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
       /* log.info("赚钱-签到");
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

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看广告视频再赚\")");
            wl1.click();
            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("赚钱-签到异常");
        }*/
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("赚钱-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"视频\")");
            wl1.click();
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(800)));

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"播放\")");
                wl2.click();
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("赚钱-看视频异常");
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

    }


    /**
     * todo 5.看小说
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver){

    }



    /**
     * todo 6 看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver){
        log.info("赚钱-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每篇最多可得480金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每篇最多可得480金币\")");
            }
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(wl2.getLocation().getY())));
            robot.delay(32000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/tt_video_ad_close_layout\")");
            wl3.click();
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/money_dialog_getcash_new2_close\")");
            wl4.click();

        }catch (Exception e){
            log.info("赚钱-看广告异常");
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
        log.info("赚钱-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领金币\")");
            wl1.click();
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"看视频再得\")");
            wl2.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("赚钱-领红包异常");
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
        log.info("赚钱-分享");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每天首次分享加800金币\").fromParent(text(\"去分享\"))");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每天首次分享加800金币\").fromParent(text(\"去分享\"))");
            }
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(wl2.getLocation().getY())));

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"朋友圈分享\")");
            wl3.click();
            robot.delay(3000);
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/task_share_getgold_tx1_1\")");
            wl4.click();
            robot.delay(32000);
            WebElement wl31 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/tt_video_ad_close_layout\")");
            wl31.click();

            WebElement wl24 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/task_share_getgold_tx2_1\")");
            wl24.click();
            robot.delay(32000);

            wl31.click();
            WebElement wl41 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/money_dialog_getcash_new2_close\")");
            wl41.click();

        }catch (Exception e){
            log.info("赚钱-分享");
        }
    }


    /**
     * todo 17.1分享
     * @param robot
     */
    public static void handle171(Robot robot,String androidId,  AndroidDriver driver){
        log.info("赚钱-分享视频");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每天分享3条视频可得1600金币\").fromParent(textContains(\"已分享\"))");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每天分享3条视频可得1600金币\").fromParent(textContains(\"已分享\"))");
            }

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(wl2.getLocation().getY())));

            robot.delay(2000);
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(800)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(800)));
            robot.delay(12000);
            AdbTools.process(robot, AdbTools.downPage(androidId));

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(800)));
            WebElement wl5 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"分享3条得\")");
            wl5.click();

            WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"微信分享\")");
            wl6.click();
            AdbTools.process(robot, operateBack);

            robot.delay(2000);
            WebElement wl7 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"看视频再得\")");
            wl7.click();


        }catch (Exception e){
            log.info("赚钱-分享视频报错");
        }
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
     * todo 20.晒收入
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("赚钱-晒收入");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("resourceId(\"com.sljh.zqxsp:id/item_money_go\").text(\"晒收入\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("resourceId(\"com.sljh.zqxsp:id/item_money_go\").text(\"晒收入\")");
            }
            wl2.click();

            robot.delay(2000);

            WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"微信分享\")");
            wl6.click();
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/task_share_getgold_tx1_1\")");
            wl4.click();
            robot.delay(32000);
            WebElement wl31 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/tt_video_ad_close_layout\")");
            wl31.click();

            WebElement wl24 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/task_share_getgold_tx2_1\")");
            wl24.click();
            robot.delay(32000);

            wl31.click();
            WebElement wl41 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sljh.zqxsp:id/money_dialog_getcash_new2_close\")");
            wl41.click();


        }catch (Exception e){
            log.info("赚钱-晒收入报错");
        }






    }



/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


