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
import java.util.List;

/**
 * todo AppApp晴象浏览器
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App晴象浏览器 {
    private static Logger log = LoggerFactory.getLogger(App晴象浏览器.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String robotCode){
        try{
            log.info("********************************App晴象浏览器操作********************************************");

            log.info("1.初始化手机");
            String androidId  = AdbTools.initMobile(robot,robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup晴象);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"钱包\")");
                wl.click();
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(2140)));
            }

            handle1(robot,androidId,driver);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"浏览器\")");
            wl2.click();

            handle8(robot,androidId,driver);
            handle81(robot,androidId,driver);
            handle82(robot,androidId,driver);
            handle83(robot,androidId,driver);
            handle84(robot,androidId,driver);
            handle10(robot,androidId,driver);
            handle20(robot,androidId,driver);
            handle19(robot,androidId,driver);

            handle2(robot,androidId,driver);

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
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-签到");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看视频金币翻倍\")");
            wl1.click();
            robot.delay(59000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
            wl3.click();

            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("App晴象浏览器-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-看视频");
        try {

            try{
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频\")");
                wl1.click();
                robot.delay(59000);

                WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl6.click();

                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

            int x = RandomTools.init(6);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                if (a == RandomTools.init(6)) {
                    AdbTools.process(robot, AdbTools.upPage(androidId));
                }
            }
        }catch (Exception e){
            log.info("App晴象浏览器-看视频异常");
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
        log.info("App晴象浏览器-左上方红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/float_coin_2\")");
            wl2.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-左上方红包异常");
        }

    }

    /**
     * todo 8.1领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle81(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-左下方红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/float_coin_1\")");
            wl2.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-左下方红包异常");
        }

    }


    /**
     * todo 8.2领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle82(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-右上方红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/float_coin_3\")");
            wl2.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-右上方红包异常");
        }

    }


    /**
     * todo 8.3领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle83(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-右下方红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/float_coin_4\")");
            wl2.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-右下方红包异常");
        }

    }

    /**
     * todo 8.4领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle84(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-右下下方红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/get_coin_iv\")");
            wl2.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-右下下方红包异常");
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
        log.info("App晴象浏览器-抽奖");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去抽奖\")");
            wl2.click();


            try {
                WebElement wl33 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/close\")");
                wl33.click();
            }catch (Exception e){}

            WebElement wl33 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/go_iv\")");
            wl33.click();

            robot.delay(2000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频\")");
            wl1.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-抽奖异常");
        }
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
        log.info("App晴象浏览器-刮奖");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"去刮卡赚钱\")");
            wl2.click();


            try {
                WebElement wl33 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/close\")");
                wl33.click();
            }catch (Exception e){}


            WebElement wl32 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"奖励\")");
            AdbTools.process(robot, AdbTools.tapDraw(androidId, String.valueOf(wl32.getLocation().getX()+10), String.valueOf(wl32.getLocation().getY()+80)));

            robot.delay(2000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看视频金币翻倍\")");
            wl1.click();
            robot.delay(59000);

            try {
                WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                wl144.click();
            }catch (Exception e){}

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                wl3.click();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("App晴象浏览器-刮奖异常");
        }
    }



    /**
     * todo 20.打卡
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("App晴象浏览器-打卡");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"打卡赚钱\")");
            wl2.click();

            try {
                WebElement wl33 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/close\")");
                wl33.click();
            }catch (Exception e){}

            List<WebElement> wl4 = null;
            try {
                wl4 = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"去补卡\")");
            }catch (Exception e){
                try {
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl4 = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"去补卡\")");
                }catch (Exception e1){
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    AdbTools.process(robot, AdbTools.downPage(androidId));
                    wl4 = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\").textContains(\"去补卡\")");
                }
            }
            for(WebElement wl :wl4){
                wl.click();
                robot.delay(2000);
                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"看视频金币翻倍\")");
                wl1.click();
                robot.delay(59000);

                try {
                    WebElement wl144 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
                    wl144.click();
                }catch (Exception e){}

                try {
                    WebElement wl14 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/tt_video_ad_close\")");
                    wl14.click();
                }catch (Exception e){}

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tiantian.browser.android.search:id/count_down_btn\")");
                    wl3.click();
                }catch (Exception e){}
            }



        }catch (Exception e){
            log.info("App晴象浏览器-打卡异常");
        }
    }



/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


