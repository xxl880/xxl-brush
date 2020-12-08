package com.xxl.brush.app.lifeA;

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
 * todo App得意宝
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App得意宝 {
    private static Logger log = LoggerFactory.getLogger(App得意宝.class);


    /* todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
            try {
                log.info("********************************App得意宝操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup得意宝);

                log.info("3.清除");
                AdbTools.clear(androidId);

                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 2140;
                }
                AdbTools.tap(androidId, 110, y);

                handle6(androidId);
                handle8(androidId);
                handle9(androidId);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/*
     * todo 退出
     * @param robot
*/
    public static void quit(String androidId){

    }


/*
     * todo 清除
     * @param robot
*/
    public static void clear( String androidId){
        try{

        }catch (Exception e){}
    }


/*
     * todo 1.签到
     * @param robot
*/
    @SneakyThrows
    public static void handle1(String androidId){
            try{

            } catch (Exception e) {

            }
    }


/*
     * todo 6.看广告
     * @param robot
*/
    public static void handle6(String androidId) {
        log.info("App得意宝-看广告");
        try {
            AdbTools.downPage(androidId);
            for (int i = 0; i < 10; i++) {
                Thread.sleep(2000);
                int y = 1510;
                int y2 = 410;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 1930;
                    y2 = 530;

                    AdbTools.tap(androidId, 110, y);
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 990, y2);

                }


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        /*
     * todo 8.拆红包
     * @param robot
     */
    public static void handle8(String androidId){
        log.info("App得意宝-看广告");
        try{

        }catch (Exception e){
            log.info("App得意宝-看广告异常");
        }

    }


    /*
     * todo 9.兑金币
     * @param robot
     */
    public static void handle9(String androidId){
        log.info("App得意宝-看广告");
        try{

        }catch (Exception e){
            log.info("App得意宝-看广告异常");
        }

    }






}


