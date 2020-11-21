package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * todo App火山
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class App火山极速 {
    private static Logger log = LoggerFactory.getLogger(App火山极速.class);

    /**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(String androidId){
        try {
                log.info("********************************火山极速操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup火山);

                handle2(androidId);

                log.info("3.清除");
                clear(androidId);

                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.tap(androidId, 680, 2140);
                } else {
                    AdbTools.tap(androidId, 680, 1950);
                }
                log.info("3.清除");
                AdbTools.clear(androidId);
                clear(androidId);

                handle1(androidId);
                handle6(androidId);
                handle9(androidId);
                handle11(androidId);
                handle20(androidId);
                handle21(androidId);
                handle22(androidId);


            } catch (Exception e) {
                e.printStackTrace();
            }
    }







    /**
     * todo 退出
     * @param androidId
     */
    public static void quit(String androidId){

    }

    /**
     * todo 清除
     * @param androidId
     */
    public static void clear(String androidId){
        try {

            Thread.sleep(1000);
        }catch (Exception e){   }

    }



    /**
     * todo 1.签到
     * @param androidId

     */
    public static void handle1(String androidId){
        if(AppTools.appTime())return;
        log.info("火山极速-签到");
        try {
            Integer y = OcrTools.getWordsInt(androidId,"看广告再领100金币");
            if(null!=y){
                AdbTools.tap(androidId,540,y);
                Thread.sleep(32000);
                AdbTools.back(androidId);
            }
        } catch (Exception e) {
            log.info("火山极速-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param androidId
     */
    public static void handle2(String androidId){
        log.info("火山极速-看视频");
        try {
            int x = RandomTools.init(6)+6;
            for (int a = 0; a < x; a++) {
                Thread.sleep(15000+RandomTools.init(2000));
                AdbTools.tap(androidId,150,1300);
                AdbTools.back(androidId);
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("火山极速-看视频异常");
        }
    }


    /**
     * todo 3.看小视频
     * @param androidId
     */
    public static void handle3(String androidId){

    }


    /**
     * todo 4.看新闻
     * @param androidId
     */
    public static void handle4(String androidId){

    }


    /**
     * todo 5.看小说
     * @param androidId
     */
    public static void handle5(String androidId){

    }


    /**
     * todo 6.看广告
     * @param androidId
     */
    public static void handle6(String androidId){
        log.info("火山极速-看广告");
        try{
            AdbTools.upPage(androidId);
            Integer y = OcrTools.getWordsInt(androidId,"看视频赚海量金币");
            if(null!=y){
                AdbTools.tap(androidId, 220, y);
                Thread.sleep(36000);
                AdbTools.back(androidId);
            }
        }catch (Exception e){
            log.info("火山极速-看广告异常");
        }
    }

    /**
     * todo 7.玩游戏
     * @param androidId
     */
    public static void handle7(String androidId){

    }


    /**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param androidId
     */
    public static void handle8(String androidId){

    }



    /**
     * todo 9.开宝箱
     * @param androidId
     */
    public static void handle9(String androidId){
        log.info("火山极速-开宝箱");
        try {
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId, 930, 1900);
                AdbTools.tap(androidId, 540, 1450);
            }else{
                AdbTools.tap(androidId, 930, 1700);
                AdbTools.tap(androidId, 540, 1340);
            }
            Thread.sleep(36000);

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("火山极速-开宝箱异常");
        }

    }


    /**
     * todo 10.抽奖
     * @param androidId
     */
    public static void handle10(String androidId){

    }


    /**
     * todo 11.睡觉
     * @param androidId
     */
    public static void handle11(String androidId){
        log.info("火山极速-睡觉");
        int hour = LocalDateTime.now().getHour();
        if(hour==6||hour==22) {
            int yy = 1850;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
               yy = 2050;
            }
            try {
                AdbTools.upPage(androidId);
                AdbTools.down(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"觉赚金币");
                if(null!=y){
                    AdbTools.tap(androidId, 220, y);
                    AdbTools.tap(androidId, 540, yy);
                    if(hour==6){
                        AdbTools.tap(androidId, 540, yy);
                        AdbTools.back(androidId);
                    }
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("火山极速-睡觉异常");
            }
        }
    }

    /**
     * todo 12.走路
     * @param androidId
     */
    public static void handle12(String androidId){


    }


    /**
     * todo 13.喝水
     * @param androidId
     */
    public static void handle13(String androidId){

    }


    /**
     * todo 14.充电
     * @param androidId
     */
    public static void handle14(String androidId){

    }

    /**
     * todo 15.听歌曲
     * @param androidId
     */
    public static void handle15(String androidId){

    }

    /**
     * todo 16.吃饭
     * @param androidId
     */
    public static void handle16(String androidId){

    }

    /**
     * todo 17.分享
     * @param androidId
     */
    public static void handle17(String androidId){

    }

    /**
     * todo 18.摇钱树
     * @param androidId
     */
    public static void handle18(String androidId){

    }

    /**
     * todo 19.刮奖
     * @param androidId
     */
    public static void handle19(String androidId){

    }


    /**
     * todo 20.晒收入
     * @param androidId
     */
    public static void handle20(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==4||hour==14) {
            log.info("火山极速-晒收入");
            try {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"每次奖励200金币,每天3次");
                if(null!=y){
                    AdbTools.tap(androidId,540,y-50);
                    for (int i = 0; i < 3; i++) {
                        AdbTools.tap(androidId,540,1220);//微信
                        AdbTools.tap(androidId,540,1360);//去粘贴
                        AdbTools.back(androidId);
                    }
                }

            } catch (Exception e) {
                log.info("火山极速-晒收入异常");
            }
        }
    }


    /**
     * todo 21.摇钱树
     * @param androidId
     */
    public static void handle21(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1||hour==15) {
            log.info("火山极速-摇钱树");
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"钱树");
                if(null!=y) {
                    AdbTools.tap(androidId,220,y);
                    Thread.sleep(8000);
                    AdbTools.tap(androidId, 540, 1100);
                    Thread.sleep(1000);
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 900, 1850);
                        AdbTools.tap(androidId, 540, 1850);
                        AdbTools.tap(androidId, 880, 1240);
                    } else {
                        AdbTools.tap(androidId, 900, 1750);
                        AdbTools.tap(androidId, 540, 1750);
                        AdbTools.tap(androidId, 880, 1050);
                    }
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("火山极速-摇钱树异常");
            }
        }
    }


    /**
     * todo 22.种菜赚金币
     * @param androidId
     */

    public static void handle22(String androidId){
        log.info("火山极速-种菜赚金币");
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==4||hour==16) {
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"种菜赚钱");
                if(null!=y) {
                    AdbTools.tap(androidId,680,y);
                    Thread.sleep(6000);
                    AdbTools.tap(androidId, 970, 800);
                    AdbTools.tap(androidId, 970, 880);
                    AdbTools.tap(androidId, 970, 470);
                    AdbTools.tap(androidId, 970, 460);
                    for (int i = 0; i < 2; i++) {
                        AdbTools.tap(androidId, 970, 300);
                        AdbTools.tap(androidId, 540, 1260);
                        AdbTools.tap(androidId, 540, 1360);
                        Thread.sleep(2000);
                    }
                    AdbTools.tap(androidId, 973, 950);
                    AdbTools.tap(androidId, 950, 840);
                    AdbTools.tap(androidId, 950, 930);
                    AdbTools.tap(androidId, 950, 2000);
                    AdbTools.tap(androidId, 950, 2140);
                    AdbTools.tap(androidId, 950, 2000);
                    AdbTools.tap(androidId, 950, 2140);
                    AdbTools.tap(androidId, 950, 2000);
                    AdbTools.tap(androidId, 950, 2140);
                    AdbTools.tap(androidId, 950, 2000);
                    AdbTools.tap(androidId, 950, 2140);

                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 990, 140);
                    } else {
                        AdbTools.tap(androidId, 1000, 130);
                    }

                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("火山极速-种菜赚金币异常");
            }
       }
    }

    /**
     * todo 获取横幅广告
     * @return
     */
    public static java.util.List getBanner(){
        List<String> list = new ArrayList<>();
        list.add("钱树");
        list.add("种菜赚钱");
        list.add("首次邀请好友");
        list.add("0.5元微信提现");
        list.add("看视频赚海量金币");
        list.add("睡觉赚金币");

        return list;
    }



}


