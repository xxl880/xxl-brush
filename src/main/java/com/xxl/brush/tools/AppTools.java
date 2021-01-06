package com.xxl.brush.tools;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * todo app操作
 */
public class AppTools {
    private static final Logger log = LoggerFactory.getLogger(AppTools.class);

    /**
     * todo 是否进行测试 true-表示进行测试，任何时间都可以进行运行; false-不进行测试，只有在规定时间内运行
     * 默认是false
     * @return
     */
    public static boolean isTest(){
        boolean bool = true;

        return bool;
    }

    /**
     * todo 基础服务时间
     *
     */
    public static boolean appTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=0||hour!=6||hour!=12||hour!=18) {
          bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 视频时间
     *
     */
    public static boolean appMediasTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=1||hour!=7||hour!=13||hour!=19) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 新闻时间
     *
     */
    public static boolean appNewsTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=2||hour!=8||hour!=14||hour!=20) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 运动时间
     *
     */
    public static boolean appSportsTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=0||hour!=1||hour!=2) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 游戏签到
     *
     */
    public static void playgameTime(){
        int hour = LocalDateTime.now().getHour();
        if(hour!=4||hour!=5||hour!=6) {
            return;
        }
    }

    public static void main(String[] args) {
        List<String> list = AdbTools.getAndroidId();
        handle5(PhoneConstants.phone001);
        if(!CollectionUtils.isEmpty(list)){
            for(String androidId:list){
                handle4(androidId);
            }
        }
    }


    public static void handle4(String androidId){
        log.info("点点新闻-看新闻");
        AdbTools.initMobile(androidId);
        AdbTools.startup(androidId, AppConstants.startup点点);
        try {

            for (int a = 0; a < 100; a++) {
                AdbTools.upPage(androidId);
                AdbTools.tap(androidId, 540, 600);

                for (int i=0;i<8;i++) {
                    Thread.sleep(6000);
                     AdbTools.down(androidId);
                }
                AdbTools.back(androidId);
                Thread.sleep(2000);
            }
        }catch (Exception e){
            log.info("点点新闻-看新闻异常");
        }
    }


    /**
     * todo 疯狂娱乐城
     * @param androidId
     */
    public static void handle5(String androidId){
        try {

            for (int a = 0; a < 100; a++) {
                Thread.sleep(2000);
                AdbTools.tap(androidId, 540, 1550);
                Thread.sleep(59000);
                AdbTools.tap(androidId, 970, 170);
                AdbTools.tap(androidId, 102, 170);
            }
        }catch (Exception e){
        }
    }


    /**
     * todo 看视频
     * @param androidId
     */
    public static void handle6(String androidId){
        try {
            for (int a = 0; a < 600; a++) {
                Thread.sleep(RandomTools.init(2000));
                AdbTools.downPage(androidId);
                Thread.sleep(6000+RandomTools.init(6000));
            }
        }catch (Exception e){
        }
    }




    /*
     * todo 8.看小说
     * @param */
    public static void handle8(String androidId){
        try {
            AdbTools.upPage(androidId);
            AdbTools.tap(androidId, 850, 760);
            Thread.sleep(36000);
            AdbTools.back(androidId);

            AdbTools.tap(androidId, 540, 1720);
            AdbTools.tap(androidId, 540, 1720);
            for(int i=0;i<600;i++) {

                AdbTools.tap(androidId, 1040, 1730);
            }

        }catch (Exception e){
            log.info("米读小说-看小说异常");
        }
    }


}
