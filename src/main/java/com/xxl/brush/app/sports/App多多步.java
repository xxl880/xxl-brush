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

/**
 * todo App多多步
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */

public class App多多步 {
    private static Logger log = LoggerFactory.getLogger(App多多步.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort){
        try{
            log.info("********************************多多步操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup多多步);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            AdbTools.clear(driver);
            clear(robot,androidId,driver);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"走走\")");
                wl.click();
                handle12(robot, androidId, driver);
                handle8(robot, androidId, driver);
            }catch (Exception e){}

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"福利\")");
                wl1.click();
                handle19(robot,androidId,driver);
            }catch (Exception e){}

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"福利\")");
                wl1.click();
                handle6(robot,androidId,driver);
            }catch (Exception e){}
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
        log.info("多多步-签到");
        try {
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

            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"可翻倍\")");
            wl1.click();
            robot.delay(32000);

            try{
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                wl2.click();
            }catch (Exception e){}

            try{
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                wl3.click();
            }catch (Exception e){}

            try{
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                wl4.clear();
            }catch (Exception e){}

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("多多步-签到异常");
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
        log.info("多多步-看广告");
        try{
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            WebElement  wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"看完视频，并点击视频下方按钮\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(880), String.valueOf(wl1.getLocation().getY())));
            robot.delay(32000);

            try{
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                wl2.click();
            }catch (Exception e){}

            try{
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                wl3.click();
            }catch (Exception e){}

            try{
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                wl4.clear();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("多多步-看广告异常");
        }

    }



    /**
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(Robot robot,String androidId,  AndroidDriver driver){

    }


    /**
     * todo 8.左上方领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(Robot robot,String androidId,  AndroidDriver driver){
        log.info("多多步-左上方领红包");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
          try {
              try {
                  WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                  wl2.click();
              } catch (Exception e) {
              }

              try {
                  WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                  wl3.click();
              } catch (Exception e) {
              }

              try {
                  WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                  wl4.clear();
              } catch (Exception e) {
              }

              WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/rewardTxt3\")");
              wl1.click();

              WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
              wl2.click();
              robot.delay(32000);

              try {
                  WebElement wl66 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                  wl66.click();
              } catch (Exception e) {
              }

              try {
                  WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                  wl3.click();
              } catch (Exception e) {
              }

              try {
                  WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                  wl4.clear();
              } catch (Exception e) {
              }
          }catch (Exception e){}

            try {
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                    wl2.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                    wl3.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                    wl4.clear();
                } catch (Exception e) {
                }

                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/rewardTxt2\")");
                wl1.click();

                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(32000);

                try {
                    WebElement wl66 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                    wl66.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                    wl3.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                    wl4.clear();
                } catch (Exception e) {
                }
            }catch (Exception e){}


            try {
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                    wl2.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                    wl3.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                    wl4.clear();
                } catch (Exception e) {
                }

                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/rewardTxt4\")");
                wl1.click();

                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
                wl2.click();
                robot.delay(32000);

                try {
                    WebElement wl66 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                    wl66.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                    wl3.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                    wl4.clear();
                } catch (Exception e) {
                }
            }catch (Exception e){}


            try {
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                    wl2.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                    wl3.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                    wl4.clear();
                } catch (Exception e) {
                }

                WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/rewardTxt1\")");
                wl1.click();

                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"看视频继续兑换\")");
                wl2.click();
                robot.delay(32000);

                try {
                    WebElement wl66 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                    wl66.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                    wl3.click();
                } catch (Exception e) {
                }

                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                    wl4.clear();
                } catch (Exception e) {
                }
            }catch (Exception e){}

        }catch (Exception e){
            log.info("多多步-左上方领红包异常");
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
        log.info("多多步-走路领取金币");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try{
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                wl2.click();
            }catch (Exception e){}

            try{
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                wl3.click();
            }catch (Exception e){}

            try{
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                wl4.clear();
            }catch (Exception e){}

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取金币\")");
            wl1.click();
            robot.delay(1000);

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"奖励翻倍\")");
            wl2.click();
            robot.delay(32000);

            try{
                WebElement wl66 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                wl66.click();
            }catch (Exception e){}

            try{
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                wl3.click();
            }catch (Exception e){}

            try{
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                wl4.clear();
            }catch (Exception e){}

        }catch (Exception e){
            log.info("多多步-走路领取金币异常");
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
        try{
            WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
            wl4.clear();
        }catch (Exception e){}
        int a = RandomTools.init(12);
        for(int i=0;i<a ;i++) {
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(400)));
            WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/mGridView\")");
            AdbTools.process(robot, AdbTools.tapDraw(androidId, String.valueOf(wl5.getLocation().getX() + 20), String.valueOf(wl5.getLocation().getY() + 20)));
            robot.delay(2000);

            try {
                WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tt_video_ad_close_layout\")");
                wl2.click();
            } catch (Exception e) {
            }

            try {
                WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"net.rjkfw.ddb:id/tv_close\")");
                wl3.click();
            } catch (Exception e) {
            }

            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/content\")");
                wl4.clear();
            } catch (Exception e) {
            }
        }

    }



    /**
     * todo 20.清除
     * @param robot
     */
    public static void clear(Robot robot,String androidId,  AndroidDriver driver){
        try{
            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"╳\")");
            wl3.click();
        }catch (Exception e){}
    }


/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


