package com.xxl.brush.service.impl;

import com.xxl.brush.app.*;
import com.xxl.brush.app.medias.*;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AppiumTools;
import lombok.SneakyThrows;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.awt.*;

/**
 *
 * todo app-统一接口
 */
@Service
public class AppServiceImpl implements AppService {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(AppServiceImpl.class);


	/**
	 * todo 3.1-循环收取金币大于200金币
	 */
	@Async
	@SneakyThrows
	@Override
	public void circulate(String robotCode){
		//AppiumTools.start(robotCode);
		Robot robot = new Robot();

		App抖音极速.handle(robot,robotCode);
		App火山极速.handle(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}



}
