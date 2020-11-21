
package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * todo AppNOW直播
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */

public class AppNOW直播 {
    private static Logger log = LoggerFactory.getLogger(AppNOW直播.class);


/**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */

    public static void circulate(String androidId) {
        AppTools.appTime();
        try {
            log.info("********************************NOW直播操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startupNOW直播);

            log.info("3.清除");
            AdbTools.clear(androidId);

            int y = 1770;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 1940;
            }
            AdbTools.tap(androidId,780,y);
            Thread.sleep(6000);
            Integer y1 = OcrTools.getWordsInt(androidId,"拒绝");
            if(null!=y1) {
              AdbTools.tap(androidId,540,y1-190);
              Thread.sleep(6000);
            }
            clear(androidId);
            Integer yy = OcrTools.getWordsInt(androidId,"首页");
            if(null!=yy) {
                AdbTools.back(androidId);
            }

            AdbTools.clear(androidId);

            handle1(androidId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


/**
     * todo 退出
     *
     * @param
     */


    public static void quit(String androidId) {

    }


/**
     * todo 清除
     *
     * @param
     */

    public static void clear(String androidId) {
        Integer yy = OcrTools.getWordsInt(androidId,"取消");
        if(null!=yy) {
            AdbTools.tap(androidId,300,yy);
        }
    }

/**
     * todo 1.签到
     *
     * @param
     */

    public static void handle1(String androidId) {
        log.info("NOW直播-签到");
        try {
            int y = 1000;
            int  yy = 1680;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 1100;
                yy = 1730;
            }
            AdbTools.tap(androidId, 990, y);
            Thread.sleep(2000);
            AdbTools.tap(androidId, 540, yy);
        } catch (Exception e) {
            log.info("NOW直播-签到异常");
        }
    }


/**
     * todo 2.看视频
     *
     * @param
     */


    public static void handle2(String androidId) {

    }


/**
     * todo 3.看小视频
     *
     * @param
     */


    public static void handle3(String androidId) {

    }


/**
     * todo 4.看新闻
     *
     * @param
     */


    public static void handle4(String androidId) {

    }


/**
     * todo 5.看小说
     *
     * @param
     */


    public static void handle5(String androidId) {

    }


/**
     * todo 6.看广告
     *
     * @param
     */


    public static void handle6(String androidId) {


    }

/**
     * todo 7.玩游戏
     *
     * @param
     */


    public static void handle7(String androidId) {

    }


/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     *
     * @param
     */


    public static void handle8(String androidId) {

    }


/**
     * todo 9.开宝箱
     *
     * @param
     */


    public static void handle9(String androidId) {

    }


/**
     * todo 10.抽奖
     *
     * @param
     */


    public static void handle10(String androidId) {

    }


/**
     * todo 11.睡觉
     *
     * @param
     */


    public static void handle11(String androidId) {

    }

/**
     * todo 12.走路
     *
     * @param
     */


    public static void handle12(String androidId) {

    }


/**
     * todo 13.喝水
     *
     * @param
     */


    public static void handle13(String androidId) {

    }


/**
     * todo 14.充电
     *
     * @param
     */


    public static void handle14(String androidId) {

    }

/**
     * todo 15.听歌曲
     *
     * @param
     */


    public static void handle15(String androidId) {

    }

/**
     * todo 16.吃饭
     *
     * @param
     */


    public static void handle16(String androidId) {


    }

/**
     * todo 17.分享
     *
     * @param
     */


    public static void handle17(String androidId) {

    }

/**
     * todo 18.摇钱树
     *
     * @param
     */


    public static void handle18(String androidId) {

    }

/**
     * todo 19.刮奖
     *
     * @param
     */


    public static void handle19(String androidId) {

    }


}
 

