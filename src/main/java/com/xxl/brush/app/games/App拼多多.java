package com.xxl.brush.app.games;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * todo App拼多多
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */




public class App拼多多 {
    private static Logger log = LoggerFactory.getLogger(App拼多多.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */

    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************拼多多操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup拼多多);

                log.info("3.清除");
                AdbTools.clear(androidId);
                clear(androidId);

                int y = 1950;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    y = 2140;
                }
                AdbTools.tap(androidId, 110, y);

                handle1(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/**
     * todo 退出
     * @param

     */

    public static void quit( String androidId){

    }


/**
     * todo 清除
     * @param

     */

    public static void clear( String androidId){
        try {
            Integer y = OcrTools.getWordsInt(androidId,"通讯录好友");
            if(null!=y){
                AdbTools.tap(androidId,540,y);
            }

            Integer yy = OcrTools.getWordsInt(androidId,"好的");
            if(null!=yy){
                AdbTools.tap(androidId,540,yy);
            }

            Integer yyy = OcrTools.getWordsInt(androidId,"新人礼包");
            if(null!=yyy){
                AdbTools.tap(androidId,540,yyy);
            }
        }catch (Exception e){

        }
    }



/**
     * todo 1.签到
     * @param

     */

    public static void handle1(String androidId){
            log.info("拼多多-签到");
            try {
                AdbTools.upPage(androidId);
                Integer yy = OcrTools.getWordsInt(androidId,"好的");
                if(null!=yy){
                    AdbTools.tap(androidId,540,yy);
                }

                Integer y = OcrTools.getWordsInt(androidId,"签到领钱");
                if(null!=y){
                    AdbTools.tap(androidId,540,y);
                }

            } catch (Exception e) {
                log.info("拼多多-签到异常");
            }
    }


/**
     * todo 2.看视频
     * @param
     */

    public static void handle2(String androidId){

    }


/**
     * todo 3.看小视频
     * @param
     */

    public static void handle3(String androidId){

    }


/**
     * todo 4.看新闻
     * @param
     */

    public static void handle4(String androidId){

    }


/**
     * todo 5.看小说
     * @param
     */

    public static void handle5(String androidId){

    }


/**
     * todo 6.看广告
     * @param
     */

    public static void handle6(String androidId){

    }

/**
     * todo 7.玩游戏
     * @param
     */

    public static void handle7(String androidId){

    }


/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param
     */

    public static void handle8(String androidId){

    }



/**
     * todo 9.开宝箱
     * @param
     */

    public static void handle9(String androidId){

    }


/**
     * todo 10.抽奖
     * @param
     */

    public static void handle10(String androidId){

    }


/**
     * todo 11.睡觉
     * @param
     */

    public static void handle11(String androidId){

    }

/**
     * todo 12.走路
     * @param
     */

    public static void handle12(String androidId){


    }


/**
     * todo 13.喝水
     * @param
     */

    public static void handle13(String androidId){

    }


/**
     * todo 14.充电
     * @param
     */

    public static void handle14(String androidId){

    }

/**
     * todo 15.听歌曲
     * @param
     */

    public static void handle15(String androidId){

    }

/**
     * todo 16.吃饭
     * @param
     */

    public static void handle16(String androidId){



    }

/**
     * todo 17.分享
     * @param
     */

    public static void handle17(String androidId){

    }

/**
     * todo 18.摇钱树
     * @param
     */

    public static void handle18(String androidId){

    }

/**
     * todo 19.刮奖
     * @param
     */

    public static void handle19(String androidId){

    }








}


