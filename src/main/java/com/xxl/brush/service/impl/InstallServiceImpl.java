package com.xxl.brush.service.impl;

import com.xxl.brush.service.InstallService;
import com.xxl.brush.tools.AdbTools;
import lombok.SneakyThrows;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.File;

/**
 *
 * todo 安装app接口
 */
@Service
public class InstallServiceImpl implements InstallService {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(InstallServiceImpl.class);

	/**
	 * todo 安装app
	 */
	@Async
	@SneakyThrows
	@Override
	public  void process(String androidId){
	   Robot robot  = new Robot();
       File file = new File("D:/install");
       if(file.exists()){
       	File[] files = file.listFiles();
       	if(null!=files){
       		for(File file1:files){
				String installStr = "adb -s " + androidId + " install " +file1.getAbsolutePath();
				AdbTools.process(installStr);
				robot.delay(2000);
				AdbTools.tap(androidId,300,1890);
                robot.delay(20000);
			}
		}
	   }else {
       	log.info("install文件夹不存在D盘,请新建install文件夹并放置app相关apk安装包");
	   }


	}


	public static void  main(String args[]){
		InstallServiceImpl installService = new InstallServiceImpl();
		installService.process("");
	}







}
