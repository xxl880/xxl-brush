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

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App今日头条 {
    private static Logger log = LoggerFactory.getLogger(App今日头条.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String robotCode){
        try {
            log.info("********************************今日头条操作********************************************");

            log.info("1.初始化手机");
            String androidId = AdbTools.initMobile(robot, robotCode);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup今日头条);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(robotCode);
            AdbTools.clear(driver);
            handle2(robot, androidId, driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(760), String.valueOf(wl.getLocation().getY() + 20)));
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(760), String.valueOf(1960)));
            }

            handle1(robot, androidId, driver);
            handle9(robot, androidId, driver);
            handle5(robot, androidId, driver);
            handle12(robot, androidId, driver);
            handle16(robot, androidId, driver);
            handle20(robot, androidId, driver);
            handle11(robot, androidId, driver);
            handle21(robot, androidId, driver);

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
       log.info("今日头条-签到");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement  wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"签到\")");
            wl.click();

            robot.delay(2000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频再赚\")");
            wl1.click();
            robot.delay(32000);

            AdbTools.process(robot, operateBack);

        }catch (Exception e){
            log.info("今日头条-签到异常");
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
        log.info("今日头条-看小说");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 =  null;
            try{
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看小说赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看小说赚金币\")");
            }
            wl2.click();
            robot.delay(2000);
            AdbTools.process(robot, AdbTools.downPage(androidId));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(160), String.valueOf(1580)));
            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"立即阅读\")");
                wl3.click();
            }catch (Exception e){
                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"继续阅读\")");
                    wl4.click();
                }catch (Exception e1){
                    AdbTools.process(robot, AdbTools.down(androidId));
                    AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(160), String.valueOf(1580)));
                    WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"阅读\")");
                    wl5.click();
                }
            }



            for(int i=0;i<60;i++) {
                try{
                    robot.delay(3000);
                    if(i%5==0){
                        WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"看视频\")");
                        wl4.click();
                        robot.delay(20000);
                        AdbTools.process(robot, operateBack);
                    }
                }catch (Exception e){}

                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(1030), String.valueOf(600)));
            }

        }catch (Exception e){
            log.info("今日头条-看小说异常");
        }
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

    }



    /**
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(Robot robot,String androidId,  AndroidDriver driver){
        log.info("今日头条-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"treasure-box-enable-1.da338c08\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"看完视频再领\")");
            wl3.click();


            robot.delay(32000);

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("今日头条-开宝箱异常");
        }
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

        log.info("今日头条-睡觉");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"睡觉赚钱\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"睡觉赚钱\")");
            }
            wl2.click();

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                wl3.click();
            }catch (Exception e){
                AdbTools.process(robot, operateBack);
            }

            robot.delay(1000);
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频\")");
            wl4.click();
            robot.delay(32000);
            AdbTools.process(robot, operateBack);


        }catch (Exception e){
            log.info("今日头条-睡觉异常");
        }



    }

    /**
     * todo 12.走路
     * @param robot
     */
    public static void handle12(Robot robot,String androidId,  AndroidDriver driver){
        log.info("今日头条-走路");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"走路赚钱\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"走路赚钱\")");
            }
            wl2.click();

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
                wl3.click();
                robot.delay(2000);

                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频再领\")");
                wl4.click();
                robot.delay(30000);
                AdbTools.process(robot, operateBack);
                AdbTools.process(robot, operateBack);

            } catch (Exception e) {

            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("今日头条-走路异常");
        }

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
        log.info("今日头条-吃饭");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"吃饭补贴\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Image\").text(\"吃饭补贴\")");
            }
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"领取\")");
            wl3.click();

            robot.delay(1000);
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看视频\")");
            wl4.click();
            robot.delay(32000);

            AdbTools.process(robot, operateBack);
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("今日头条-吃饭异常");
        }


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
     * todo 20.模拟开店赚钱
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("今日头条-模拟开店赚钱");
        try {
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"模拟开店赚钱\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"模拟开店赚钱\")");
            }
            wl2.click();
            robot.delay(6000);

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(950), String.valueOf(960)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(950), String.valueOf(870)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(1000), String.valueOf(470)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(1000), String.valueOf(400)));

            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bytedance.article.lite.plugin.appbrand:id/microapp_m_titlebar_capsule_more\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(wl4.getLocation().getY()+120)));
            wl4.click();
            robot.delay(2000);
            wl4.click();
            robot.delay(2000);
            wl4.click();

        }catch (Exception e){
            log.info("今日头条-模拟开店赚钱异常");
        }

    }

    /**
     * todo 21.种菜赚金币
     * @param robot
     */
    public static void handle21(Robot robot,String androidId,  AndroidDriver driver){
        log.info("今日头条-种菜赚金币");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"种菜赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"种菜赚金币\")");
            }
            wl2.click();
            robot.delay(6000);

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(800)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(880)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(470)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(460)));
           for(int i=0;i<3;i++) {
               AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(300)));
               AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1260)));
               AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(12360)));
               robot.delay(18000);
               AdbTools.process(robot, operateBack);
               AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1260)));
               AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1360)));
           }

        }catch (Exception e){
            log.info("今日头条-种菜赚金币异常");
        }
    }


    /**
     * todo 21.搜索
     * @param robot
     */
    public static void handle22(Robot robot,String androidId,  AndroidDriver driver){
        log.info("今日头条-搜索");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            WebElement wl2 = null;
            try {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"种菜赚金币\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"种菜赚金币\")");
            }
            wl2.click();
            robot.delay(6000);

            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(800)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(880)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(470)));
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(460)));

            for(int i=0;i<3;i++) {
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(970), String.valueOf(300)));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1260)));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(12360)));
                robot.delay(18000);
                AdbTools.process(robot, operateBack);
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1260)));
                AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1360)));
            }

        }catch (Exception e){
            log.info("今日头条-搜索异常");
        }
    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


