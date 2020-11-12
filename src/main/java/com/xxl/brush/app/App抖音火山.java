package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * todo App抖音火山
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App抖音火山 {
    private static Logger log = LoggerFactory.getLogger(App抖音火山.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************抖音火山操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup抖音火山);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            AdbTools.clear(driver);
            clear(robot,androidId,driver);
            AdbTools.process(robot, AdbTools.tap(androidId, 270, 600));
            handle2(robot, androidId, driver, map);
            clear(robot,androidId,driver);
            handle1(robot, androidId, driver, map);
            handle6(robot, androidId, driver, map);

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
    public static void clear(Robot robot, String androidId, AndroidDriver driver){
        try {
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textStartsWith(\"立即\")");
            wl.click();
            robot.delay(12000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"继续安装\")");
            wl2.click();
            robot.delay(27000);
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"完成\")");
            wl3.click();
            AdbTools.wakeup(robot, androidId, AppConstants.startup抖音火山);
        }catch (Exception e){ }
    }



    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("抖音火山-签到");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==1||hour==2) {
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                AdbTools.process(robot, AdbTools.tap(androidId, 990, 290));
                robot.delay(2000);
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看广告视频再赚\")");
                    wl2.click();
                    robot.delay(32000);
                } catch (Exception e) {
                }
                AdbTools.process(robot, operateBack);
            } catch (Exception e) {
                log.info("抖音火山-签到异常");
            }
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("抖音火山-看视频");
        try {
            int x = RandomTools.init(8)+8;
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(6000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(8)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("抖音火山-看视频异常");
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
        log.info("抖音火山-看广告");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.tap(androidId, 990, 290));
            robot.delay(2000);

            WebElement w2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"去领取\")");
            w2.click();
            robot.delay(32000);
            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("抖音火山-看广告异常");
        }
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





/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


