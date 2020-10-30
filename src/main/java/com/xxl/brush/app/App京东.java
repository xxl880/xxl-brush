/*
package com.xxl.brush.app;

import com.example.dream.tool.AdbTools;
import com.example.dream.tool.HaveOrNo;
import com.example.dream.tool.LoaderDriver;
import com.example.dream.tool.SwipeToUp;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.eclipse.jetty.util.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class App京东{
    final static Logger logger = LoggerFactory.getLogger(JDServiceImpl.class);

    static LoaderDriver loader;


    static SwipeToUp swipeToUp;

    @Autowired
    private void setSwipeToUp(SwipeToUp swipe) {
        JDServiceImpl.swipeToUp = swipe;
    }

    static HaveOrNo haveOrNo;

    @Autowired
    private void setHaveOrNo(HaveOrNo haveNo) {
        JDServiceImpl.haveOrNo = haveNo;
    }

    public void JDGold(String androidId,AndroidDriver driver) {
        try {
            //todo 点击京东APP
            driver.activateApp("com.jd.jdlite");

            Thread.sleep(3000);

            //todo 点击去赚钱
            MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"赚钱\"]");
            el4.click();
            Thread.sleep(500);
                //todo 逛商品赚金币
                for (int i = 0; i < 100; i++) {
                   if(!commodityCoins(driver)){
                        break;
                   }
                }
                for (int i = 0; i < 100; i++) {
                    if (!activityCoins(driver)) {
                        break;
                    }
                }

            //todo 看视频赚金币
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Boolean commodityCoins(AndroidDriver driver) {
            //todo 点击逛商品赚金币
            logger.info("点击逛商品赚金币");
            try {
                WebElement wl1 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"海量好货，多看多赚\").fromParent(text(\"去赚钱\"))");
                wl1.click();

                Thread.sleep(2000);
                swipeToUp.SwipeDown(driver);
                Thread.sleep(4000);
                swipeToUp.SwipeDown(driver);
                Thread.sleep(2000);
                swipeToUp.SwipeDown(driver);
                Thread.sleep(500);
                //todo 点击红包
                MobileElement el1 = (MobileElement) driver.findElementById("com.jd.jdlite:id/ll_content");
                el1.click();
                Thread.sleep(500);
            }catch (Exception e){
                return false;
            }
            return true;
    }

    public Boolean activityCoins(AndroidDriver driver) {
        try {
            Thread.sleep(1000);
            //todo 点击逛商品赚金币
            logger.info("逛活动赚金币");
            WebElement wl2 = driver.findElementByAndroidUIAutomator("className(\"android.widget.TextView\").text(\"点击浏览，赚大额金币\").fromParent(text(\"去赚钱\"))");
            wl2.click();
            Thread.sleep(2000);
            swipeToUp.SwipeDown(driver);
            Thread.sleep(4000);
            swipeToUp.SwipeDown(driver);
            Thread.sleep(2000);
            swipeToUp.SwipeDown(driver);
            //todo 点击红包
            MobileElement el4 = (MobileElement) driver.findElementById("com.jd.jdlite:id/task_float_base_fl");
            el4.click();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            return false;
        }
        return true;
    }
}
*/
