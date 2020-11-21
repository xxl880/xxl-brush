package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*
*
 * todo App米读小说
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App米读 {
    private static Logger log = LoggerFactory.getLogger(App米读.class);

/*
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************米读小说操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup米读);

                log.info("3.清除");
                AdbTools.clear(androidId);

                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    AdbTools.tap(androidId, 670, 2140);
                } else {
                    AdbTools.tap(androidId, 670, 1950);
                }

                handle1(androidId);
                handle5(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



  /*   * todo 退出
     * @param 
*/
    public static void quit(String androidId){

    }


    /* * todo 清除
     * @param 
*/
    @SneakyThrows
    public static void clear(String androidId){
        Integer y = OcrTools.getWordsInt(androidId,"有新版本更新啦");
        if(null!=y){
            AdbTools.tap(androidId,540,y+606);
            Thread.sleep(2000);
        }
    }


/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){
            log.info("米读小说-签到");
            try {
                AdbTools.upPage(androidId);
                AdbTools.tap(androidId, 890, 360);
            } catch (Exception e) {
                log.info("米读小说-签到异常");
            }
    }




 /*
     * todo 5.看小说
     * @param */
    public static void handle5(String androidId){
        log.info("米读小说-看小说");
        try {
            AdbTools.upPage(androidId);
            AdbTools.tap(androidId, 850, 760);
            Thread.sleep(36000);
            AdbTools.back(androidId);

            AdbTools.tap(androidId, 540, 1720);
            AdbTools.tap(androidId, 540, 1720);
            for(int i=0;i<60;i++) {
                Thread.sleep(RandomTools.init(6000));
                AdbTools.tap(androidId, 1040, 1730);
            }

        }catch (Exception e){
            log.info("米读小说-看小说异常");
        }
    }

 

}


