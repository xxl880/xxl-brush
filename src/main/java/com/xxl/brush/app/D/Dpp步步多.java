/*
package com.xxl.brush.app.sports;

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

*/
/**
 * todo App步步多运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 *//*




public class App步步多 {
    private static Logger log = LoggerFactory.getLogger(App步步多.class);

    */
/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     *//*

    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************步步多操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup步步多);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"赚钱\")");
                wl.click();
            }catch (Exception e){ }
            handle5(robot, androidId, driver, map);
            handle6(robot, androidId, driver, map);
            handle61(robot, androidId, driver, map);
            handle62(robot, androidId, driver, map);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"走走\")");
                wl.click();
            }catch (Exception e){ }
            handle8(robot, androidId, driver, map);
            handle12(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    */
/**
     * todo 退出
     * @param robot

     *//*

    public static void quit(Robot robot, AndroidDriver driver){

    }


    */
/**
     * todo 清除
     * @param robot

     *//*

    public static void clear(Robot robot, AndroidDriver driver){

    }




    */
/**
     * todo 1.签到
     * @param robot

     *//*

    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
       log.info("步步多-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                wl.click();
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
                wl.click();
            }

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"金币翻倍\")");
            wl1.click();
            robot.delay(32000);
            quit(robot, androidId, driver, map);

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步多-签到异常");
        }
    }


    */
/**
     * todo 2.看视频
     * @param robot
     *//*

    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 3.看小视频
     * @param robot
     *//*

    public static void handle3(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 4.看新闻
     * @param robot
     *//*

    public static void handle4(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 5.看小说
     * @param robot
     *//*

    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("步步多-看小说");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"海量免费小说，边看边赚钱\").fromParent(text(\"去完成\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"海量免费小说，边看边赚钱\").fromParent(text(\"去完成\"))");
            }
            wl.click();

            AdbTools.process(robot, AdbTools.down(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, 540, 1200));
            for(int i=0;i<6;i++){
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"金币翻倍\")");
            wl1.click();
            robot.delay(32000);
            quit(robot, androidId, driver, map);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步多-看小说异常");
        }

    }


    */
/**
     * todo 6.看广告
     * @param robot
     *//*

    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("步步多-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"海量趣味视频，每次观看都能获得高额奖励\").fromParent(text(\"去完成\"))");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"海量趣味视频，每次观看都能获得高额奖励\").fromParent(text(\"去完成\"))");
            }
            wl.click();
            robot.delay(45000);
            quit(robot, androidId, driver, map);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步多-看广告异常");
        }

    }

    */
/**
     * todo 6.1看广告
     * @param robot
     *//*

    public static void handle61(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("步步多-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.downPage(androidId));
            AdbTools.process(robot, AdbTools.downPage(androidId));
            WebElement  wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"每日签到领红包\").fromParent(text(\"去完成\"))");
            wl.click();
            for(int i=0;i<8;i++){
                robot.delay(2000);
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            robot.delay(50000);

          quit(robot, androidId, driver, map);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步多-看广告异常");
        }

    }


    */
/**
     * todo 6.2看广告
     * @param robot
     *//*

    public static void handle62(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("步步多-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.downPage(androidId));
            AdbTools.process(robot, AdbTools.downPage(androidId));
            WebElement  wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"全民和我一起领红包\").fromParent(text(\"去完成\"))");
            wl.click();
            for(int i=0;i<8;i++){
                robot.delay(2000);
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            robot.delay(50000);

            quit(robot, androidId, driver, map);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步多-看广告异常");
        }

    }




    */
/**
     * todo 7.玩游戏
     * @param robot
     *//*

    public static void handle7(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     *//*

    public static void handle8(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("步步多-领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ch.bubuduo:id/walk_gold_2\")");
                wl1.click();
                robot.delay(2000);
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(45000);
                quit(robot, androidId, driver, map);
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ch.bubuduo:id/walk_gold_3\")");
                wl1.click();
                robot.delay(2000);
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(45000);
                quit(robot, androidId, driver, map);
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ch.bubuduo:id/walk_gold_1\")");
                wl1.click();
                robot.delay(2000);
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(45000);
                quit(robot, androidId, driver, map);
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ch.bubuduo:id/walk_gold_4\")");
                wl1.click();
                robot.delay(2000);
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(45000);
                quit(robot, androidId, driver, map);
                AdbTools.process(robot, operateBack);
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步多-领红包异常");
        }
    }



    */
/**
     * todo 9.开宝箱
     * @param robot
     *//*

    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 10.抽奖
     * @param robot
     *//*

    public static void handle10(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 11.睡觉
     * @param robot
     *//*

    public static void handle11(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 12.走路
     * @param robot
     *//*

    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("步步多-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取金币\")");
            wl1.click();

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
            wl2.click();
            robot.delay(45000);

            quit(robot, androidId, driver, map);
            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("步步多-走路异常");
        }

    }


    */
/**
     * todo 13.喝水
     * @param robot
     *//*

    public static void handle13(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 14.充电
     * @param robot
     *//*

    public static void handle14(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 15.听歌曲
     * @param robot
     *//*

    public static void handle15(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 16.吃饭
     * @param robot
     *//*

    public static void handle16(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){



    }

    */
/**
     * todo 17.分享
     * @param robot
     *//*

    public static void handle17(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 18.摇钱树
     * @param robot
     *//*

    public static void handle18(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 19.刮奖
     * @param robot
     *//*

    public static void handle19(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }



    */
/**
     * todo 20.退出
     * @param robot
     *//*

    public static void quit(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"最高\")");
            wl2.click();
        }catch (Exception e){}

        try {
            robot.delay(1000);
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.ImageView\").text(\"\")");
            wl3.click();
        }catch (Exception e){}

    }



*/
/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*//*



}


*/
