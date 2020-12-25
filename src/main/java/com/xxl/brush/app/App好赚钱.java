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

import java.time.LocalDateTime;

/*
 * todo App好赚钱
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App好赚钱 {
    private static Logger log = LoggerFactory.getLogger(App好赚钱.class);


    /* todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************好赚钱操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup好赚钱);

                log.info("3.清除");
                AdbTools.clear(androidId);

                handle6(androidId);
                handle2(androidId);
                handle1(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/*
     * todo 退出
     * @param robot
*/
    public static void quit(String androidId){
        AdbTools.tap(androidId, 970,110);
        AdbTools.tap(androidId, 950,370);
    }


/*
     * todo 清除
     * @param robot
*/
    public static void clear( String androidId){
   
    }


/*
     * todo 1.签到
     * @param robot
*/
    @SneakyThrows
    public static void handle1(String androidId){
            try{
                log.info("好赚钱-签到");
                int yy = 1950;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    yy = 2140;
                }

                AdbTools.tap(androidId, 980,yy);
                Integer y = OcrTools.getWordsInt(androidId,"看视频最高");
                if(null==y){
                    y = OcrTools.getWordsInt(androidId,"签到奖励");
                    y+=120;
                }
                if(null!=y){
                    AdbTools.tap(androidId, 540,y);
                    Thread.sleep(59000);
                    quit(androidId);
                }

            } catch (Exception e) {
                log.info("好赚钱-签到异常");
            }
    }



    /**
     * todo 2.看视频
     * @param androidId
     */
    public static void handle2(String androidId){
        log.info("好赚钱-看视频");
        try {

            int yy = 1950;
            int yyy = 820;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                yy = 2140;
                yyy = 880;
            }

            AdbTools.tap(androidId, 110,yy);


            int x = RandomTools.init(6)+6;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                for(int q=0;q<3;q++){
                    Thread.sleep(RandomTools.init(6000));
                    AdbTools.downPage(androidId);
                }
                AdbTools.tap(androidId, 980,1170);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 540,yyy);
                Thread.sleep(59000);
                quit(androidId);
            }
        }catch (Exception e){
            log.info("好赚钱-看视频异常");
        }
    }


/*
     * todo 6.看广告
     * @param robot
*/
    public static void handle6(String androidId){
        log.info("好赚钱-看广告");
        try{
            int yy = 1950;
            int yyy = 810;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                yy = 2140;
                yyy = 880;
            }
            AdbTools.tap(androidId, 540,yy);

            for(int i=0;i<10;i++) {
                AdbTools.tap(androidId, 540, 1180);
                Thread.sleep(8000);
                AdbTools.tap(androidId, 540, yyy);
                Thread.sleep(59000);
                quit(androidId);
            }

        }catch (Exception e){
            log.info("好赚钱-看广告异常");
        }

    }







}


