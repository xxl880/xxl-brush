package com.xxl.brush.app.sports;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;

/*

 *
 * todo AppQQ阅读
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class AppQQ阅读 {
    private static Logger log = LoggerFactory.getLogger(AppQQ阅读.class);

    /*
     *
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId) {
        if (AppTools.appTime()) return;
        try {
            log.info("********************************QQ阅读操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startupQQ阅读);

            log.info("3.清除");
            AdbTools.clear(androidId);
            clear(androidId);

            AdbTools.tap(androidId, 540, 450);
            Integer y2 = OcrTools.getWordsInt(androidId,"做任务领现金");
            if(null!=y2) {
                AdbTools.tap(androidId, 540, y2);
            }
            Integer y3 = OcrTools.getWordsInt(androidId,"现金福利升级");
            if(null!=y3) {
                AdbTools.tap(androidId, 540, y3+760);
            }

            Integer y4 = OcrTools.getWordsInt(androidId,"看小视频");
            if(null!=y4) {
                AdbTools.tap(androidId, 540, y4+300);
            }

            handle1(androidId);
            handle6(androidId);
            handle9(androidId);
            int y = 1950;
            if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                y = 2140;
            }
            AdbTools.tap(androidId, 320, y);
            handle5(androidId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
     *
     * todo 退出
     * @param robot
     */
    public static void quit(String androidId) {

    }



    /*

     *
     * todo 清除
     * @param robot

     */
    public static void clear(String androidId) {
        try {
            Integer y = OcrTools.getWordsInt(androidId,"取消");
            if(null!=y) {
                AdbTools.tap(androidId,800,y);
            }
        } catch (Exception e) { }
    }



    /*
     *
     * todo 1.签到
     * @param robot
     */
    public static void handle1(String androidId) {
        int hour = LocalDateTime.now().getHour();
        if(hour==0||AppTools.isTest()) {
            log.info("QQ阅读-签到");
            try {
                Integer y = OcrTools.getWordsInt(androidId, "打卡成功");
                if (null != y) {
                    AdbTools.tap(androidId, 540, y + 780);
                    Thread.sleep(32000);
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("QQ阅读-签到异常");
            }
        }
    }

    /*
     *
     * todo 2.看视频
     * @param robot
     */
    public static void handle2(String androidId) {

    }

    /*
     *
     * todo 3.看小视频
     * @param robot
     */


    public static void handle3(String androidId) {

    }

    /*

     *
     * todo 4.看新闻
     * @param robot

     */
    public static void handle4(String androidId) {

    }

    /*

     *
     * todo 5看小说-加入书架
     * @param robot
     */
    public static void handle5(String androidId) {
        int hour = LocalDateTime.now().getHour();
        if(hour==18||AppTools.isTest()) {
            log.info("QQ阅读-看小说");
            int y = 1950;
            if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                y = 2140;
            }
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                AdbTools.tap(androidId, 540, 630);

                AdbTools.tap(androidId, 930, y);
                Thread.sleep(1000);
                AdbTools.tap(androidId, 540, y);
                for (int i = 0; i < 60; i++) {
                    AdbTools.tap(androidId, 1030, 1560);
                    Thread.sleep(RandomTools.init(6000));
                }

            } catch (Exception e) {
                log.info("QQ阅读-看小说异常");
            }
        }
    }

    /*
     *
     * todo 6.看广告
     * @param robot
     */
    public static void handle6(String androidId) {
        int hour = LocalDateTime.now().getHour();
        if(hour==0||AppTools.isTest()) {
            log.info("QQ阅读-看广告");
            try {
                AdbTools.downPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId, "大额金币");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId, "+100金币");
                }
                if (null != y) {
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep(3000);
                        AdbTools.tap(androidId, 880, y);
                        Thread.sleep(59000);
                        AdbTools.back(androidId);
                    }
                }
            } catch (Exception e) {
                log.info("QQ阅读-看广告异常");
            }
        }
    }


    /*

     *
     * todo 7.玩游戏
     * @param robot
     */
    public static void handle7(String androidId) {

    }

    /*

     *
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     */
    public static void handle8(String androidId) {

    }

    /*
     *
     * todo 9.开宝箱
     * @param robot
     */
    public static void handle9(String androidId) {
        log.info("QQ阅读-开宝箱");
        try {
            int y = 1900;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2020;
            }
             AdbTools.tap(androidId,920,y);
        } catch (Exception e) {
            log.info("QQ阅读-开宝箱异常");
        }
    }

    /*
     *
     * todo 10.抽奖
     * @param robot
     */
    public static void handle10(String androidId) {

    }

    /*
     *
     * todo 11.睡觉
     * @param robot*/
    public static void handle11(String androidId) {

    }


    /*

     *
     * todo 12.走路
     * @param robot
     */
    public static void handle12(String androidId) {


    }

    /*

     *
     * todo 13.喝水
     * @param robot
     */
    public static void handle13(String androidId) {

    }

    /*

     *
     * todo 14.充电
     * @param robot

     */
    public static void handle14(String androidId) {

    }

    /*

     *
     * todo 15.听歌曲
     * @param robot
     */
    public static void handle15(String androidId) {

    }


    /*

     *
     * todo 16.吃饭
     * @param robot
     */
    public static void handle16(String androidId) {


    }


    /*

     *
     * todo 17.分享
     * @param robot
     */
    public static void handle17(String androidId) {

    }

    /*
     *
     * todo 18.摇钱树
     * @param robot
     */
    public static void handle18(String androidId) {

    }


    /*

     *
     * todo 19.刮奖
     * @param robot
     */
    public static void handle19(String androidId) {

    }


}


