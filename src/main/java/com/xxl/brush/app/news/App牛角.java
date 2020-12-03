package com.xxl.brush.app.news;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * todo AppApp牛角小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class App牛角 {
    private static Logger log = LoggerFactory.getLogger(App牛角.class);


     /** todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************App牛角小说操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup牛角);
                Thread.sleep(6000);

                log.info("3.清除");
                AdbTools.clear(androidId);
                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 670, y);

                handle1(androidId);
                handle6(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/*     * todo 退出
     * @param */
    public static void quit(String androidId){

    }


/*
*
     * todo 清除
     * @param
*/
    public static void clear(String androidId){

    }


/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){
            log.info("App牛角小说-签到");
            try {
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"签到领奖");
                if(null!=y){
                    AdbTools.tap(androidId,870,y-30);
                    int yy = 1310;
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        yy = 1410;
                    }
                    AdbTools.tap(androidId, 540, yy);
                    Thread.sleep(32000);
                    AdbTools.back(androidId);

                }

            } catch (Exception e) {
                log.info("App牛角小说-签到异常");
            }
    }



/*
     * todo 6.看广告
     * @param
*/
    public static void handle6(String androidId){
        log.info("App牛角小说-看广告");
            try {
                WebElement wl2 = null;
                AdbTools.upPage(androidId);
                AdbTools.down(androidId);
                AdbTools.down(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"看完15~30s小视频即可领取");
                if(null==y){
                    AdbTools.down(androidId);
                    y = OcrTools.getWordsInt(androidId,"看完15~30s小视频即可领取");
                }
                for (int i = 0; i < 3; i++) {
                    AdbTools.tap(androidId,930,y-60);
                    Thread.sleep(36000);
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 970, 180);
                    } else {
                        AdbTools.tap(androidId, 970, 90);
                    }
                    Thread.sleep(2000);
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 540, 1110);
                    } else {
                        AdbTools.tap(androidId, 540, 990);
                    }

                }

            } catch (Exception e) {
                log.info("App牛角小说-看广告异常");
            }

    }



}


