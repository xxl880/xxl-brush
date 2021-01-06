package com.xxl.brush.app.C;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * todo App矿牛守卫赚
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App矿牛守卫赚 {
    private static Logger log = LoggerFactory.getLogger(App矿牛守卫赚.class);


    /* todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************矿牛守卫赚操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup矿牛守卫赚);

                log.info("3.清除");
                AdbTools.clear(androidId);

                int y = 1420;
                int y1 = 90;
                int y2 = 2080;
                int y3 = 1760;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 1530;
                    y1 = 140;
                    y2 = 2260;
                    y3 = 1830;
                }

                Thread.sleep(6000);
                Integer yyyy = OcrTools.getWordsInt(androidId,"放弃");
                if(null!=yyyy) {
                    AdbTools.tap(androidId, 540, yyyy-300);
                    Thread.sleep(36000);
                    AdbTools.tap(androidId, 70, y1);
                    AdbTools.tap(androidId, 970, y1);
                }

                Thread.sleep(6000);
                Integer yyy = OcrTools.getWordsInt(androidId,"恭喜获得");
                if(null!=yyy){
                    AdbTools.tap(androidId,540,yyy+630);
                    Thread.sleep(36000);
                    AdbTools.back(androidId);
                    AdbTools.tap(androidId, 70, y1);
                    AdbTools.tap(androidId, 970, y1);
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 540, y);
                }

                Integer yyy7 = OcrTools.getWordsInt(androidId,"选择分");
                if(null!=yyy7){
                    AdbTools.tap(androidId,540,yyy7+270);
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 540, yyy7+870);
                }

                Thread.sleep(2000);
                AdbTools.tap(androidId, 790, y2);

                    AdbTools.tap(androidId, 540, y3);
                    Thread.sleep(36000);
                    AdbTools.tap(androidId, 70, y1);
                    AdbTools.tap(androidId, 970, y1);
                    for(int i=0;i<10;i++){
                        AdbTools.tap(androidId, 540, y2);
                        Integer yyyyy = OcrTools.getWordsInt(androidId,"解锁奖励");
                        if(null!=yyyyy){
                            AdbTools.tap(androidId,540,yyyyy+120);
                            Thread.sleep(36000);
                            AdbTools.tap(androidId, 70, y1);
                            AdbTools.tap(androidId, 970, y1);
                        }
                        Integer yyyy6 = OcrTools.getWordsInt(androidId,"放弃");
                        if(null!=yyyy6) {
                            AdbTools.tap(androidId, 540, yyyy6-300);
                            Thread.sleep(36000);
                            AdbTools.tap(androidId, 70, y1);
                            AdbTools.tap(androidId, 970, y1);
                        }

                        Integer yyyy8 = OcrTools.getWordsInt(androidId,"恭喜获得");
                        if(null!=yyyy8) {
                            AdbTools.tap(androidId, 540, yyyy8+640);
                            Thread.sleep(36000);
                            AdbTools.tap(androidId, 70, y1);
                            AdbTools.tap(androidId, 970, y1);
                        }

                    }

                for(int i=0;i<10;i++) {
                    AdbTools.tap(androidId, 540, y2);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }


}


