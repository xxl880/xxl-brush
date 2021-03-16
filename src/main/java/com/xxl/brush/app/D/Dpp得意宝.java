package com.xxl.brush.app.D;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * todo App得意宝
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class Dpp得意宝 {
    private static Logger log = LoggerFactory.getLogger(Dpp得意宝.class);


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
        AdbTools.tap(androidId, 970, 100);
        AdbTools.tap(androidId, 100, 100);
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
        log.info("App得意宝-签到");
        try{
           AdbTools.upPage(androidId);

           AdbTools.tap(androidId,540,1810);

        } catch (Exception e) { }
    }


/*
     * todo 6.走路
     * @param robot
*/
    public static void handle6(String androidId) {
        log.info("App得意宝-走路");
        try {

            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            for (int i = 0; i < 6; i++) {
                Thread.sleep(2000);
                int y = 1000;
                int y2 = 950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 1200;
                    y2 = 1050;
                }
                AdbTools.tap(androidId, 540, y);
                Thread.sleep(3000);
                AdbTools.tap(androidId, 540, y2);
                AdbTools.back(androidId);
            }

        } catch (InterruptedException e) {
            log.info("App得意宝-走路异常");
        }
    }

        /*
     * todo 8.看广告
     * @param robot
     */
    public static void handle8(String androidId){
        log.info("App得意宝-看广告");
        try{
            AdbTools.tap(androidId,940,580);
            AdbTools.tap(androidId,940,800);
            AdbTools.tap(androidId,940,600);
            AdbTools.tap(androidId,940,520);
            AdbTools.tap(androidId,920,650);
            AdbTools.tap(androidId,920,720);
            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            for (int i = 0; i <10; i++) {
                Thread.sleep(2000);
                int y = 1270;
                int y2 = 1150;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 1430;
                    y2 = 1250;
                }
                AdbTools.tap(androidId, 540, y);

                AdbTools.tap(androidId, 540, 1090);
                Thread.sleep(2000);
                AdbTools.tap(androidId, 540, y2);
                Thread.sleep(59000);
                AdbTools.back(androidId);
            }
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("App得意宝-看广告异常");
        }

    }


    /*
     * todo 9.看视频广告
     * @param robot
     */
    public static void handle9(String androidId){
        log.info("App得意宝-看视频广告");
        try {
            AdbTools.downPage(androidId);
            AdbTools.downPage(androidId);
            for (int i = 0; i < 6; i++) {
                Thread.sleep(2000);
                int y = 1520;
                int y2 = 950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    y = 1200;
                    y2 = 1720;
                }
                AdbTools.tap(androidId, 540, y);
                Thread.sleep(59000);
                AdbTools.back(androidId);
            }

        } catch (InterruptedException e) {
            log.info("App得意宝-看视频广告异常");
        }

    }






}


