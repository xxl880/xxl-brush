package com.xxl.brush.tools;

import com.xxl.brush.constants.PhoneConstants;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * todo 模拟手机操作
 */
public class AdbTools {
    private static final Logger log = LoggerFactory.getLogger(AdbTools.class);

    /**
     * todo 常规操作(传过来数据 点击输入并回车操作)
     *
     */
    public static void process(Robot robot, String operateData){
        try {
            log.info(operateData);
            Runtime.getRuntime().exec(operateData);
            robot.delay(600);
        }catch (Exception e){

        }
    }


    /**
     * todo 启动app
     * 命令：查看当前app启动 （adb shell dumpsys window | findstr mCurrentFocus）
     * 命令2：启动报错时使用写日志方式找到主类 （adb logcat>D:/app.txt） 使用ctrl+c中断，查看mainActivity
     */
    @SneakyThrows
    public static void startup(Robot robot,String androidId, String operateData){
        log.info("******************启动app**************");
             robot.delay(1000);
            String operate = " adb -s " + androidId + " shell am start -n " + operateData;
            Runtime.getRuntime().exec(operate);
            robot.delay(6000);
    }


    /**
     * todo 向下滑动，正常操作
     */
   public static String down(String androidId){
       String downDraw = "adb -s "+androidId +" shell input swipe 540 900 540 600";

       return  downDraw;
   }

    /**
     * todo 向上滑动，返回操作
     */
    public static String up(String androidId){
        String downDraw = "adb -s "+androidId +" shell input swipe 540 600 540 900";

        return  downDraw;
    }

    /**
     * todo 向左滑动，返回操作
     */
    public static String left(String androidId){
        String downDraw = "adb -s "+androidId +" shell input swipe 1000 1000 60 1000";

        return  downDraw;
    }

    /**
     * todo 向右滑动，返回操作
     */
    public static String right(String androidId){
        String downDraw = "adb -s "+androidId +" shell input swipe 60 1000 1000 1000";

        return  downDraw;
    }


    /**
     * todo 向下滑动，正常操作
     */
    public static String downPage(String androidId){
        String downDraw = "adb -s "+androidId +" shell input swipe 540 1600 540 400";

        return  downDraw;
    }

    /**
     * todo 向上滑动，返回操作
     */
    public static String upPage(String androidId){
        String downDraw = "adb -s "+androidId +" shell input swipe 540 400 540 1600";

        return  downDraw;
    }


    /**
     * todo 向下滑动，正常操作
     */
    public static String tap(String androidId, String x, String y){
        String tap = "adb -s "+androidId +" shell input tap " + x + " " + y;
        return  tap;
    }


    /**
     * todo 刮奖，正常操作
     */
    public static String tapDraw(String androidId, String x, String y){
        int y1 = 1000+Integer.valueOf(y);

        String draw = "adb -s "+androidId +" shell input swipe "+ x + " " + y + " " + x +" " +y1;

        return draw;
    }

    /**
     * todo 输入正常操作
     */
    public static String text(String androidId, String str){
        String text = "adb -s "+androidId +" shell input text " + str;
        return  text;
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
      * @param robot
     * @param robotCode
     */
    public static String initMobile(Robot robot,String robotCode){
        log.info("robotCode:{}" + robotCode);
        String androidId = "";
        if (robotCode.equals("phone001")) {
            androidId = PhoneConstants.phone001;
        } else if (robotCode.equals("phone002")) {
            androidId = PhoneConstants.phone002;
        } else if (robotCode.equals("phone003")) {
            androidId = PhoneConstants.phone003;
        } else if (robotCode.equals("phone0031")) {
            androidId = PhoneConstants.phone0031;
        } else if (robotCode.equals("phone0032")) {
            androidId = PhoneConstants.phone0032;
        } else if (robotCode.equals("phone0033")) {
            androidId = PhoneConstants.phone0033;
        } else if (robotCode.equals("phone0034")) {
            androidId = PhoneConstants.phone0034;
        } else if (robotCode.equals("phone0035")) {
            androidId = PhoneConstants.phone0035;
        }

        if(StringUtils.isBlank(androidId)) return androidId;

        if(!AdbTools.screen(androidId)) {
            log.info("0.唤醒手机屏幕");
            String operateScreen = "adb -s " + androidId + " shell input keyevent 26";
            process(robot, operateScreen);
        }
        log.info("0.返回主界面");
        String operateHome = "adb -s " + androidId + " shell input keyevent 3";
        process(robot, operateHome);

        log.info("0.调取缓存");
        String operateDispath = "adb -s " + androidId + " shell input keyevent 82";
        process(robot, operateDispath);

        log.info("0.删除缓存");
        String operateDelete = "";
        if (androidId.equals(PhoneConstants.phone001)) {
            operateDispath = "adb -s " + androidId + " shell input tap 770 2280";
            process(robot, operateDispath);
            operateDelete = AdbTools.tap(androidId, String.valueOf(540), String.valueOf(2080));
        } else if (androidId.equals(PhoneConstants.phone002)) {
            operateDelete = AdbTools.tap(androidId, String.valueOf(540), String.valueOf(2000));
        } else if (androidId.equals(PhoneConstants.phone003)||androidId.equals(PhoneConstants.phone0031)
                ||androidId.equals(PhoneConstants.phone0032)||androidId.equals(PhoneConstants.phone0033)
                ||androidId.equals(PhoneConstants.phone0034)||androidId.equals(PhoneConstants.phone0035)) {
            operateDelete = AdbTools.tap(androidId, String.valueOf(540), String.valueOf(1860));
        }
        process(robot, operateDelete);

        log.info("0.返回主界面");
        process(robot, operateHome);

        return androidId;
    }






    public static void main(String[] args) throws IOException, InterruptedException {
        boolean bool = screen(PhoneConstants.phone002);
        System.out.println(bool);


    }



}
