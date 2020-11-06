package com.xxl.brush.tools;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;

public class AppiumWindow {
    private static final Logger log = LoggerFactory.getLogger(AppiumWindow.class);

    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;
    private DesiredCapabilities cap;


    public void init(int port,AppiumWindow appiumWindow){
        if(!appiumWindow.checkIfServerIsRunnning(port)) {
            appiumWindow.startServer(port);
          /*  appiumWindow.stopServer();*/
        } else {
            log.info("Appium Server already running on Port - " + port);
        }
    }

    public void startServer(int port) {
//Set Capabilities
        cap = new DesiredCapabilities();
        cap.setCapability("noReset", "false");

//Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(port);
        builder.withCapabilities(cap);

//Start the server with the builder
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    public void stopServer() {
        service.stop();
    }

    public boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();
        } catch (IOException e) {
//If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }



}
