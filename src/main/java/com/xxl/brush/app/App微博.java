package com.xxl.brush.app;

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
import java.util.ArrayList;
import java.util.List;

/**
 * todo App微博
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */



public class App微博 {
    private static Logger log = LoggerFactory.getLogger(App微博.class);


    /**
     * todo 1.
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void handle(Robot robot,String robotCode){
        log.info("********************************微博操作********************************************");

        log.info("1.初始化手机");
        String androidId  = AdbTools.initMobile(robot,robotCode);

        log.info("2.启动app");
        AdbTools.startup(robot, androidId, AppConstants.startup微博);

        log.info("3.启动appium");
        AndroidDriver driver = AppiumTools.init(robotCode);

         try {
            WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"首页\")");
            wl.click();
        }catch (Exception e){
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(540), String.valueOf(2140)));
        }

        handle4(robot,androidId,driver);

        WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sina.weibo:id/redpacketSave\")");
        wl2.click();


        handle1(robot,androidId,driver);
        handle41(robot,androidId,driver);
        handle42(robot,androidId,driver);
        handle43(robot,androidId,driver);
        handle44(robot,androidId,driver);
        handle45(robot,androidId,driver);

    }




    /**
     * todo 1.签到
     * @param robot

     */
    public static void handle1(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-签到");
        try {
            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.upPage(androidId));
            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"关注@微博任务\")");
                wl1.clear();
            }catch (Exception e){}
            WebElement wl = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"今天\")");
            AdbTools.process(robot, AdbTools.tap(androidId, String.valueOf(wl.getLocation().getX()+50), String.valueOf(wl.getLocation().getY()+60)));

        }catch (Exception e){
            log.info("微博-签到异常");
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
     * todo 4.刷公共微博
     * @param robot
     */
    public static void handle4(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-刷公共微博");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"推荐\")");
                wl1.click();
            }catch (Exception e){}

            WebElement wl2 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.sina.weibo:id/floating_window\")");
            wl2.click();

            int x = RandomTools.init(8)+6;
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
            }
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("微博-刷公共微博异常");
        }
    }


    /**
     * todo 4.1 刷微博
     * @param robot
     */
    public static void handle41(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-看关注微博");
        try {
            robot.delay(1000);

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));

            try{
                WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取100积分\")");
                wl6.click();
            }catch (Exception e){
                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取0.05元\")");
                    wl6.click();
                }catch (Exception e1){}
            }

            WebElement wl1 = null;
            try {
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"刷微博\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
               wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"刷微博\")");
            }
            wl1.click();

            int x = RandomTools.init(8)+6;
            for (int a = 0; a < x; a++) {
                robot.delay(RandomTools.init(15000));
                AdbTools.process(robot, AdbTools.down(androidId));
            }

        }catch (Exception e){
            log.info("微博-看关注微博异常");
        }
    }


    /**
     * todo 4.2 关注
     * @param robot
     */
    public static void handle42(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-关注博主");
        try {
            robot.delay(1000);

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));

            try{
                WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取50积分\")");
                wl6.click();
            }catch (Exception e){
                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取0.05元\")");
                    wl6.click();
                }catch (Exception e1){}
            }


            WebElement wl1 = null;
            try {
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"关注\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"关注\")");
            }
            wl1.click();

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.widget.Button\").text(\"关注\")");
            if(!CollectionUtils.isEmpty(wls)){
                wls.get(0).click();
            }

        }catch (Exception e){
            log.info("微博-关注博主异常");
        }
    }


    /**
     * todo 4.3 转发
     * @param robot
     */
    public static void handle43(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-转发");
        try {
            robot.delay(1000);

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));

            try{
                WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取20积分\")");
                wl6.click();
            }catch (Exception e){
                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取0.04元\")");
                    wl6.click();
                }catch (Exception e1){}
            }


            WebElement wl1 = null;
            try {
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"转发\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"转发\")");
            }
            wl1.click();

            List<WebElement> wls = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.sina.weibo:id/leftButton\")");
            if(!CollectionUtils.isEmpty(wls)){
                wls.get(0).click();
            }

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"快转\")");
            wl2.click();

        }catch (Exception e){
            log.info("微博-转发异常");
        }
    }



    /**
     * todo 4.4 点赞
     * @param robot
     */
    public static void handle44(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-点赞");
        try {
            robot.delay(1000);

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));

            try{
                WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取20积分\")");
                wl6.click();
            }catch (Exception e){
                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取0.01元\")");
                    wl6.click();
                }catch (Exception e1){

                }
            }


            WebElement wl1 = null;
            try {
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"点赞\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"点赞\")");
            }
            wl1.click();

            List<WebElement> wl1s = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\"com.sina.weibo:id/rightButton\")");
            if(!CollectionUtils.isEmpty(wl1s)){
                wl1s.get(0).click();
            }


        }catch (Exception e){
            log.info("微博-点赞异常");
        }
    }



    /**
     * todo 4.5 评论
     * @param robot
     */
    public static void handle45(Robot robot,String androidId,  AndroidDriver driver){
        log.info("微博-评论");
        try {
            robot.delay(1000);

            AdbTools.process(robot, AdbTools.upPage(androidId));
            AdbTools.process(robot, AdbTools.down(androidId));

            try{
                WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取20积分\")");
                wl6.click();
            }catch (Exception e){
                try {
                    WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"领取0.02元\")");
                    wl6.click();
                }catch (Exception e1){}
            }
            WebElement wl1 = null;
            try {
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"评论\")");
            }catch (Exception e){
                AdbTools.process(robot, AdbTools.down(androidId));
                wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"评论\")");
            }
            wl1.click();

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.Button\").text(\"评论\")");
            wl2.click();

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
                AdbTools.process(robot, AdbTools.text(androidId, list.get(RandomTools.init(23))));
                robot.delay(1000);

            WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"发送\")");
            wl3.click();

        }catch (Exception e){
            log.info("微博-评论异常");
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





/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*/


}


