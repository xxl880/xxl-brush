package com.xxl.brush.app.medias;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.*;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class App微视 {
    private static Logger log = LoggerFactory.getLogger(App微视.class);


/*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
*/
    public static void circulate(String androidId){
        if(AppTools.appMediasTime())return;
        try{
            log.info("********************************微视操作********************************************");
            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup微视);

            log.info("3.启动appium");

            AdbTools.clear(androidId);
            clear(androidId);

            handle2(androidId);

        }catch (Exception e){}

    }



/**
     * todo 退出
     * @param */
    public static void quit(String androidId){

    }


/**
     * todo 清除
     * @param */
    @SneakyThrows
    public static void clear(String androidId){
        Thread.sleep(6000);
        Integer y = OcrTools.getWordsInt(androidId,"立即更新");
        if(null!=y){
            AdbTools.tap(androidId,540,y);
            Thread.sleep(24000);
            Integer yy = OcrTools.getWordsInt(androidId,"安装");
            if(null!=yy){
                AdbTools.tap(androidId,780,yy);
                Thread.sleep(18000);
            }

            Integer yyy = OcrTools.getWordsInt(androidId,"打开");
            if(null!=yyy){
                AdbTools.tap(androidId,780,yy);
                Thread.sleep(6000);
            }

        }
    }





/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){

    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2(String androidId){
        log.info("微视-看视频");
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
            log.info("微视-看视频异常");
        }
    }
 



}


