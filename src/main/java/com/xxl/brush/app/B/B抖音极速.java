package com.xxl.brush.app.B;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.util.*;
import java.util.List;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class B抖音极速 {
    private static Logger log = LoggerFactory.getLogger(B抖音极速.class);

    /**
     * todo 循环(用户行为-开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下e不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(String androidId){
            try {
                log.info("********************************抖音极速操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup抖音);

              /*  handle2(androidId);*/

                log.info("3.清除");
                AdbTools.clear(androidId);
                clear(androidId);

                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.tap(androidId, 540, 2140);
                } else {
                    AdbTools.tap(androidId, 540, 1950);
                }

             /*   handle1(androidId);*/
                handle9(androidId);
                handle6(androidId);
             /*   handle11(androidId);
                handle12(androidId);
                handle16(androidId);
                handle5(androidId);*/

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
        try{
            Integer y = OcrTools.getWordsInt(androidId,"立即升级");
            if(null!=y){
                AdbTools.tap(androidId,740,y);
                Thread.sleep(6000);
                Integer yy = OcrTools.getWordsInt(androidId,"继续安装");
                if(null!=yy){
                    AdbTools.tap(androidId,740,yy);
                    Thread.sleep(16000);
                }
                Integer yy1 = OcrTools.getWordsInt(androidId,"安装");
                if(null!=yy1){
                    AdbTools.tap(androidId,540,yy);
                    Thread.sleep(16000);
                }

                Integer yyy = OcrTools.getWordsInt(androidId,"打开");
                if(null!=yyy) {
                    AdbTools.tap(androidId, 740, yyy);
                    Thread.sleep(6000);
                }
            }

        }catch (Exception e){}

    }


    /**
     * todo 1.签到
     * @param androidId

     */
    public static void handle1(String androidId){
        if(AppTools.appTime())return;
        log.info("抖音极速-签到");
        try {
            Integer yy = OcrTools.getWordsInt(androidId,"签到");
            if(null==yy){
                yy = OcrTools.getWordsInt(androidId,"30天");
                if(null!=yy){
                    yy = yy + 160;
                }
            }
            if(null==yy){
                AdbTools.upPage(androidId);
                yy = OcrTools.getWordsInt(androidId,"签到");
            }
            if(null==yy){
                AdbTools.downPage(androidId);
                yy = OcrTools.getWordsInt(androidId,"签到");
            }

            if(null!=yy){
                AdbTools.tap(androidId,270, yy);
                Integer y = OcrTools.getWordsInt(androidId,"看广告");
                if(null!=y){
                    AdbTools.tap(androidId,540, y);
                    Thread.sleep(32000);
                    AdbTools.back(androidId);
                }else{
                    if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                        AdbTools.tap(androidId,540, 1480);
                    }else{
                        AdbTools.tap(androidId,540, 1390);
                    }

                }
            }


        } catch (Exception e) {
           log.info("抖音极速-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param androidId
     */
    public static void handle2(String androidId){
        log.info("抖音极速-看视频");
        try {
            int x = RandomTools.init(6)+6;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                    AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) { 
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("抖音极速-看视频异常");
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
        int hour = LocalDateTime.now().getHour();
        if(hour==14||AppTools.isTest()) {
            log.info("抖音极速-看小说");
            try {
                int appy =1950;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    appy = 2140;
                }

                Integer y = OcrTools.getWordsInt(androidId,"看小说赚金币");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId,"每天可赚500金币");
                }


                if (null == y) {
                    AdbTools.upPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "看小说赚金币");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "每天可赚500金币");
                }


                if (null == y) {
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "看小说赚金币");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "每天可赚500金币");
                }


                if(null!=y){
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 220, y);
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 170, 1700);
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 880, appy);
                    for(int i=0;i<60;i++) {
                        Thread.sleep(RandomTools.init(6000));
                        AdbTools.tap(androidId, 1060, 660);
                    }
                }
            } catch (Exception e) {
                log.info("抖音极速-看小说异常");
            }
        }
    }


    /**
     * todo 6.看广告
     * @param androidId
     */
    public static void handle6(String androidId){
        log.info("抖音极速-看广告");
        try{
            Integer y = OcrTools.getWordsInt(androidId,"限时任务赚金币");
            if(null==y){
                y = OcrTools.getWordsInt(androidId,"每20分钟完成一次");
            }

            if (null == y) {
                AdbTools.upPage(androidId);
                y = OcrTools.getWordsInt(androidId, "限时任务赚金币");
            }
            if (null == y) {
                y = OcrTools.getWordsInt(androidId, "每20分钟完成一次");
            }


            if (null == y) {
                AdbTools.downPage(androidId);
                y = OcrTools.getWordsInt(androidId, "限时任务赚金币");
            }
            if (null == y) {
                y = OcrTools.getWordsInt(androidId, "每20分钟完成一次");
            }

            if(null!=y){
                AdbTools.tap(androidId, 220, y);
                Thread.sleep(46000);
                AdbTools.back(androidId);

            }
        }catch (Exception e){
            log.info("抖音极速-看广告异常");
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
        log.info("抖音极速-开宝箱");
        try {
            AdbTools.upPage(androidId);
            AdbTools.upPage(androidId);
            int y = 1860;
            int y1 = 1190;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2050;
                y1 = 1290;
            }
            AdbTools.tap(androidId, 880, y);

            Thread.sleep(1000);
            AdbTools.tap(androidId, 540, y1);
            Thread.sleep(46000);
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("抖音极速-开宝箱异常");
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
        int hour = LocalDateTime.now().getHour();
        if(hour==13||hour==23||AppTools.isTest()) {
            log.info("抖音极速-睡觉");
            int yy = 1850;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                yy = 2050;
            }
            try {
                Integer y = OcrTools.getWordsInt(androidId,"睡觉赚金币");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId,"睡觉可以");
                }

                if (null == y) {
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "睡觉赚金币");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "睡觉可以");
                }

                if (null == y) {
                    AdbTools.upPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "睡觉赚金币");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "睡觉可以");
                }


                if(null!=y){
                    AdbTools.tap(androidId, 220, y);
                    if(hour==6){
                         AdbTools.tap(androidId, 540, yy);
                         AdbTools.back(androidId);
                    }
                    AdbTools.tap(androidId, 540, yy);
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("抖音极速-睡觉异常");
            }
        }
    }

    /**
     * todo 12.走路
     * @param androidId
     */
    public static void handle12(String androidId){
       int hour = LocalDateTime.now().getHour();
       if(hour==22||AppTools.isTest()) {
           log.info("抖音极速-走路");
            try {
                Integer y = OcrTools.getWordsInt(androidId,"走路赚金币");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId,"走得越多");
                }

                if (null == y) {
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "走路赚金币");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "走得越多");
                }

                if (null == y) {
                    AdbTools.upPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "走路赚金币");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "走得越多");
                }

                if(null!=y){
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(1000);
                    AdbTools.tap(androidId, 540, 1320);
                    AdbTools.tap(androidId, 540, 1360);
                    AdbTools.tap(androidId, 220, 970);
                    Thread.sleep(2000);
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("抖音极速-走路异常");
            }
       }

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
        int hour = LocalDateTime.now().getHour();
        if(hour==8||hour==12||hour==18||hour==21||AppTools.isTest()) {
            log.info("抖音极速-吃饭");
            try {
                Integer y = OcrTools.getWordsInt(androidId,"吃饭补贴");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId,"每天饭点领补贴");
                }

                if (null == y) {
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "吃饭补贴");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "每天饭点领补贴");
                }

                if (null == y) {
                    AdbTools.upPage(androidId);
                    y = OcrTools.getWordsInt(androidId, "吃饭补贴");
                }
                if (null == y) {
                    y = OcrTools.getWordsInt(androidId, "每天饭点领补贴");
                }


                if(null!=y){
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(1000);
                    if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                        AdbTools.tap(androidId, 540, 1920);
                    }else{
                        AdbTools.tap(androidId, 540, 1820);
                    }
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("抖音极速-吃饭异常");
            }
        }
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
     * todo 获取横幅广告
     * @return
     */
    public static List getBanner(){
        List<String> list = new ArrayList<>();
        list.add("首次邀请好友");
        list.add("限时任务赚金币");
        list.add("扫码立得现金");
        list.add("看视频,赚金币");
        list.add("睡觉赚金币");
        list.add("走路赚金币");
        list.add("看小说赚金币");
        list.add("玩游戏赚钱");
        list.add("签到");
        list.add("0.3元提现");

        return list;
    }


    public static void main(String[] args) {
        OcrTools.getWordsMap("D:\\\\image\\\\666.jpg", getBanner());
    }



}


