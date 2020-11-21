package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Map;

/*
*
 * todo AppApp必看小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App必看小说 {
    private static Logger log = LoggerFactory.getLogger(App必看小说.class);

/**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************App必看小说操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup必看);

                log.info("3.清除");
                AdbTools.clear(androidId);
                clear(androidId);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 540, y);
                AdbTools.tap(androidId, 830, 660);
                AdbTools.tap(androidId, 830, 690);


                handle1(androidId);

                handle6(androidId);

                handle5(androidId);
                handle9(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/**
     * todo 退出
     * @param */
    public static void quit(String androidId){

    }


/**
     * todo 清除
     * @param */
    public static void clear(String androidId){
         try{
         
         }catch (Exception e){}
    }


/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){
            log.info("App必看小说-签到");
            try {
                Integer y = OcrTools.getWordsInt(androidId,"看广告视频再赚");
                if(null!=y){
                    AdbTools.tap(androidId,540,y);
                    Thread.sleep(36000);
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("App必看小说-签到异常");
            }
    }


/**
     * todo 5.看小说
     * @param */
    public static void handle5(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1) {
            log.info("必看小说-看小说");
            try {
                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 110, y);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 150, 1310);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 970, y);

                for (int i = 0; i < 60; i++) {
                    AdbTools.tap(androidId, 1020, 600);
                }

            } catch (Exception e) {
                log.info("必看小说-看小说异常");
            }
        }
    }

/*
*
     * todo 6.看广告
     * @param */
    public static void handle6(String androidId){
        log.info("App必看小说-看广告");
            try {
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"视频赚");
                if(null!=y){
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(1000);
                        AdbTools.tap(androidId,130,y-160);
                        Thread.sleep(36000);
                        if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                            AdbTools.tap(androidId, 960, 180);
                        } else {
                            AdbTools.tap(androidId, 960, 100);
                        }
                    }
                }

            } catch (Exception e) {
                log.info("App必看小说-看广告异常");
            }

    }



/**
     * todo 9.开宝箱
     * @param */
    public static void handle9(String androidId){
        log.info("App必看小说-开宝箱");
        try {
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId, 830, 760);
            }else{
                AdbTools.tap(androidId, 830, 690);
            }

            Integer y = OcrTools.getWordsInt(androidId,"看广告");
            if(null!=y){
                AdbTools.tap(androidId,540,y);
                Thread.sleep(36000);
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    AdbTools.tap(androidId, 960, 180);
                }else {
                    AdbTools.tap(androidId, 960, 100);
                }
            }

        }catch (Exception e){
            log.info("App必看小说-开宝箱异常");
        }
    }


/*
*
     * todo 10.抽奖
     * @param 
*/
    public static void handle10(String androidId){
        log.info("必看小说-抽奖");
        try {
            AdbTools.upPage(androidId);
            Integer y = OcrTools.getWordsInt(androidId,"幸运大转盘");
            if(null!=y){
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    AdbTools.tap(androidId,130,y-160);
                    Thread.sleep(36000);
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 960, 180);
                    } else {
                        AdbTools.tap(androidId, 960, 100);
                    }
                }
            }

        } catch (Exception e) {
            log.info("App必看小说-抽奖异常");
        }


    }



}


