package com.xxl.brush.tools;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * todo 模拟手机操作
 */
public class AdbTools {
    private static final Logger log = LoggerFactory.getLogger(AdbTools.class);

    /**
     * todo 常规操作(传过来数据 点击输入并回车操作)
     *
     */
    public static void process(String operate){
        try {
            log.info(operate);
            Runtime.getRuntime().exec(operate);
            Thread.sleep(2000);
        }catch (Exception e){}
    }


    /**
     * todo 启动app
     * 命令：查看当前app启动 （adb shell dumpsys window | findstr mCurrentFocus）
     * 命令2：启动报错时使用写日志方式找到主类 （adb logcat>D:/app.txt） 使用ctrl+c中断，查看mainActivity
     */
    @SneakyThrows
    public static void startup(String androidId, String operateData){
        log.info("******************启动app**************");
        String operate = " adb -s " + androidId + " shell am start -n " + operateData;
        process(operate);
        Thread.sleep(12000);
    }



    /**
     * todo 唤醒app
     * 命令：查看当前app启动 （adb shell dumpsys window | findstr mCurrentFocus）
     * 命令2：启动报错时使用写日志方式找到主类 （adb logcat>D:/app.txt） 使用ctrl+c中断，查看mainActivity
     */
    @SneakyThrows
    public static void wakeup(String androidId, String operateData){
        log.info("******************唤醒app**************");
        String operate = " adb -s " + androidId + " shell am start -n " + operateData;
        process(operate);
    }

    /**
     * todo 向下滑动，正常操作
     */
    @SneakyThrows
   public static void down(String androidId){
       String operate = "adb -s "+androidId +" shell input swipe 540 1000 540 600";
       process(operate);
   }

    /**
     * todo 向上滑动，返回操作
     */
    @SneakyThrows
    public static void up(String androidId){
        String operate = "adb -s "+androidId +" shell input swipe 540 600 540 900";
        process(operate);
    }

    /**
     * todo 向左滑动，返回操作
     */
    @SneakyThrows
    public static void left(String androidId){
        String operate = "adb -s "+androidId +" shell input swipe 1000 1000 60 1000";
        process(operate);
    }

    /**
     * todo 向右滑动，返回操作
     */
    @SneakyThrows
    public static void right(String androidId){
        String operate = "adb -s "+androidId +" shell input swipe 60 1000 1000 1000";
        process(operate);
    }


    /**
     * todo 向下滑动，正常操作
     */
    @SneakyThrows
    public static void downPage(String androidId){
        String operate = "adb -s "+androidId +" shell input swipe 540 1600 540 600";
        process(operate);
    }

    /**
     * todo 向上滑动，返回操作
     */
    @SneakyThrows
    public static void upPage(String androidId){
        String operate = "adb -s "+androidId +" shell input swipe 540 600 540 1600";
        process(operate);
    }


    /**
     * todo 向下滑动，正常操作
     */
    @SneakyThrows
    public static void tap(String androidId, int x, int y){
        String operate = "adb -s "+androidId +" shell input tap " + x + " " + y;
        process(operate);
    }

    /**
     * todo 退回，正常操作
     */
    @SneakyThrows
    public static void back(String androidId){
        String operate = "adb -s " + androidId + " shell input keyevent BACK";
        process(operate);
    }


    /**
     * todo 刮奖，正常操作
     */
    @SneakyThrows
    public static void tapDraw(String androidId, int x, int y){
        int y1 = 1000+Integer.valueOf(y);
        for(int i=0;i<8;i++) {
            x+=10;
            String operate = "adb -s " + androidId + " shell input swipe " + x + " " + y + " " + x + " " + y1;
            process(operate);
        }
    }

    /**
     * todo 输入正常操作
     */
    @SneakyThrows
    public static void text(String androidId, String str){
        String operate = "adb -s "+androidId +" shell input text " + str;
        process(operate);
    }

    /**
     * todo 手机截图
     */
    @SneakyThrows
    public static void screencap(String androidId){
        String operate = "adb -s " + androidId + " shell screencap -p /sdcard/" + androidId + ".jpg";
        process(operate);
        Thread.sleep(2000);
    }

    /**
     * todo 手机截图推送电脑目录
     */
    @SneakyThrows
    public static void pull(String androidId){
        String operate = "adb -s " + androidId + " pull /sdcard/" + androidId + ".jpg" +" D:/image";
        process(operate);
        Thread.sleep(2000);
    }

    /***
     * todo 获取手机屏幕是否需要点亮(android9->)
     * android9 adb shell dumpsys window policy |find "mScreenOnFully" 判断 mAwake=truemScreenOnEarly=true mScreenOnFully=true
     * android9，10 adb shell dumpsys power | find "Display Power: state=" 判断 Display Power: state=ON
     * @return
     */
    @SneakyThrows
    public static boolean screen(String androidId){
        String screen = "adb -s "+androidId + " shell dumpsys power";
        return exeCmd(screen);
    }




    public static boolean exeCmd(String commandStr) {
        boolean bool = false;
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if(line.contains("state=ON")){
                     bool = true;
                }
                //sb.append(line + "\n");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return bool;
    }




    /**
     *  todo 初始化手机
     * @param androidId
     */
    public static void initMobile( String androidId){
        if(!AdbTools.screen(androidId)) {
            log.info("0.唤醒手机屏幕");
            String operateScreen = "adb -s " + androidId + " shell input keyevent 26";
            process(operateScreen);
        }
        downPage(androidId);

        log.info("0.调取缓存");
        String operateDispath = "adb -s " + androidId + " shell input keyevent 82";
        process(operateDispath);

        log.info("0.删除缓存");
        String operateDelete = "";
        if (androidId.equals(PhoneConstants.phone001)) {
            operateDispath = "adb -s " + androidId + " shell input tap 770 2280";
            process(operateDispath);
            AdbTools.tap(androidId, 540, 2080);
        } else if (androidId.equals(PhoneConstants.phone002)) {
           AdbTools.tap(androidId, 540, 2000);
        } else{
           AdbTools.tap(androidId, 540, 1860);
        }


    }



    /**
     * todo 20.清除
     */
    public static void clear( String androidId){
        Integer y1 = OcrTools.getWordsInt(androidId,"我知道了");
        if(null!=y1){
            AdbTools.tap(androidId,540,y1);
        }
    }

    /**
     * todo 21.获取电脑连接手机的androidid
     * @return
     */
    public static java.util.List getAndroidId(){
        java.util.List<String> list=new ArrayList<>();
        String screen = "adb devices";
        boolean bool = false;
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(screen);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if(line.contains("device")&&!line.contains("devices")){
                     list.add(line.replace("device","").trim());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return (java.util.List) list;
    }


    public static void main(String[] args) throws IOException, InterruptedException {
       startup("a314117", AppConstants.startup赚客宝);


    }



}
