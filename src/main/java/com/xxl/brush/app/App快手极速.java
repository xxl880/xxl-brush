package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * todo App快手
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */

public class App快手极速 {
    private static Logger log = LoggerFactory.getLogger(App快手极速.class);

    /**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(String androidId){

            try {
                log.info("********************************快手极速操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile( androidId);

                log.info("2.启动app");
                AdbTools.startup( androidId, AppConstants.startup快手);

                log.info("3.清除");
                clear(androidId);

              /*  handle2(androidId);*/

                if (androidId.equals(PhoneConstants.phone001)) {
                   AdbTools.tap(androidId, 100, 810);
                } else if (androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.tap(androidId, 100, 650);
                } else {
                    AdbTools.tap(androidId, 90, 440);
                }
                Thread.sleep(2000);
                handle1(androidId);
                handle6(androidId);
                handle20(androidId);
                handle9(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



    /**
     * todo 退出
     * @param androidId

     */
    public static void quit( String androidId){

    }


    /**
     * todo 清除
     * @param androidId

     */
    public static void clear( String androidId){
        try{
        
        }catch (Exception e){}
    }

    /**
     * todo 1.签到
     * @param androidId

     */
    public static void handle1(String androidId){
        if(AppTools.appTime())return;
        log.info("快手极速-签到");
        try {


        } catch (Exception e) {
            log.info("快手极速-签到异常");
        }
    }


    /**
     * todo 2.看视频
     * @param androidId
     */
    public static void handle2(String androidId){
        log.info("快手极速-看视频");
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
            log.info("快手极速-看视频异常");
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
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==16) {
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                AdbTools.down(androidId);
                AdbTools.down(androidId);
                Integer y = OcrTools.getWordsInt(androidId, "1000金币悬赏任务");
                if (null != y) {
                    for (int i = 0; i < 10; i++) {
                        int a = RandomTools.init(12000);
                        Thread.sleep(a);
                        AdbTools.tap(androidId, 930, y+50);
                        Thread.sleep(30000 + a);
                        AdbTools.back(androidId);
                    }
                }
            } catch (Exception e) {
                log.info("快手极速-看广告异常");
            }
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
        log.info("快手极速-开宝箱");
        try {
            AdbTools.tap(androidId, 900, 1550);
        }catch (Exception e){
            log.info("快手极速-开宝箱异常");
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
     * todo 20.直播
     * @param androidId
     */
    public static void handle20(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==0||hour==17) {
            log.info("快手极速-直播");
            try {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"观看精彩直播得100金币");
                if(null!=y) {
                    AdbTools.tap(androidId, 880, y-50);
                }else{
                    AdbTools.upPage(androidId);
                    Integer y1 = OcrTools.getWordsInt(androidId,"观看精彩直播得100金币");
                    if(null!=y1){
                        AdbTools.tap(androidId, 880, y1-50);
                    }
                }
                for (int i = 0; i < 11; i++) {
                    int a = RandomTools.init(6000);
                    Thread.sleep(30000 + a);
                    AdbTools.downPage(androidId);
                }

            } catch (Exception e) {
                log.info("快手极速-直播异常");
            }
        }
    }


    /**
     * todo 获取横幅广告
     * @return
     */
    public static java.util.List getBanner(){
        List<String> list = new ArrayList<>();
        list.add("1000金币悬赏任务");
        list.add("观看精彩直播得100金币");

        return list;
    }


}


