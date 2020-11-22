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
import java.util.Map;

 /** todo App抖音火山
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App抖音火山 {
    private static Logger log = LoggerFactory.getLogger(App抖音火山.class);

/*     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){

            try {
                log.info("********************************抖音火山操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup抖音火山);

                clear(androidId);
                log.info("3.清除");
                AdbTools.clear(androidId);

                clear(androidId);
                AdbTools.tap(androidId, 270, 600);

                handle2(androidId);

                clear(androidId);
                handle1(androidId);

                handle6(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/**
     * todo 退出
     * @param
 * */
    public static void quit(String androidId){

    }


/**
     * todo 清除
     * @param androidId
 * */
    public static void clear(String androidId){
        try {
            Integer yy = OcrTools.getWordsInt(androidId,"以后再说");
            if(null!=yy){
                AdbTools.tap(androidId,540, yy);
                Thread.sleep(2000);
            }

        }catch (Exception e){ }
    }



/*
     * todo 1.签到
     * @param androidId
*/
    public static void handle1(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==0||AppTools.isTest()) {
            log.info("抖音火山-签到");
            try {
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    AdbTools.tap(androidId, 990, 300);
                }else {
                    AdbTools.tap(androidId, 990, 660);
                }
                Thread.sleep(2000);
                Integer y = OcrTools.getWordsInt(androidId, "30天");
                if (null != y) {
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(36000);
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("抖音火山-签到异常");
            }
        }
    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2(String androidId){
        log.info("抖音火山-看视频");
        try {
            int x = RandomTools.init(8)+12;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(8000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(8)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("抖音火山-看视频异常");
        }
    }


/**
     * todo 3.看小视频
     * @param */
    public static void handle3(String androidId){

    }

/*
     * todo 6.看广告
     * @param
*/
    public static boolean handle6(String androidId){
        boolean bool = false;
        log.info("抖音火山-看广告");
        try {
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId, 990, 300);
            }else {
                AdbTools.tap(androidId, 990, 660);
            }

            Thread.sleep(2000);
            Integer y = OcrTools.getWordsInt(androidId,"限时任务赚火苗");
            if(null!=y){
                AdbTools.tap(androidId,930,y+20);
                Thread.sleep(32000);
                AdbTools.back(androidId);
                AdbTools.back(androidId);
            }
        }catch (Exception e){
            bool = true;
            log.info("抖音火山-看广告异常");
        }
        return bool;
    }



}


