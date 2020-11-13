package com.xxl.brush.tools;

import com.xxl.brush.constants.PhoneConstants;
import io.appium.java_client.android.AndroidDriver;
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
     * todo 基础服务时间
     *
     */
    public static void appTime(){
        int hour = LocalDateTime.now().getHour();
        if(hour!=0||hour!=1||hour!=2||hour!=3||hour!=7||hour!=8||hour!=11||hour!=12||hour!=18||hour!=19||hour!=21||hour!=22) {
            return;
        }
    }

    /**
     * todo 基础服务时间
     *
     */
    public static void appSonTime(){
        int hour = LocalDateTime.now().getHour();
        if(hour!=0||hour!=1||hour!=12||hour!=22) {
            return;
        }
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


}
