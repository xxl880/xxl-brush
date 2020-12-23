package com.xxl.brush.app.invite;/*
package com.xxl.brush.app.news;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.Map;

*/
/**
 * todo App赚钱阅文赚新闻
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 *//*




public class App赚钱阅文赚 {
    private static Logger log = LoggerFactory.getLogger(App赚钱阅文赚.class);

    */
/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     *//*

    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************赚钱阅文赚操作********************************************");

            log.info("1.初始化手机");
            AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup赚钱阅文赚);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);

            AdbTools.clear(driver);
            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"我的\")");
            wl1.click();

            handle1(robot, androidId, driver, map);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    */
/**
     * todo 退出
     * @param robot

     *//*

    public static void quit(Robot robot, AndroidDriver driver){

    }


    */
/**
     * todo 清除
     * @param robot

     *//*

    public static void clear(Robot robot, AndroidDriver driver){

    }





    */
/**
     * todo 1.签到
     * @param robot

     *//*

    public static void handle1(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("赚钱阅文赚-签到");
        try {

            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"签到\")");
            wl2.click();

            WebElement wl3 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"倍领取\")");
            wl3.click();
            robot.delay(32000);
            try {
                WebElement wl4 = driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.yj.yuewenzhuan:id/ksad_end_close_btn\")");
                wl4.click();
            }catch (Exception e){}

            try {
                WebElement wl5 = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"朕收下了\")");
                wl5.click();
            }catch (Exception e){}

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("赚钱阅文赚-签到异常");
        }

    }


    */
/**
     * todo 2.看视频
     * @param robot
     *//*

    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 3.看小视频
     * @param robot
     *//*

    public static void handle3(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 4.看新闻
     * @param robot
     *//*

    public static void handle4(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 5.看小说
     * @param robot
     *//*

    public static void handle5(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 6.看广告
     * @param robot
     *//*

    public static void handle6(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }





    */
/**
     * todo 7.玩游戏
     * @param robot
     *//*

    public static void handle7(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
     *//*

    public static void handle8(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }



    */
/**
     * todo 9.开宝箱
     * @param robot
     *//*

    public static void handle9(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 10.抽奖
     * @param robot
     *//*

    public static void handle10(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 11.睡觉
     * @param robot
     *//*

    public static void handle11(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 12.走路
     * @param robot
     *//*

    public static void handle12(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){


    }


    */
/**
     * todo 13.喝水
     * @param robot
     *//*

    public static void handle13(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }


    */
/**
     * todo 14.充电
     * @param robot
     *//*

    public static void handle14(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 15.听歌曲
     * @param robot
     *//*

    public static void handle15(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 16.吃饭
     * @param robot
     *//*

    public static void handle16(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){



    }

    */
/**
     * todo 17.分享
     * @param robot
     *//*

    public static void handle17(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 18.摇钱树
     * @param robot
     *//*

    public static void handle18(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }

    */
/**
     * todo 19.刮奖
     * @param robot
     *//*

    public static void handle19(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){

    }





*/
/*
    public static void main(String args[]) throws AWTException {
        Robot robot = new Robot();
         handle(robot,"phone003");

    }
*//*



}


*/
