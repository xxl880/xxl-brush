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
     * todo 0.提现时间
     *
     */
    public static boolean appWithdrawTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=6||hour!=9||hour!=12||hour!=21) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 1.签到时间
     *
     */
    public static boolean appSignTime(){
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
     * todo 2.视频时间
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
     * todo 3.新闻时间
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
     * todo 5.看小说时间
     *
     */
    public static boolean appNovelTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=8||hour!=12||hour!=18||hour!=21) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 6.吃饭时间
     *
     */
    public static boolean appEatTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=8||hour!=12||hour!=18||hour!=21) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 7.睡觉时间
     *
     */
    public static boolean appSleepTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=13||hour!=23) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 8.走路时间
     *
     */
    public static boolean appWalkTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=14||hour!=20) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 9.看广告时间
     *
     */
    public static boolean appAdvertTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=5||hour!=9||hour!=15||hour!=19) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 10.看直播时间
     *
     */
    public static boolean appDirectTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=2||hour!=7||hour!=16||hour!=21) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 11.游戏时间
     *
     */
    public static boolean appPlayTime1(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=2||hour!=7) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 12.游戏时间
     *
     */
    public static boolean appPlayTime2(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=16||hour!=21) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }


    /**
     * todo 13.分享时间
     *
     */
    public static boolean appShareTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=7||hour!=10||hour!=13) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

    /**
     * todo 14.抽奖时间
     *
     */
    public static boolean appDrawTime(){
        boolean bool = false;
        int hour = LocalDateTime.now().getHour();
        if(hour!=3||hour!=15||hour!=17) {
            bool = true;
        }
        if(isTest()){
            bool= false;
        }
        return bool;
    }

}
