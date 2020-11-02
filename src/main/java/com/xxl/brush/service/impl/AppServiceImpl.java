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
	 * todo 1.凌晨0:00-2:00(签到)
	 */
	@Async
	@SneakyThrows
	@Override
	public void start(String robotCode){
		Robot robot = new Robot();
		//-综合
	//	App抖音极速.start(robot,robotCode);
		App火山极速.start(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);

		//综合
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);

		//-视频
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}



	/**
	 * todo 2.早上6:00-8:00 （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
	 */
	@Async
	@SneakyThrows
	@Override
	public void section1(String robotCode){
		Robot robot = new Robot();
		//-综合
		App抖音极速.circulate(robot,robotCode);
		App火山极速.circulate(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);

		//综合
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);

		//-视频
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}



	/**
	 * todo 3.中午10：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
	 */
	@Async
	@SneakyThrows
	@Override
	public void section2(String robotCode){
		Robot robot = new Robot();
		//-综合
		App抖音极速.circulate(robot,robotCode);
		App火山极速.circulate(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);

        //综合
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);

		//-视频
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}



	/**
	 * todo 4.下午18：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
	 */
	@Async
	@SneakyThrows
	@Override
	public void section3(String robotCode){
		Robot robot = new Robot();
		//-综合
		App抖音极速.circulate(robot,robotCode);
		App火山极速.circulate(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);

		//综合
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);

		//-视频
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}



	/**
	 * todo 5.晚上22：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
	 */
	@Async
	@SneakyThrows
	@Override
	public void section4(String robotCode){
		Robot robot = new Robot();
		//-综合
		App抖音极速.circulate(robot,robotCode);
		App火山极速.circulate(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);

		//综合
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);

		//-视频
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}


	/**
	 * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
	 */
	@Async
	@SneakyThrows
	@Override
	public void circulate(String robotCode){
		Robot robot = new Robot();
		//-综合
		App抖音极速.circulate(robot,robotCode);
		App火山极速.circulate(robot,robotCode);
		App快手极速.handle(robot,robotCode);
		App今日头条.handle(robot,robotCode);
		App趣头条.handle(robot,robotCode);
		AppQQ阅读.handle(robot,robotCode);
		App火山.handle(robot,robotCode);
		AppNOW直播.handle(robot,robotCode);
		App搜狗.handle(robot,robotCode);
		App拼多多.handle(robot,robotCode);
		App微博.handle(robot,robotCode);

		//综合
		App书旗.handle(robot,robotCode);
		App番茄.handle(robot,robotCode);
		App奇热.handle(robot,robotCode);
		App抖音火山.handle(robot,robotCode);
		App晴象浏览器.handle(robot,robotCode);
		App米读.handle(robot,robotCode);
		App必看.handle(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.handle(robot,robotCode);

		//-视频
		App刷宝.handle(robot,robotCode);
		App小吃货.handle(robot,robotCode);
		App火火.handle(robot,robotCode);
		App红包.handle(robot,robotCode);
		App彩蛋.handle(robot,robotCode);
		App热火.handle(robot,robotCode);
		App长豆.handle(robot,robotCode);
	}



}
