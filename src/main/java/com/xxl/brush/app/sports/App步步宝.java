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
import java.util.List;

/**
 * todo App步步宝运动
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App步步宝 {
    private static Logger log = LoggerFactory.getLogger(App步步宝.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        try{
        log.info("********************************步步宝操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup步步宝);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

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
        }catch (Exception e){
            e.printStackTrace();
        }

    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
       log.info("步步宝-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/qiandao\")");
            wl.click();

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/doublebtn\")");
            wl1.click();
            robot.delay(32000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/channel\")");
            wl2.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步宝-签到异常");
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
        log.info("步步宝-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));

            int x = RandomTools.init(16);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步宝-看新闻异常");
        }
    }


    /**
     * todo 4.1看赚赚新闻
     * @param robot
     */
    public static void handle41(Robot robot,String androidId,  AndroidDriver driver){
        log.info("步步宝-1看赚赚新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"新闻赚\")");
            wl1.click();

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.view.View\").text(\"去完成\")");
            for(WebElement wle :wls){
                robot.delay(2000);
                wle.click();
                for (int a = 0; a < 3; a++) {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(600)));
                    robot.delay(2000);
                    for(int i=0;i<6;i++){
                        robot.delay(RandomTools.init(6000)+18000);
                        AdbTools.process(robot, AdbTools.down(androidId));
                    }
                    AdbTools.process(robot, operateBack);
                }

            }

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步宝-1看赚赚新闻异常");
        }
    }



    /**
     * todo 4.2首页-看看赚新闻
     * @param robot
     */
    public static void handle42(Robot robot,String androidId,  AndroidDriver driver){
        log.info("步步宝-首页-看看赚新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/main_kankanzhuan\")");
            wl1.click();

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.view.View\").text(\"点击领取");
            for(WebElement wle :wls){
                robot.delay(2000);
                wle.click();
                for (int a = 0; a < 30; a++) {
                    AdbTools.process(robot, AdbTools.down(androidId));
                    robot.delay(1000);
                }
                AdbTools.process(robot, operateBack);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金币翻倍\")");
                wl3.click();
                robot.delay(32000);
                quit(robot,driver);
            }

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("步步宝-首页-看看赚新闻异常");
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
        log.info("步步宝-看视频广告");
        try{
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            try {
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.upPage(androidId));
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频赚金币\")");
                wl1.click();
                robot.delay(32000);
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/tt_video_ad_close_layout\")");
                    wl2.click();
                }catch (Exception e){  }

            }catch (Exception e){}

            try{
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.upPage(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"点广告领金币\")");
                wl2.click();

            }catch (Exception e){}

        }catch (Exception e){
            log.info("步步宝-看视频广告异常");
        }

    }


    /**
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 8.领金币红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(Robot robot,String androidId,  AndroidDriver driver){
        log.info("步步宝-领金币红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/right_jinbi\")");
                wl2.click();
                robot.delay(2000);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金币翻倍\")");
                wl3.click();
                robot.delay(32000);

                quit(robot,driver);
            }catch (Exception e){}

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"¥\")");
                wl2.click();
                robot.delay(2000);
                quit(robot,driver);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金币翻倍\")");
                wl3.click();
                robot.delay(32000);

                quit(robot,driver);
            }catch (Exception e){}

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/h5_jinbi\")");
                wl2.click();
                robot.delay(2000);
                quit(robot,driver);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/open\")");
                wl3.click();
                robot.delay(32000);

                quit(robot,driver);
            }catch (Exception e){}

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("步步宝-领金币红包异常");
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
        log.info("步步宝-刮奖");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/guaguaka\")");
            wl2.click();

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"刮刮卡\")");
            for(WebElement wl :wls){
                robot.delay(1000);
                wl.click();
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/screatchview\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(wl3.getLocation().getX()+20), String.valueOf(wl3.getLocation().getY()+20)));
                robot.delay(2000);
                WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"金币翻倍\")");
                wl4.click();
                robot.delay(32000);
                quit(robot,driver);
            }

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("步步宝-刮奖异常");
        }
    }


    /**
     * todo 20.退出
     * @param robot
     */
    public static void quit(Robot robot, AndroidDriver driver){
        try {
            robot.delay(2000);
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/tt_video_ad_close_layout\")");
            wl4.click();
        } catch (Exception e) { }
        try {
            robot.delay(2000);
            WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.meituo.bububao:id/channel\")");
            wl5.click();
        } catch (Exception e) { }
    }


    /**
     * todo 21.清除
     * @param robot
     */
    public static void clear(Robot robot, AndroidDriver driver){

    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


