package com.xxl.brush.app.medias;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;

/**
 * todo App抖音
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class App追看 {
    private static Logger log = LoggerFactory.getLogger(App追看.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate( String androidId){
        if(AppTools.appMediasTime())return;
        try{
            log.info("********************************追看操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup( androidId, AppConstants.startup追看);

            log.info("3.清除");
            AdbTools.clear(androidId);
            clear(androidId);

            int y = 1950;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2140;
            }
            AdbTools.tap(androidId,130,y);
            handle2(androidId);

            AdbTools.tap(androidId,670,y);
            Thread.sleep(2000);
            handle6(androidId);
            handle9(androidId);
            handle19(androidId);

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
    public static void clear(String androidId){
        try{
            Integer yy = OcrTools.getWordsInt(androidId,"发现新版");
            if(null!=yy){
                AdbTools.tap(androidId,540,yy+500);
                Thread.sleep(6000);
                Integer yyy = OcrTools.getWordsInt(androidId,"继续安装");
                if(null!=yyy){
                    AdbTools.tap(androidId,800,yyy);
                    Thread.sleep(12000);
                }
                Integer yyyy = OcrTools.getWordsInt(androidId,"打开");
                if(null!=yyyy){
                    AdbTools.tap(androidId,800,yyy);
                    Thread.sleep(12000);
                }

            }
        }catch (Exception e){}
    }




/**
     * todo 1.签到
     * @param */
    public static void handle1( String androidId){
        log.info("追看-签到");
        try {
            Integer yy = OcrTools.getWordsInt(androidId,"连续签到");
            if(null==yy){
                int y = 1220;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    y = 1270;
                }
                AdbTools.tap(androidId,540,y);
                Thread.sleep(59000);
                AdbTools.process(androidId);

            }
        }catch (Exception e){
            log.info("追看-签到异常");
        }
    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2( String androidId){
        log.info("追看-看视频");
        try {
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(12000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                    AdbTools.upPage(androidId);
                }
            }
        }catch (Exception e){
            log.info("追看-看视频异常");
        }
    }


/*
*
     * todo 6.点击广告领取
     * @param
*/
    public static void handle6( String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1||AppTools.isTest()) {
            log.info("追看-看广告");
            try {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                AdbTools.up(androidId);
                Integer yy = OcrTools.getWordsInt(androidId, "点击广告一秒");
                if (null == yy) {
                    AdbTools.up(androidId);
                    yy = OcrTools.getWordsInt(androidId, "点击广告一秒");
                }
                AdbTools.tap(androidId, 540, yy);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 540, 1100);
                AdbTools.back(androidId);

            } catch (Exception e) {
                log.info("追看-看广告异常");
            }
        }
    }



/**
     * todo 9.开宝箱
     * @param */
    public static void handle9( String androidId){
        log.info("追看-开宝箱");
        try {
            int y = 1740;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 1950;
            }
            AdbTools.tap(androidId,930,y);
            Thread.sleep(45000);
            AdbTools.back(androidId);

        }catch (Exception e){
            log.info("追看-开宝箱异常");
        }
    }


/**
     * todo 10.抽奖
     * @param */
    public static void handle10( String androidId){
        log.info("追看-抽奖");
        try {


        }catch (Exception e){
            log.info("追看-抽奖异常");
        }
    }



/**
     * todo 19.刮奖
     * @param */
    public static void handle19( String androidId) {
        log.info("追看-刮奖");
        try {
            Integer yy = OcrTools.getWordsInt(androidId, "免费刮卡拿现金");
            if (null == yy) {
                AdbTools.down(androidId);
                yy = OcrTools.getWordsInt(androidId, "每日刮刮卡限量抢");
            }
            if (null != yy) {
                AdbTools.tap(androidId, 540, yy);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 540, 1000);
                Integer y = OcrTools.getWordsInt(androidId, "刮开此涂层");
                if (null != y) {
                    AdbTools.tapDraw(androidId, 80, y - 320);
                }
            }
        } catch (Exception e) {
            log.info("追看-刮奖异常");
        }
    }





}


