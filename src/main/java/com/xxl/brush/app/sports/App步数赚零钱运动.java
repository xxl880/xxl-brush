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

/**
 * todo App步数赚零钱运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App步数赚零钱运动 {
    private static Logger log = LoggerFactory.getLogger(App步数赚零钱运动.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        log.info("********************************步数赚零钱操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup步数赚零钱);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

        try {
            clear(robot,androidId,driver);
            WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.szwx.cfbsz:id/id_tab\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(400), String.valueOf(wl.getLocation().getY())));
        }catch (Exception e){ }
        handle1(robot,androidId,driver);

        try {
            clear(robot,androidId,driver);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.szwx.cfbsz:id/id_tab\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(130), String.valueOf(wl1.getLocation().getY())));
        }catch (Exception e){ }

        handle8(robot,androidId,driver);

    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("步数赚零钱-签到");
        try {
            clear(robot,androidId,driver);
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
            clear(robot,androidId,driver);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"翻倍领取\")");
            wl1.click();
            robot.delay(32000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"跳过\")");
            wl2.click();
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步数赚零钱-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){

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
        log.info("步数赚零钱-领红包");
        try {
            //每日累计计步开红包
            try {
                robot.delay(1000);
                clear(robot, androidId, driver);
                List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.szwx.cfbsz:id/rl_item_day_red\")");
                for(WebElement wl:wls){
                    int ss = wls.indexOf(wl);
                    if(ss==3){
                        break;
                    }
                    robot.delay(1000);
                    wl.click();
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍领取\")");
                    wl2.click();
                    robot.delay(32000);
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"跳过\")");
                    wl3.click();
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍成功\")");
                    wl4.click();
                }

            }catch (Exception e){}

            //步数金币
           try {
               robot.delay(1000);
               clear(robot, androidId, driver);
               WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"步数金币\")");
               wl1.click();
               robot.delay(3000);
               try {
                   WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍领取\")");
                   wl2.click();
               }catch (Exception e){}
               robot.delay(32000);
               WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"跳过\")");
               wl3.click();
               WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍成功\")");
               wl4.click();
           }catch (Exception e){}
            //视频步数
            try {
                robot.delay(1000);
                clear(robot, androidId, driver);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"视频步数\")");
                wl1.click();
                robot.delay(3000);
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍领取\")");
                    wl2.click();
                }catch (Exception e){}
                robot.delay(32000);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"跳过\")");
                wl3.click();
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍成功\")");
                wl4.click();
            }catch (Exception e){}
            //领红包
            try {
                robot.delay(1000);
                clear(robot, androidId, driver);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领红包\")");
                wl1.click();
                robot.delay(3000);
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍领取\")");
                    wl2.click();
                }catch (Exception e){}
                robot.delay(32000);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"跳过\")");
                wl3.click();
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍成功\")");
                wl4.click();
            }catch (Exception e){}
            //视频红包
            try {
                robot.delay(1000);
                clear(robot, androidId, driver);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"视频红包\")");
                wl1.click();
                robot.delay(3000);
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍领取\")");
                    wl2.click();
                }catch (Exception e){}
                robot.delay(32000);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"跳过\")");
                wl3.click();
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"翻倍成功\")");
                wl4.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("步数赚零钱-领红包异常");
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
     * todo 20.清除
     * @param robot
     */
    public static void clear(Robot robot,String androidId,  AndroidDriver driver){
        try{
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.szwx.cfbsz:id/tt_insert_dislike_icon_img\")");
            wl2.click();
        }catch (Exception e){}



    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


