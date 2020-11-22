
package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;


/**
 * todo App火山小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class App火山小说 {
    private static Logger log = LoggerFactory.getLogger(App火山小说.class);

    /**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(String androidId) {
        AppTools.appTime();
        try {
            log.info("********************************火山小说操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup火山小说);

            log.info("3.清除");
            AdbTools.clear(androidId);

            int y = 1950;
            if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                y = 2140;
            }
            AdbTools.tap(androidId, 670, y);
            handle1(androidId);
            handle6(androidId);
            handle8(androidId);
            handle10(androidId);


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

    }


    /**
     * todo 1.签到
     *
     * @param
     */
    public static void handle1(String androidId) {
        int hour = LocalDateTime.now().getHour();
        if(hour==0||AppTools.isTest()) {
            log.info("火山小说-签到");
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId, "今日签到");
                if (null != y) {
                    AdbTools.tap(androidId, 870, y - 70);
                    Thread.sleep(2000);
                    int yy = 1350;
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        yy = 1450;
                    }
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(59000);
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("火山小说-签到异常");
            }
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
        int hour = LocalDateTime.now().getHour();
        if(hour==1||AppTools.isTest()) {
            log.info("火山小说-看广告");
            try {
                AdbTools.downPage(androidId);
                AdbTools.downPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId, "看视频领金币");
                if (null != y) {
                    for (int i = 0; i < 3; i++) {
                        Thread.sleep(3000);
                        AdbTools.tap(androidId, 930, y);
                        Thread.sleep(32000);
                        AdbTools.back(androidId);
                    }
                }

            } catch (Exception e) {
                log.info("火山小说-看广告异常");
            }
        }

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
        log.info("火山小说-红包");
        try {
            Integer y = OcrTools.getWordsInt(androidId,"倒计时结束可领取福袋金币");
            if(null!=y) {
                AdbTools.tap(androidId,540,y-70);
                Integer yy = OcrTools.getWordsInt(androidId,"每小时领金币奖励");
                AdbTools.tap(androidId,890,y-100);
            }

        } catch (Exception e) {
            log.info("火山小说-红包异常");
        }
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
        log.info("火山小说-抽奖");
        try {
            Integer y = OcrTools.getWordsInt(androidId,"幸运大转盘");
            if(null!=y) {
                AdbTools.tap(androidId,540,y);
                for (int i = 0; i < 3; i++) {
                    AdbTools.tap(androidId, 540, 1210);
                    Thread.sleep(36000);
                    AdbTools.back(androidId);
                    Thread.sleep(6000);
                    AdbTools.tap(androidId, 540, 1200);
                    AdbTools.tap(androidId, 540, 1310);
                }
            }
        } catch (Exception e) {
            log.info("火山小说-抽奖异常");
        }
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



