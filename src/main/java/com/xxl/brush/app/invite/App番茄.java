package com.xxl.brush.app.invite;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * todo App番茄小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class App番茄 {
    private static Logger log = LoggerFactory.getLogger(App番茄.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************番茄小说操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup番茄);
                Thread.sleep(3000);

                log.info("3.清除");
                AdbTools.clear(androidId);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 540, y);

                handle1(androidId);
                handle9(androidId);
                handle6(androidId);
                handle5(androidId);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

/**
     * todo 退出
     * @param androidId

     */

    public static void quit( String androidId){
        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
           AdbTools.tap(androidId, 970, 180);
        }else {
           AdbTools.tap(androidId, 970, 100);
        }
    }

/**
     * todo 清除
     * @param androidId

     */

    public static void clear( String androidId){


    }

/**
     * todo 1.签到
     * @param androidId

     */

    public static void handle1(String androidId){
            log.info("番茄小说-签到");
            try {
                Thread.sleep(2000);
                Integer y = OcrTools.getWordsInt(androidId,"看视频再领");
                if(null!=y){
                  AdbTools.tap(androidId,540, y);
                    Thread.sleep(36000);
                    clear(androidId);
                }
            } catch (Exception e) {
                log.info("番茄小说-签到异常");
            }
    }


/**
     * todo 2.看视频
     * @param androidId
     */

    public static void handle2(String androidId){

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
        log.info("番茄小说-看小说");
            try {
                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
               AdbTools.tap(androidId, 110, y);

               AdbTools.upPage(androidId);
               Thread.sleep(2000);
               AdbTools.tap(androidId, 170, 660);
               Thread.sleep(3000);

                log.info("加入书架");
                if (androidId.equals(PhoneConstants.phone002)) {
                   AdbTools.tap(androidId, 750, 136);
                } else {
                   AdbTools.tap(androidId, 870, 136);
                }
                Thread.sleep(5000);

                log.info("分享");
                AdbTools.tap(androidId, 990, 136);
                Integer yy = OcrTools.getWordsInt(androidId,"微信");
                if(null!=yy){
                    AdbTools.tap(androidId, 130, yy);
                    Thread.sleep(2000);
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("番茄小说-看小说异常");
            }
    }


/**
     * todo 6.看广告
     * @param androidId
     */

    public static void handle6(String androidId){
        log.info("番茄小说-看广告");
            try {
               AdbTools.upPage(androidId);
               AdbTools.down(androidId);
               AdbTools.down(androidId);
               Integer y = OcrTools.getWordsInt(androidId,"看视频赚海量金币");
               if(null==y){
                   AdbTools.down(androidId);
                   y = OcrTools.getWordsInt(androidId,"看视频赚海量金币");
               }
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(36000);
                    quit(androidId);
                    Thread.sleep(2000);
                }

            } catch (Exception e) {
                log.info("番茄小说-看广告异常");
            }
    }



/**
     * todo 9.开宝箱
     * @param androidId
     */

    public static void handle9(String androidId){
        log.info("番茄小说-开宝箱");
        try {
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
               AdbTools.tap(androidId, 930, 1860);
               Thread.sleep(2000);
               AdbTools.tap(androidId, 540, 1310);
            }else {
                AdbTools.tap(androidId, 930, 1670);
                Thread.sleep(2000);
               AdbTools.tap(androidId, 540, 1210);
            }
            Thread.sleep(46000);
            quit(androidId);

        }catch (Exception e){
            log.info("番茄小说-开宝箱异常");
        }
    }

}


