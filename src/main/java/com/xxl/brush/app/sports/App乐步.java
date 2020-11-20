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
import org.springframework.util.CollectionUtils;

import java.awt.*;
import java.util.List;
import java.util.Map;

*/
/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 *//*




public class App乐步 {
    private static Logger log = LoggerFactory.getLogger(App乐步.class);

    */
/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     *//*

    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************趣头条操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup趣头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("resourceId(\"com.jifen.qukan:id/afk\")");
                wl.click();
            }catch (Exception e){
                //AdbTools.process(robot, AdbTools.tap(androidId, 540), 1641)));
            }

            handle8(robot, androidId, driver, map);
            handle4(robot, androidId, driver, map);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"小视频\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, 540, wl1.getLocation().getY()));
            }
            handle2(robot, androidId, driver, map);

            handle5(robot, androidId, driver, map);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
                AdbTools.process(robot, AdbTools.tap(androidId, 755, wl1.getLocation().getY()));
            }
            handle18(robot, androidId, driver, map);
            handle61(robot, androidId, driver, map);
            handle6(robot, androidId, driver, map);
            handle9(robot, androidId, driver, map);
            handle11(robot, androidId, driver, map);
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
       */
/* log.info("趣头条-签到");
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
            log.info("趣头条-签到异常");
        }*//*

    }


    */
/**
     * todo 2.看视频
     * @param robot
     *//*

    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣头条-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            AdbTools.process(robot, AdbTools.tap(androidId, 540, wl1.getLocation().getY()));

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
            log.info("趣头条-看视频异常");
        }
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
        log.info("趣头条-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.tap(androidId, 540, 1000));

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("趣头条-看新闻异常");
        }
    }


    */
/**
     * todo 5.看小说
     * @param robot
     *//*

    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣头条-看小说");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl1.click();

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看小说\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即领取\")");
            wl3.click();

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("趣头条-看小说异常");
        }
    }


    */
/**
     * todo 6.看广告
     * @param robot
     *//*

    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣头条-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().text(\"看视频领金币\")");
            if(!CollectionUtils.isEmpty(wls)){
                wls.get(0).click();
                robot.delay(32000);
                AdbTools.process(robot, operateBack);
                wls.get(1).click();
                robot.delay(32000);
                AdbTools.process(robot, operateBack);
                wls.get(2).click();
                robot.delay(32000);
                AdbTools.process(robot, operateBack);
            }

        }catch (Exception e){
            log.info("趣头条-看广告异常");
        }

    }



    */
/**
     * todo 6.1 列表看广告
     * @param robot
     *//*

    public static void handle61(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣头条-列表看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看视频领金币,每日可领6次\").fromParent(text(\"立即观看\"))");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"观看视频领金币,每日可领6次\").fromParent(text(\"立即观看\"))");
            }
            wl2.click();
            robot.delay(32000);


        }catch (Exception e){
            log.info("趣头条-列表看广告异常");
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
        log.info("趣头条-领红包");
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
            log.info("趣头条-领红包异常");
        }
    }



    */
/**
     * todo 9.开宝箱
     * @param robot
     *//*

    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("趣头条-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"最高\")");
            wl2.click();

            robot.delay(31000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("趣头条-开宝箱异常");
        }
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
        log.info("趣头条-睡觉");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"睡觉赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"睡觉赚金币\")");
            }
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
            wl3.click();
            robot.delay(32000);

        }catch (Exception e){
            log.info("趣头条-睡觉");
        }
    }

    */
/**
     * todo 12.走路
     * @param robot
     *//*

    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){


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
        log.info("趣头条-摇钱树");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"摇钱树领金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"摇钱树领金币\")");
            }
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"摇钱树领金币\").fromParent(textStartsWith(\"领\"))");
            wl3.click();
            robot.delay(32000);
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("趣头条-摇钱树");
        }
    }

    */
/**
     * todo 19.刮奖
     * @param robot
     *//*

    public static void handle19(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

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
