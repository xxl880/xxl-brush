/*
package com.xxl.brush.app.news;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.RandomTools;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.Map;

*/
/**
 * todo App点点新闻
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 *//*




public class App点点 {
    private static Logger log = LoggerFactory.getLogger(App点点.class);

    */
/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     *//*

    public static void circulate(Robot robot,String androidId,int port,int systemPort, Map<String,Integer> map){
        try{
            log.info("********************************点点新闻操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(robot,androidId);

            log.info("2.启动app");
            AdbTools.startup(robot, androidId, AppConstants.startup点点);

            log.info("3.启动appium");
            AndroidDriver driver = AppiumTools.init(androidId,port,systemPort);
            AdbTools.clear(driver);
            handle2(robot, androidId, driver, map);
            handle4(robot, androidId, driver, map);
            try {
                WebElement wl = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"任务\")");
                wl.click();
            }catch (Exception e){  }
            handle41(robot, androidId, driver, map);
        }catch (Exception e){}


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
        log.info("点点新闻-签到");
        try {
            WebElement wl =  null;
            try {
                AdbTools.process(robot, AdbTools.upPage(androidId));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"可领取\")");
            } catch (Exception e) {
                AdbTools.process(robot, AdbTools.downPage(androidId));
                AdbTools.process(robot, AdbTools.downPage(androidId));
                wl = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"可领取\")");
            }
            wl.click();

            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
            AdbTools.process(robot, operateBack);
        }catch (Exception e){
            log.info("点点新闻-签到异常");
        }


    }


    */
/**
     * todo 2.看视频
     * @param robot
     *//*

    public static void handle2(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("点点新闻-看视频");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"视频\")");
            wl1.click();
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                robot.delay(RandomTools.init(6000));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                for (int i=0;i<6;i++) {
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("点点新闻-看视频异常");
        }
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
        log.info("点点新闻-看新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";

            WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"资讯\")");
            wl1.click();
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                robot.delay(RandomTools.init(6000));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                for (int i=0;i<6;i++) {
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){
            log.info("点点新闻-看新闻异常");
        }
    }



    */
/**
     * todo 4.1看新闻
     * @param robot
     *//*

    public static void handle41(Robot robot,String androidId,  AndroidDriver driver, Map<String,Integer> map){
        log.info("点点新闻-看点点新闻");
        try {
            robot.delay(1000);
            String operateBack = "adb -s " + androidId + " shell input keyevent BACK";
           try {
               WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"百度新闻\").fromParent(text(\"去完成\"))");
               wl1.click();
               for (int a = 0; a < 6; a++) {
                   AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                   robot.delay(RandomTools.init(6000));
                   AdbTools.process(robot, AdbTools.upPage(androidId));
                   for (int i = 0; i < 6; i++) {
                       robot.delay(RandomTools.init(9000));
                       AdbTools.process(robot, AdbTools.down(androidId));
                   }
                   AdbTools.process(robot, operateBack);
               }
           }catch (Exception e){}

           try {
               WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"趣闻社\").fromParent(text(\"去完成\"))");
               wl2.click();
               for (int a = 0; a < 6; a++) {
                   AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                   robot.delay(RandomTools.init(6000));
                   AdbTools.process(robot, AdbTools.upPage(androidId));
                   for (int i = 0; i < 6; i++) {
                       robot.delay(RandomTools.init(9000));
                       AdbTools.process(robot, AdbTools.down(androidId));
                   }
                   AdbTools.process(robot, operateBack);
               }
           }catch (Exception e){}

          try {
              WebElement wl3 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"每日看点\").fromParent(text(\"去完成\"))");
              wl3.click();
              for (int a = 0; a < 6; a++) {
                  AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                  robot.delay(RandomTools.init(6000));
                  AdbTools.process(robot, AdbTools.upPage(androidId));
                  for (int i = 0; i < 6; i++) {
                      robot.delay(RandomTools.init(9000));
                      AdbTools.process(robot, AdbTools.down(androidId));
                  }
                  AdbTools.process(robot, operateBack);
              }
          }catch (Exception e){}

          try {
              WebElement wl4 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"精选头条\").fromParent(text(\"去完成\"))");
              wl4.click();
              for (int a = 0; a < 6; a++) {
                  AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                  robot.delay(RandomTools.init(6000));
                  AdbTools.process(robot, AdbTools.upPage(androidId));
                  for (int i = 0; i < 6; i++) {
                      robot.delay(RandomTools.init(9000));
                      AdbTools.process(robot, AdbTools.down(androidId));
                  }
                  AdbTools.process(robot, operateBack);
              }
          }catch (Exception e){}


        try {
            WebElement wl6 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"1.9包邮\").fromParent(text(\"去完成\"))");
            wl6.click();
            for (int a = 0; a < 6; a++) {
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                robot.delay(RandomTools.init(6000));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                for (int i = 0; i < 6; i++) {
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){}

        try {
            WebElement wl7 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"福利互动\").fromParent(text(\"去完成\"))");
            wl7.click();
            for (int a = 0; a < 6; a++) {
                AdbTools.process(robot, AdbTools.tap(androidId, 540, 600));
                robot.delay(RandomTools.init(6000));
                AdbTools.process(robot, AdbTools.upPage(androidId));
                for (int i = 0; i < 6; i++) {
                    robot.delay(RandomTools.init(9000));
                    AdbTools.process(robot, AdbTools.down(androidId));
                }
                AdbTools.process(robot, operateBack);
            }
        }catch (Exception e){}


        }catch (Exception e){
            log.info("点点新闻-看点点新闻异常");
        }
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
