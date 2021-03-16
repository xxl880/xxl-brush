/*
package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

*/
/**
 * todo AppApp2345浏览器
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 *//*




public class App2345浏览器 {
    private static Logger log = LoggerFactory.getLogger(App2345浏览器.class);

    */
/**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     *//*

    @SneakyThrows
    public static void circulate(String androidId,int port,int systemPort, Map<String,Integer> map){
        try {
            log.info("********************************App2345浏览器操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile( androidId);

            log.info("2.启动app");
            AdbTools.startup( androidId, AppConstants.startup2345);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            AdbTools.clear(driver);
            clear( androidId, driver, map);

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领现金\")");
            wl1.click();
            handle1(androidId);
            handle21(androidId);

            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"首页\")");
                wl.click();
            } catch (Exception e) {
            }
            handle8( androidId, driver, map);

            wl1.click();
            handle2( androidId, driver, map);

            wl1.click();
            handle3( androidId, driver, map);

            wl1.click();
            handle4( androidId, driver, map);

            wl1.click();
            handle5( androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    */
/**
     * todo 退出
     * @param androidId

     *//*

    public static void quit( String  androidId){

    }


    */
/**
     * todo 清除
     * @param androidId

     *//*

    public static void clear( String androidId){

    }

    */
/**
     * todo 1.签到
     * @param androidId

     *//*

    public static void handle1(String androidId){
        log.info("App2345浏览器极速-签到");
        try {
            Thread.sleep(1000);
            AdbTools.upPage(androidId);
            AdbTools.upPage(androidId);
           */
/* WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"签到\")");
            wl.click();*//*


            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("App2345浏览器极速-签到异常");
        }
    }


    */
/**
     * todo 2.看视频
     * @param androidId
     *//*

    public static void handle2(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App2345浏览器极速-看视频");
        try {
            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/观看视频\").fromParent(text(\"立即观看\"))");
            } catch (Exception e) {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/观看视频\").fromParent(text(\"立即观看\"))");
            }

            Thread.sleep(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\") .text(\"/推荐\")");
            wl1.click();
            AdbTools.tap(androidId, 270, 600);
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.downPage(androidId);
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看视频异常");
        }
    }


    */
/**
     * todo 3.看小视频
     * @param androidId
     *//*

    public static void handle3(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App2345浏览器极速-看小视频");
        try {

            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/18\").fromParent(text(\"立即观看\"))");
            } catch (Exception e) {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/18\").fromParent(text(\"立即观看\"))");
            }
            wl.click();
            Thread.sleep(1000);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\") .text(\"/小视频\")");
            wl1.click();
            AdbTools.tap(androidId, 270, 600);
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.downPage(androidId);
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看小视频异常");
        }
    }


    */
/**
     * todo 4.看新闻
     * @param androidId
     *//*

    public static void handle4(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("2345浏览器-看新闻");
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";


            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"轻松阅读可赚金币，共10轮，最高1000金币\").fromParent(text(\"立即阅读\"))");
            } catch (Exception e) {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"轻松阅读可赚金币，共10轮，最高1000金币\").fromParent(text(\"立即阅读\"))");
            }
            wl.click();

            int x = RandomTools.init(3)+5;
            for (int a = 0; a < x; a++) {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                List<WebElement> wls = driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\") .text(\"阅读可领金币\")");

                AdbTools.tap(androidId, 540, wls.get(0).getLocation().getY()+200);
                Thread.sleep(RandomTools.init(15000));
                AdbTools.back(androidId);
                AdbTools.back(androidId);
            }

           AdbTools.back(androidId);

        }catch (Exception e){
            log.info("2345浏览器-看新闻异常");
        }
    }


    */
/**
     * todo 4.1看首页新闻
     * @param androidId
     *//*

    public static void handle41(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App2345浏览器极速-看首页新闻");
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl =  null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/15\").fromParent(text(\"立即阅读\"))");
            } catch (Exception e) {
                AdbTools.down(androidId);
                AdbTools.downPage(androidId);
                wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .textContains(\"/15\").fromParent(text(\"立即阅读\"))");
            }
            wl.click();
            Thread.sleep(1000);


            int x = RandomTools.init(20);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(8000));
                AdbTools.downPage(androidId);
                AdbTools.tap(androidId, 540, 600);
                for(int i=0;i<6;i++){
                    Thread.sleep(RandomTools.init(6000));
                    AdbTools.down(androidId);
                }
                AdbTools.back(androidId);
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看首页新闻异常");
        }
    }



    */
/**
     * todo 5.看小说
     * @param androidId
     *//*

    public static void handle5(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App2345浏览器极速-看小说");
        try {
            Thread.sleep(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"正常阅读小说，每天最高可获得1000金币\").fromParent(text(\"立即阅读\"))");
            wl.click();
            Thread.sleep(1000);


            int x = RandomTools.init(20);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(8000));
                AdbTools.downPage(androidId);
                AdbTools.tap(androidId, 540, 1600);
                WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\") .text(\"开始阅读\")");
                wl3.click();
                Thread.sleep(2000);
                for(int i=0;i<20;i++){
                    Thread.sleep(RandomTools.init(6000));
                    AdbTools.down(androidId);
                }
                AdbTools.back(androidId);
                AdbTools.back(androidId);
                AdbTools.back(androidId);
            }
        }catch (Exception e){
            log.info("App2345浏览器极速-看小说异常");
        }
    }


    */
/**
     * todo 6.看广告
     * @param androidId
     *//*

    public static void handle6(String androidId,  AndroidDriver driver, Map<String,Integer> map){


    }

    */
/**
     * todo 7.玩游戏
     * @param androidId
     *//*

    public static void handle7(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param androidId
     *//*

    public static void handle8(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("App2345浏览器极速-领红包");
        try {
            Thread.sleep(1000);
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"领钱\")");
            wl2.click();

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("App2345浏览器极速-领红包异常");
        }
    }



    */
/**
     * todo 9.开宝箱
     * @param androidId
     *//*

    public static void handle9(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 10.抽奖
     * @param androidId
     *//*

    public static void handle10(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 11.睡觉
     * @param androidId
     *//*

    public static void handle11(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 12.走路
     * @param androidId
     *//*

    public static void handle12(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 13.喝水
     * @param androidId
     *//*

    public static void handle13(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 14.充电
     * @param androidId
     *//*

    public static void handle14(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 15.听歌曲
     * @param androidId
     *//*

    public static void handle15(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 16.吃饭
     * @param androidId
     *//*

    public static void handle16(String androidId,  AndroidDriver driver, Map<String,Integer> map){



    }

    */
/**
     * todo 17.分享
     * @param androidId
     *//*

    public static void handle17(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 18.摇钱树
     * @param androidId
     *//*

    public static void handle18(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 19.刮奖
     * @param androidId
     *//*

    public static void handle19(String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }



    */
/**
     * todo 20.app清除
     * @param androidId
     *//*

    public static void clear(String androidId,  AndroidDriver driver, Map<String,Integer> map){
      try{
          Thread.sleep(1000);

          WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"立即升级\")");
          wl3.click();
          Thread.sleep(2000);
          WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"确定下载\")");
          wl4.click();
          Thread.sleep(3000);
          WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"继续安装\")");
          wl5.click();
          Thread.sleep(22000);
      }catch (Exception e){}


    }



    */
/**
     * todo 21.搜索
     * @param androidId
     *//*

    public static void handle21(String androidId,  AndroidDriver driver, Map<String,Integer> map){
        try {
            Thread.sleep(1000);

            WebElement wl2 = null;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"正常搜索可获奖励，每天2次，最高250金币\").fromParent(text(\"立即搜索\"))");
            } catch (Exception e) {
                AdbTools.down(androidId);
                AdbTools.down(androidId);
                wl2 = driver.findElementByAndroidUIAutomator("className(\"android.view.View\").text(\"正常搜索可获奖励，每天2次，最高250金币\").fromParent(text(\"立即搜索\"))");
            }
            wl2.click();

            for(int i=0;i<2;i++) {
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

                WebElement wl3 = driver.findElementByAndroidUIAutomator("resourceId(\"com.browser2345:id/home_urlbar\").childSelector(textContains(\"...\"))");
                wl3.click();
                AdbTools.text(androidId, list.get(RandomTools.init(23)));
                Thread.sleep(1000);
                AdbTools.tap(androidId, 1000, wl3.getLocation().getY());
                Thread.sleep(1000);
                AdbTools.tap(androidId, 540, 680);
            }

        }catch (Exception e){}


    }


}


*/
