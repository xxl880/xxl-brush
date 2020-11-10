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
import java.util.ArrayList;
import java.util.List;

/**
 * todo App搜狗
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App搜狗 {
    private static Logger log = LoggerFactory.getLogger(App搜狗.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(Robot robot,String androidId,int port,int systemPort){
        try{
            log.info("********************************搜狗操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup搜狗);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"sogou.mobile.explorer.speed:id/adz\")");
                wl.click();
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1960));
            }
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"sogou.mobile.explorer.speed:id/adz\")");
                wl.click();
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1960));
            }

            AdbTools.process(robot, AdbTools.tap(androidId, 900, 160));

            handle1(robot,androidId,driver);
            handle20(robot,androidId,driver);

            handle4(robot,androidId,driver);

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
        log.info("搜狗-签到");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==2) {
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                try {
                    WebElement wl1 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"第1次\")");
                    wl1.click();
                } catch (Exception e) {
                }
                try {
                    WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"第2次\")");
                    wl2.click();
                } catch (Exception e) {
                }
                try {
                    WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"第3次\")");
                    wl3.click();
                } catch (Exception e) {
                }
                try {
                    WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"第4次\")");
                    wl4.click();
                } catch (Exception e) {
                }
                try {
                    WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"第5次\")");
                    wl5.click();
                } catch (Exception e) {
                }
                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"第6次\")");
                    wl6.click();
                } catch (Exception e) {
                }
                try {
                    WebElement wl7 = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"次最高可领98元\")");
                    wl7.click();
                } catch (Exception e) {
                }

            } catch (Exception e) {
                log.info("搜狗-签到异常");
            }
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
        log.info("搜狗-看新闻");
        try {
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.process(robot, AdbTools.upPage(androidId));
            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"领取红包\")");
                wl1.click();
            }catch (Exception e){
                WebElement wl2 = null;
                try {
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"去阅读\")");
                }catch (Exception e1){
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"继续阅读\")");
                }
                wl2.click();
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 1000));
                int x = RandomTools.init(8);
                for (int a = 0; a < x; a++) {
                    robot.delay(RandomTools.init(15000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("搜狗-看新闻异常");
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
     * todo 20.搜索
     * @param robot
     */
    public static void handle20(Robot robot,String androidId,  AndroidDriver driver){
        log.info("搜狗-搜索");
        try {
            robot.delay(1000);

            AdbTools.process(robot, AdbTools.upPage(androidId));
            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"领取红包\")");
                wl1.click();
            }catch (Exception e){
                WebElement wl2 = null;
                try {
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"去搜索\")");
                }catch (Exception e1){
                    wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"继续搜索\")");
                }
                wl2.click();

                for(int i=0;i<6;i++) {
                    List<String> list = new ArrayList();
                    list.add("ligangjianying");
                    list.add("jianqianyankai");
                    list.add("tianjingdiyi");
                    list.add("detianduhou");
                    list.add("chuitousanqi");
                    list.add("moshouchenggui");
                    list.add("gangbiziyong");
                    list.add("lijingtuzhi");
                    list.add("xinkuangshenyi");
                    list.add("duoduobiren");
                    list.add("haogaowuyuan");
                    list.add("heaikeqin");
                    list.add("jianfengshiduo");
                    list.add("yuanmuqiuyu");
                    list.add("kuizhirenkou");
                    list.add("laojianjuhua");
                    list.add("maogusongran");
                    list.add("mingguanjiuzhou");
                    list.add("ouxinlixue");
                    list.add("rencaijiji");
                    list.add("ruyuanyichuang");
                    list.add("ruobujingfeng");
                    list.add("sesanbanlan");
                    list.add("bixinliyi");
                    list.add("suijiyingbian");
                    list.add("chujiubuxin");
                    list.add("haogaowuyuan");
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 136));
                    AdbTools.process(robot, AdbTools.text(androidId, list.get(RandomTools.init(23))));
                    robot.delay(1000);
                    AdbTools.process(robot, AdbTools.tap(androidId, 1000, 136));
                    robot.delay(1000);
                    AdbTools.process(robot, AdbTools.tap(androidId, 540, 680));
            }

          }
        }catch (Exception e){
            log.info("搜狗-搜索异常");
        }
    }




/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


