package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;

/*
 * todo App书旗小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App书旗 {
    private static Logger log = LoggerFactory.getLogger(App书旗.class);


    /* todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************书旗小说操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup书旗);

                log.info("3.清除");
                AdbTools.clear(androidId);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 540, y);

                handle1(androidId);
                handle6(androidId);
                handle17(androidId);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/*
     * todo 退出
     * @param robot
*/
    public static void quit(String androidId){
        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
            AdbTools.tap(androidId, 106, 150);
            AdbTools.tap(androidId, 975, 150);
            AdbTools.tap(androidId, 106, 150);
            AdbTools.tap(androidId, 975, 150);
        }else {
            AdbTools.tap(androidId, 106, 70);
            AdbTools.tap(androidId, 975, 70);
            AdbTools.tap(androidId, 106, 70);
            AdbTools.tap(androidId, 975, 70);
        }
    }


/*
     * todo 清除
     * @param robot
*/
    public static void clear( String androidId){
        try{
            Integer y = OcrTools.getWordsInt(androidId,"取消");
            if(null!=y){
                AdbTools.tap(androidId,540,y);
            }
            Thread.sleep(2000);
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId,540,1760);
            }else {
                AdbTools.tap(androidId,540,1660);
            }

           AdbTools.up(androidId);
        }catch (Exception e){}
    }


/*
     * todo 1.签到
     * @param robot
*/
    @SneakyThrows
    public static void handle1(String androidId){
            try{
                log.info("书旗小说-签到");
                Integer y = OcrTools.getWordsInt(androidId,"签到成功");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId,"30天");
                }

                if(null!=y){
                    if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                        AdbTools.tap(androidId,540, 1560);
                    }else{
                        AdbTools.tap(androidId,540, 1420);
                    }
                    Thread.sleep(36000);
                    quit(androidId);
                }
            } catch (Exception e) {
                log.info("书旗小说-签到异常");
            }
    }


/*
     * todo 6.看广告
     * @param robot
*/
    public static void handle6(String androidId){
        log.info("书旗小说-看广告");
        try{
            handle1(androidId);
            Integer y = OcrTools.getWordsInt(androidId,"百万");
            if(null==y){
                AdbTools.upPage(androidId);
                y = OcrTools.getWordsInt(androidId,"百万");
            }

            if(null!=y){
                for(int i=0;i<10;i++) {
                    Thread.sleep(1000);
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(36000);
                    quit(androidId);
                }
            }
        }catch (Exception e){
            log.info("书旗小说-看广告异常");
        }

    }



/*     * todo 17.分享
     * @param robot*/
    public static void handle17(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1||AppTools.isTest()){
            log.info("书旗小说-分享");
            try {
                AdbTools.downPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"每日邀请书友一起读赚金币");
                if(null!=y){
                    AdbTools.tap(androidId,540,y-60);
                    Integer y1 = OcrTools.getWordsInt(androidId,"微信好友");
                    AdbTools.tap(androidId,190, y1-130);
                    Thread.sleep(2000);
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("书旗小说-分享异常");
            }
        }
    }





}


