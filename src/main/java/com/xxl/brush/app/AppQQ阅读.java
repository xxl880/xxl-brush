package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
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
 * todo AppQQ阅读
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class AppQQ阅读 {
    private static Logger log = LoggerFactory.getLogger(AppQQ阅读.class);




    /**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot, androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startupQQ阅读);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            clear(robot,androidId,driver);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.process(robot, AdbTools.tap(androidId, 540, 450));
            handle9(robot, androidId, driver, map);
            handle6(robot, androidId, driver, map);

            AdbTools.process(robot, AdbTools.tap(androidId, 320, y));
            handle5(robot, androidId, driver, map);
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
            WebElement  wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"安装\")");
            wl.click();

            AdbTools.process(robot, AdbTools.back(androidId));
        }catch (Exception e ){}
    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
         log.info("QQ阅读-签到");
        try {
            WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().textStartsWith(\"看小视频再领\")");
            wl1.click();
            robot.delay(32000);

            AdbTools.process(robot, AdbTools.back(androidId));
        }catch (Exception e){
            log.info("QQ阅读-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

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
     * todo 5看小说-加入书架
     * @param robot
     */
    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("QQ阅读-看小说");
        int hour = LocalDateTime.now().getHour();
        int y = 1950;
        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
            y = 2140;
        }
        if(hour==22) {
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 630));

                AdbTools.process(robot, AdbTools.tap(androidId, 930, y));
                robot.delay(1000);
                AdbTools.process(robot, AdbTools.tap(androidId, 540, y));
                for(int i=0;i<60;i++){
                    AdbTools.process(robot, AdbTools.tap(androidId, 1030, 1560));
                    robot.delay(RandomTools.init(6000));
                }

            } catch (Exception e) {
                log.info("QQ阅读-看小说异常");
            }
        }
    }

    /**
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("QQ阅读-看广告");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==1||hour==14||hour==15) {
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.down(androidId));
                WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"看视频拿大额金币\").fromParent(text(\"马上看\"))");
                int y = wl2.getLocation().getY();
                for (int i = 0; i < 10; i++) {
                    robot.delay(3000);
                    AdbTools.process(robot, AdbTools.tap(androidId, 880, y));
                    robot.delay(59000);
                    AdbTools.process(robot, AdbTools.back(androidId));
                }
                AdbTools.process(robot, AdbTools.back(androidId));
            } catch (Exception e) {
                log.info("QQ阅读-看广告异常");
            }
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
        log.info("QQ阅读-开宝箱");
        try {
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"开宝箱得金币\")");
            wl2.click();

        }catch (Exception e){
            log.info("QQ阅读-开宝箱异常");
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





/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


