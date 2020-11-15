package com.xxl.brush.tools;

import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.service.impl.AppServiceImpl;
import io.appium.java_client.android.AndroidDriver;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * todo appium 公共操作类
 */
public class AppiumTools {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(AppiumTools.class);

/*
    public static void start(String androidId){
        try {
            String appiumCode = null;
            if (androidId.equals("phone001")) {
                appiumCode = "appium -p 6000 -bp 8000 -U "+PhoneConstants.phone001;
            } else if (androidId.equals("phone002")) {
                appiumCode = "appium -p 6001 -bp 8001 -U "+PhoneConstants.phone002;
            } else if (androidId.equals("phone003")) {
                appiumCode = "appium -p 6002 -bp 8002 -U "+PhoneConstants.phone003;
            } else if (androidId.equals("phone0031")) {
                appiumCode = "appium -p 6003 -bp 8003 -U "+PhoneConstants.phone0031;
            } else if (androidId.equals("phone0032")) {
                appiumCode = "appium -p 6004 -bp 8004 -U "+PhoneConstants.phone0032;
            } else if (androidId.equals("phone0033")) {
                appiumCode = "appium -p 6005 -bp 8005 -U "+PhoneConstants.phone0033;
            } else if (androidId.equals("phone0034")) {
                appiumCode = "appium -p 6006 -bp 8006 -U "+PhoneConstants.phone0034;
            } else if (androidId.equals("phone0035")) {
                appiumCode = "appium -p 6007 -bp 8007 -U "+PhoneConstants.phone0035;
            }
            Runtime.getRuntime().exec(appiumCode);
        }catch (Exception e){}
    }*/



    public static AndroidDriver init(String androidId,int port, int systemPort){
        AndroidDriver driver = null;
        String platformVersion = "9";
        if(androidId.equals(PhoneConstants.phone002)){
            platformVersion = "10";
        }
        driver = process(String.valueOf(platformVersion), androidId,String.valueOf(port),String.valueOf(systemPort));
      return driver;
    }


    @SneakyThrows
    public static AndroidDriver process(String platformVersion,String deviceName, String port, String systemPort){
       //1.添加配置，创建DesiredCapabilities对象
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //添加操作系统配置
        desiredCapabilities.setCapability("platformName", "Android");
        //添加操作系统版本设置
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        //指定测试设备的名称
        desiredCapabilities.setCapability("deviceName", deviceName);
        //指定测试设备的udid
        desiredCapabilities.setCapability("udid", deviceName);
        //指定通讯端口
        desiredCapabilities.setCapability("systemPort", systemPort);
        //自动化测试引擎
        desiredCapabilities.setCapability("automationName", "UiAutomator2");

        //2.创建驱动...URL是appium的固定地址；指定appium通讯的地址，将相对应的配置传入到驱动里边
        String url = "http://127.0.0.1:"+port+"/wd/hub";
        log.info(url);
        AndroidDriver driver =  new AndroidDriver(new URL(url),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        return  driver;
    }



}
