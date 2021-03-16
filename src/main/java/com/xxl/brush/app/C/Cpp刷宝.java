package com.xxl.brush.app.C;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;

/**
 * todo App刷宝
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class Cpp刷宝 {
    private static Logger log = LoggerFactory.getLogger(Cpp刷宝.class);


/*     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appMediasTime())return;
        try{
            log.info("********************************刷宝操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup刷宝);

            log.info("3.清除");
            AdbTools.clear(androidId);
            clear(androidId);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.tap(androidId,110,y);

            handle2(androidId);

            AdbTools.tap(androidId,760,y);
            clear(androidId);

            handle9(androidId);
            handle6(androidId);
            handle61(androidId);
        }catch (Exception e){}

    }



/**
     * todo 退出
     * @param */
    @SneakyThrows
    public static void quit(String androidId){
        int y2 = 100;
        int y3 = 390;
        if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
            y2 = 180;
            y3 = 480;
        }
        AdbTools.tap(androidId, 970, y2);
        Thread.sleep(2000);
        AdbTools.tap(androidId, 790, y3);
    }


/**
     * todo 清除
     * @param */
    public static void clear( String androidId){
        try{
            Integer yyy = OcrTools.getWordsInt(androidId,"恭喜获得");
            if(null!=yyy) {
                AdbTools.tap(androidId, 860, yyy-390);
            }


        }catch (Exception e){}
    }




/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1||AppTools.isTest()) {
            log.info("刷宝-签到");
            try {
                AdbTools.upPage(androidId);
                int y = 530;
                int y1 = 1400;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 550;
                    y1 = 1500;
                }
                AdbTools.tap(androidId, 900, y);
                Thread.sleep(3000);
                AdbTools.tap(androidId, 760, y1);
                Thread.sleep(36000);
                quit(androidId);

            } catch (Exception e) {
                log.info("刷宝-签到异常");
            }
        }
    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2(String androidId){
        log.info("刷宝-看视频");
        try {
            int x = RandomTools.init(8)+8;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("刷宝-看视频异常");
        }
    }



/**
     * todo 6.看广告
     * @param
 * */
    public static void handle6(String androidId){
        log.info("刷宝-看广告");
        try{
            AdbTools.upPage(androidId);
            Integer y = OcrTools.getWordsInt(androidId,"看视频可领取元宝");
            if(null==y){
                AdbTools.down(androidId);
                y = OcrTools.getWordsInt(androidId,"看视频可领取元宝");
            }
            if(null!=y){
                AdbTools.tap(androidId,140,y+180);
                Thread.sleep(46000);
                quit(androidId);
                AdbTools.tap(androidId,410,y+180);
                Thread.sleep(46000);
                quit(androidId);
                AdbTools.tap(androidId,680,y+180);
                Thread.sleep(46000);
                quit(androidId);
                AdbTools.tap(androidId,940,y+180);
                Thread.sleep(46000);
                quit(androidId);
            }

        }catch (Exception e){
            log.info("刷宝-看广告异常");
        }

    }



    /**
     * todo 6.1看提现广告
     * @param */
    public static void handle61(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1||AppTools.isTest()) {
            log.info("刷宝-看提现广告");
            try {
                int y = 1950;
                int y1 = 910;
                int y2 = 1280;
                int y3 = 100;
                int y4 = 710;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                    y1 = 960;
                    y2 = 1320;
                    y3 = 180;
                    y4 = 820;
                }
                AdbTools.tap(androidId, 970, y);
                Thread.sleep(2000);
                AdbTools.tap(androidId,210,y1);
                Thread.sleep(2000);
                AdbTools.tap(androidId,900,y2);
                Thread.sleep(42000);

                AdbTools.tap(androidId, 970, y3);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 760, y4);
                AdbTools.tap(androidId,900,y2);
                Thread.sleep(42000);

            } catch (Exception e) {
                log.info("刷宝-看提现广告常");
            }
        }

    }




/**
     * todo 9.开宝箱
     * @param */
    public static void handle9(String androidId){
        log.info("刷宝-开宝箱");
        try {
            int y = 1480;
            int y1 = 1450;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 1650;
                y1 = 1550;
            }
            AdbTools.tap(androidId,930,y);
            Thread.sleep(3000);
            AdbTools.tap(androidId,540,y1);
            Thread.sleep(36000);
            quit(androidId);
        }catch (Exception e){
            log.info("刷宝-开宝箱异常");
        }
    }





}


