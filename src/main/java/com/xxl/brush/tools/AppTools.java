package com.xxl.brush.tools;

import com.xxl.brush.constants.PhoneConstants;
import io.appium.java_client.android.AndroidDriver;
import io.swagger.models.auth.In;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

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
        if(hour!=0||hour!=1||hour!=2) {
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
        if(hour!=0||hour!=1||hour!=2) {
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
        if(hour!=0||hour!=1||hour!=2) {
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
        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);
        if(hour!=0||hour!=1||hour!=2) {
            System.out.println(33333);
            return;
        }
        System.out.println(11111);
    }




}
