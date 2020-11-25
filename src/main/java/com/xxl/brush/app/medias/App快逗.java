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
import java.util.Map;

/**
 * todo App快逗
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class App快逗 {
    private static Logger log = LoggerFactory.getLogger(App快逗.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId,int port,int systemPort, Map<String,Integer> map){
        if(AppTools.appMediasTime())return;
        try{
            log.info("********************************快逗操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup快逗);

            handle2(androidId);
            handle1(androidId);

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

    }




/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==1|| AppTools.isTest()) {
            log.info("快逗-签到");
            try {
                int y = 850;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    y = 930;
                    AdbTools.tap(androidId,660, 2140);
                }else {
                    AdbTools.tap(androidId,540,1950);
                }
                Thread.sleep(2000);
                AdbTools.tap(androidId,540, y);
                Thread.sleep(59000);
            } catch (Exception e) {
                log.info("快逗-签到异常");
            }
        }
    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2(String androidId){
        log.info("快逗-看视频");
        try {
            int x = RandomTools.init(8)+6;
            for (int a = 0; a < x; a++) {
                Integer y = OcrTools.getWordsInt(androidId,"已转满");
                if(null!=y){
                    AdbTools.tap(androidId,540,y+200);
                    Thread.sleep(59000);
                }
                Thread.sleep(RandomTools.init(2000));
                AdbTools.downPage(androidId);
                if (a == RandomTools.init(6)) {
                     AdbTools.upPage(androidId);
                }

            }
        }catch (Exception e){
            log.info("快逗-看视频异常");
        }
    }



/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param */
    public static void handle8(String androidId){
        log.info("快逗-领红包");
        try {


        }catch (Exception e){
            log.info("快逗-领红包异常");
        }
    }




}


