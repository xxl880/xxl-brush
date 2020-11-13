package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
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
 * todo App快手
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App快手极速 {
    private static Logger log = LoggerFactory.getLogger(App快手极速.class);

    /**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        AppTools.appTime();
            try {
                log.info("********************************快手极速操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(robot, androidId);

                log.info("2.启动app");
                AdbTools.startup(robot, androidId, AppConstants.startup快手);

                log.info("3.启动appium");
                AndroidDriver driver = AppiumTools.init(androidId, port, systemPort);

                log.info("4.清除");
                AdbTools.clear(driver);
                clear(robot, driver);

                handle2(robot, androidId, driver, map);

                try {
                    WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"/6\")");
                    wl.click();
                } catch (Exception e) {
                    if (androidId.equals(PhoneConstants.phone001)) {
                        AdbTools.process(robot, AdbTools.tap(androidId, 100, 810));
                    } else if (androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.process(robot, AdbTools.tap(androidId, 100, 650));
                    } else {
                        AdbTools.process(robot, AdbTools.tap(androidId, 90, 440));
                    }
                }

                handle1(robot, androidId, driver, map);
                handle6(robot, androidId, driver, map);
                handle9(robot, androidId, driver, map);
                handle20(robot, androidId, driver, map);

            } catch (Exception e) {
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
            WebElement wl11 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.kuaishou.nebula:id/login_dialog_cancel\")");
            wl11.click();
        }catch (Exception e){}
    }

    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
            log.info("快手极速-签到");
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
                robot.delay(1000);
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即签到\")");
                    wl2.click();
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"邀请好友赚更多\")");
                    wl3.click();
                    robot.delay(1000);
                    AdbTools.process(robot, operateBack);
                    return;
                } catch (Exception e) {
                }

            } catch (Exception e) {
                log.info("快手极速-签到异常");
            }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("快手极速-看视频");
        try {
            int x = RandomTools.init(6)+6;
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("快手极速-看视频异常");
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
            log.info("快手极速-看广告");
            try {
                String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").textContains(\"task_icon_list_video\").fromParent(textContains(\"福利\"))");
                int x = wl2.getLocation().getX();
                int y = wl2.getLocation().getY();
                for (int i = 0; i < 10; i++) {
                    int a = RandomTools.init(12000);
                    robot.delay(a);
                    AdbTools.process(robot, AdbTools.tap(androidId, x, y));
                    robot.delay(30000 + a);
                    AdbTools.process(robot, operateBack);
                }
            } catch (Exception e) {
                log.info("快手极速-看广告异常");
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
        log.info("快手极速-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();

            WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"HGGPyDxR67B6PpvwC+B+CeSgKklEgAAAABJRU5ErkJggg==\")");
            wl4.click();

        }catch (Exception e){
            log.info("快手极速-开宝箱异常");
        }
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
     * todo 20.直播
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        int hour = LocalDateTime.now().getHour();
            log.info("快手极速-直播");
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                WebElement wl3 = null;
                try {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.down(androidId));
                    wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").text(\"看直播领金币\")");
                } catch (Exception e) {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.view.View\").text(\"看直播领金币\")");
                }
                AdbTools.process(robot, AdbTools.tap(androidId, 880, wl3.getLocation().getY()));

                for (int i = 0; i < 10; i++) {
                    int a = RandomTools.init(6000);
                    robot.delay(30000 + a);
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                }

            } catch (Exception e) {
                log.info("快手极速-直播异常");
            }
    }



/*

    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
       //  handle(robot,"phone003");
        AndroidDriver driver = AppiumTools.init("phone003");
        log.info(driver.getPageSource());
        robot.delay(3000);
        WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"HGGPyDxR67B6PpvwC+B+CeSgKklEgAAAABJRU5ErkJggg==\")");
        wl4.click();
    }
*/


}


