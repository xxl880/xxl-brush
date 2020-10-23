package com.xxl.brush.app;/*

package com.xxl.robot.app.appium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App快手极速 {

    private static Logger log = LoggerFactory.getLogger(App快手极速.class);

    static SwipeToUp swipeToUp;
    @Autowired
    private void setSwipeToUp(SwipeToUp swipe) {
        KSTool.swipeToUp = swipe;
    }

    //todo 快手直播吃金币
    public static void LiveGold(AndroidDriver driver) throws InterruptedException {
        //todo 因为是在屏幕下方需要滑动
        swipeToUp.ksSwipeUp(driver);
        //todo 看直播得金币
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button[7]");
        log.info(el5.getText());
        if(!el5.getText().contains("完成")){
            el5.click();
            for(int i=0;i<=10;i++){
                //todo 向上滑动
                Thread.sleep(18000);
                swipeToUp.ksUp(driver);
                log.info(String.valueOf("直播的金币："+i));
//                    MobileElement el6 = (MobileElement) driver.findElementById("com.kuaishou.nebula:id/award_count_down_group");

                if(HaveOrNo.byElementIsExist( By.id("com.kuaishou.nebula:id/award_count_down_group"))==false){
                    log.info("直播的金币已经看完返回任务界面");
                    //todo 向右滑动返回
                    swipeToUp.SwipeRight(driver);
                    break;
                }
            }
        }
    }


    //todo 快手视频吃金币
    public static void videoGold(AndroidDriver driver) throws InterruptedException {
        //获取视频任务是否完成
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]");
        //todo 因为是在屏幕下方需要滑动
        swipeToUp.ksSwipeUp(driver);
        log.info(el4.getText());
        if(!el4.getText().contains("去赚钱")){
            for(int i=0;i<10;i++){
                if(!el4.getText().contains("去赚钱")) {
                    //todo 查看福利视频得金币
//                    MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button[2]");
                    el4.click();
                    Thread.sleep(30000);
                    //todo 向右滑动返回
                    swipeToUp.SwipeRight(driver);
                    Thread.sleep(2000);
                }else {
                    log.info("视频任务已经看完");
                    break;
                }
            }
        }
    }
}

*/
