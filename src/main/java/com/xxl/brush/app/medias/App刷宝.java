/*
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
import java.util.Map;

*/
/*
*
 * todo App刷宝
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*//*

public class App刷宝 {
    private static Logger log = LoggerFactory.getLogger(App刷宝.class);



*/
/*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
*//*

    public static void circulate(String androidId){
        try{
            log.info("********************************刷宝操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup刷宝);

            log.info("3.清除");
            AdbTools.clear(androidId);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            }catch (Exception e){ }

            handle2(robot, androidId, driver, map);


            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
                clear(robot,driver);
            }catch (Exception e){ }

            handle9(robot, androidId, driver, map);
            handle6(robot, androidId, driver, map);
        }catch (Exception e){}

    }

*/
/*


*
     * todo 退出
     * @param robot
*//*




    public static void quit(Robot robot, AndroidDriver driver){

    }

*/
/*

*
     * todo 清除
     * @param robot
*//*




    public static void clear(Robot robot, AndroidDriver driver){
        try{
            robot.delay(1000);
            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.jm.video:id/imgClose\")");
            wl3.click();
        }catch (Exception e){}
    }




*/
/**
     * todo 1.签到
     * @param robot*//*




    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
       log.info("刷宝-签到");
        try {
            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementB yAndroidUIAutomator("className(\"android.widget.Button\").text(\"立即签到\")");
            } catch (Exception e) {
                AdbTools.downPage(androidI);
                AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"立即签到\")");
            }
            wl.click();

            robot.delay(1000);

            WebElement wl1 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]");
            wl1.click();

        }catch (Exception e){
            log.info("刷宝-签到异常");
        }
    }


*/
/*
*
     * todo 2.看视频
     * @param robot
*//*



    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("刷宝-看视频");
        try {
            robot.delay(1000);

            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("刷宝-看视频异常");
        }
    }



*/
/**
     * todo 6.看广告
     * @param robot*//*



    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("刷宝-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.upPage(androidId);
            AdbTools.upPage(androidId);
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"去观看\")");
            wl.click();
            robot.delay(32000);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.jm.video:id/tt_video_ad_close_layout\")");
            wl1.click();

            WebElement wl2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]");
            wl2.click();

        }catch (Exception e){
            log.info("刷宝-看广告异常");
        }

    }





*/
/**
     * todo 9.开宝箱
     * @param robot*//*

    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("刷宝-开宝箱");
        try {
            robot.delay(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开箱领元宝\")");
            wl2.click();
            robot.delay(32000);

            WebElement wl3 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]");
            wl3.click();

        }catch (Exception e){
            log.info("刷宝-开宝箱异常");
        }
    }

 



}


*/
