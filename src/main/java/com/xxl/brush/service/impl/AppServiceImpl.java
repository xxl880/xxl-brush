package com.xxl.brush.service.impl;

import com.xxl.brush.app.*;
import com.xxl.brush.app.medias.*;
import com.xxl.brush.app.news.*;
import com.xxl.brush.app.sports.*;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AppiumTools;
import com.xxl.brush.tools.AppiumWindow;
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

		if(robotCode.equals("phone001")){
			AppiumWindow appiumWindow = new AppiumWindow();
			appiumWindow.init(6000,appiumWindow);
		}else if(robotCode.equals("phone002")){
			AppiumWindow appiumWindow = new AppiumWindow();
			appiumWindow.init(6001,appiumWindow);
		}else if(robotCode.equals("phone003")){
			AppiumWindow appiumWindow = new AppiumWindow();
			appiumWindow.init(4723,appiumWindow);
		}

		Robot robot = new Robot();
		//-综合
    	App抖音极速.start(robot,robotCode);
       	App火山极速.start(robot,robotCode);
 	    App快手极速.start(robot,robotCode);
		App今日头条.start(robot,robotCode);
		App趣头条.start(robot,robotCode);
		AppQQ阅读.start(robot,robotCode);
		App火山.start(robot,robotCode);
		AppNOW直播.start(robot,robotCode);
		App搜狗.start(robot,robotCode);
		App拼多多.start(robot,robotCode);
		App微博.start(robot,robotCode);

		//综合
		App书旗.start(robot,robotCode);
		App番茄.start(robot,robotCode);
		App奇热.start(robot,robotCode);
		App抖音火山.start(robot,robotCode);
		App晴象浏览器.start(robot,robotCode);
		App米读.start(robot,robotCode);
		App必看.start(robot,robotCode);
		App牛角.handle(robot,robotCode);
		App2345浏览器.start(robot,robotCode);

		//-视频
		App刷宝.start(robot,robotCode);
		App小吃货.start(robot,robotCode);
		App火火.start(robot,robotCode);
		App红包.start(robot,robotCode);
		App彩蛋.start(robot,robotCode);
		App热火.start(robot,robotCode);
		App长豆.start(robot,robotCode);

		//-新闻
		App微鲤看看.start(robot,robotCode);
		App快看点.start(robot,robotCode);
		App悦头条.start(robot,robotCode);
		App惠头条.start(robot,robotCode);
		App有料看看.start(robot,robotCode);
		App点点.start(robot,robotCode);
		App聚看点.start(robot,robotCode);
		App蚂蚁看点.start(robot,robotCode);
		App赚钱阅文赚.start(robot,robotCode);
		App趣故事.start(robot,robotCode);

		//-走路
		App一起来走路.start(robot,robotCode);
		App乐步.start(robot,robotCode);
		App多多步.start(robot,robotCode);
		App多宝.start(robot,robotCode);
		App步多多.start(robot,robotCode);
		App步数赚零钱.start(robot,robotCode);
		App步步多.start(robot,robotCode);
		App步步宝.start(robot,robotCode);
		App计步赚钱.start(robot,robotCode);
		App走走赚.start(robot,robotCode);
		App走路赚钱.start(robot,robotCode);


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
		App抖音极速.section1(robot,robotCode);
		App火山极速.section1(robot,robotCode);
		App快手极速.section1(robot,robotCode);
		App今日头条.section1(robot,robotCode);
		App趣头条.section1(robot,robotCode);
		AppQQ阅读.section1(robot,robotCode);
		App火山.section1(robot,robotCode);
		AppNOW直播.section1(robot,robotCode);
		App搜狗.section1(robot,robotCode);
		App拼多多.section1(robot,robotCode);
		App微博.section1(robot,robotCode);

		//综合
		App书旗.section1(robot,robotCode);
		App番茄.section1(robot,robotCode);
		App奇热.section1(robot,robotCode);
		App抖音火山.section1(robot,robotCode);
		App晴象浏览器.section1(robot,robotCode);
		App米读.section1(robot,robotCode);
		App必看.section1(robot,robotCode);
		App牛角.section1(robot,robotCode);
		App2345浏览器.section1(robot,robotCode);

		//-视频
		App刷宝.section1(robot,robotCode);
		App小吃货.section1(robot,robotCode);
		App火火.section1(robot,robotCode);
		App红包.section1(robot,robotCode);
		App彩蛋.section1(robot,robotCode);
		App热火.section1(robot,robotCode);
		App长豆.section1(robot,robotCode);

		//-新闻
		App微鲤看看.section1(robot,robotCode);
		App快看点.section1(robot,robotCode);
		App悦头条.section1(robot,robotCode);
		App惠头条.section1(robot,robotCode);
		App有料看看.section1(robot,robotCode);
		App点点.section1(robot,robotCode);
		App聚看点.section1(robot,robotCode);
		App蚂蚁看点.section1(robot,robotCode);
		App赚钱阅文赚.section1(robot,robotCode);
		App趣故事.section1(robot,robotCode);

		//-走路
		App一起来走路.section1(robot,robotCode);
		App乐步.section1(robot,robotCode);
		App多多步.section1(robot,robotCode);
		App多宝.section1(robot,robotCode);
		App步多多.section1(robot,robotCode);
		App步数赚零钱.section1(robot,robotCode);
		App步步多.section1(robot,robotCode);
		App步步宝.section1(robot,robotCode);
		App计步赚钱.section1(robot,robotCode);
		App走走赚.section1(robot,robotCode);
		App走路赚钱.section1(robot,robotCode);



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
		//App抖音极速.section2(robot,robotCode);
		App火山极速.section2(robot,robotCode);
		App快手极速.section2(robot,robotCode);
		App今日头条.section2(robot,robotCode);
		App趣头条.section2(robot,robotCode);
		AppQQ阅读.section2(robot,robotCode);
		App火山.section2(robot,robotCode);
		AppNOW直播.section2(robot,robotCode);
		App搜狗.section2(robot,robotCode);
		App拼多多.section2(robot,robotCode);
		App微博.section2(robot,robotCode);

		//综合
		App书旗.section2(robot,robotCode);
		App番茄.section2(robot,robotCode);
		App奇热.section2(robot,robotCode);
		App抖音火山.section2(robot,robotCode);
		App晴象浏览器.section2(robot,robotCode);
		App米读.section2(robot,robotCode);
		App必看.section2(robot,robotCode);
		App牛角.section2(robot,robotCode);
		App2345浏览器.section2(robot,robotCode);

		//-视频
		App刷宝.section2(robot,robotCode);
		App小吃货.section2(robot,robotCode);
		App火火.section2(robot,robotCode);
		App红包.section2(robot,robotCode);
		App彩蛋.section2(robot,robotCode);
		App热火.section2(robot,robotCode);
		App长豆.section2(robot,robotCode);

		//-新闻
		App微鲤看看.section2(robot,robotCode);
		App快看点.section2(robot,robotCode);
		App悦头条.section2(robot,robotCode);
		App惠头条.section2(robot,robotCode);
		App有料看看.section2(robot,robotCode);
		App点点.section2(robot,robotCode);
		App聚看点.section2(robot,robotCode);
		App蚂蚁看点.section2(robot,robotCode);
		App赚钱阅文赚.section2(robot,robotCode);
		App趣故事.section2(robot,robotCode);

		//-走路
		App一起来走路.section2(robot,robotCode);
		App乐步.section2(robot,robotCode);
		App多多步.section2(robot,robotCode);
		App多宝.section2(robot,robotCode);
		App步多多.section2(robot,robotCode);
		App步数赚零钱.section2(robot,robotCode);
		App步步多.section2(robot,robotCode);
		App步步宝.section2(robot,robotCode);
		App计步赚钱.section2(robot,robotCode);
		App走走赚.section2(robot,robotCode);
		App走路赚钱.section2(robot,robotCode);



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
		App抖音极速.section3(robot,robotCode);
		App火山极速.section3(robot,robotCode);
		App快手极速.section3(robot,robotCode);
		App今日头条.section3(robot,robotCode);
		App趣头条.section3(robot,robotCode);
		AppQQ阅读.section3(robot,robotCode);
		App火山.section3(robot,robotCode);
		AppNOW直播.section3(robot,robotCode);
		App搜狗.section3(robot,robotCode);
		App拼多多.section3(robot,robotCode);
		App微博.section3(robot,robotCode);

		//综合
		App书旗.section3(robot,robotCode);
		App番茄.section3(robot,robotCode);
		App奇热.section3(robot,robotCode);
		App抖音火山.section3(robot,robotCode);
		App晴象浏览器.section3(robot,robotCode);
		App米读.section3(robot,robotCode);
		App必看.section3(robot,robotCode);
		App牛角.section3(robot,robotCode);
		App2345浏览器.section3(robot,robotCode);

		//-视频
		App刷宝.section3(robot,robotCode);
		App小吃货.section3(robot,robotCode);
		App火火.section3(robot,robotCode);
		App红包.section3(robot,robotCode);
		App彩蛋.section3(robot,robotCode);
		App热火.section3(robot,robotCode);
		App长豆.section3(robot,robotCode);

		//-新闻
		App微鲤看看.section3(robot,robotCode);
		App快看点.section3(robot,robotCode);
		App悦头条.section3(robot,robotCode);
		App惠头条.section3(robot,robotCode);
		App有料看看.section3(robot,robotCode);
		App点点.section3(robot,robotCode);
		App聚看点.section3(robot,robotCode);
		App蚂蚁看点.section3(robot,robotCode);
		App赚钱阅文赚.section3(robot,robotCode);
		App趣故事.section3(robot,robotCode);

		//-走路
		App一起来走路.section3(robot,robotCode);
		App乐步.section3(robot,robotCode);
		App多多步.section3(robot,robotCode);
		App多宝.section3(robot,robotCode);
		App步多多.section3(robot,robotCode);
		App步数赚零钱.section3(robot,robotCode);
		App步步多.section3(robot,robotCode);
		App步步宝.section3(robot,robotCode);
		App计步赚钱.section3(robot,robotCode);
		App走走赚.section3(robot,robotCode);
		App走路赚钱.section3(robot,robotCode);


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
		App抖音极速.section4(robot,robotCode);
		App火山极速.section4(robot,robotCode);
		App快手极速.section4(robot,robotCode);
		App今日头条.section4(robot,robotCode);
		App趣头条.section4(robot,robotCode);
		AppQQ阅读.section4(robot,robotCode);
		App火山.section4(robot,robotCode);
		AppNOW直播.section4(robot,robotCode);
		App搜狗.section4(robot,robotCode);
		App拼多多.section4(robot,robotCode);
		App微博.section4(robot,robotCode);

		//综合
		App书旗.section4(robot,robotCode);
		App番茄.section4(robot,robotCode);
		App奇热.section4(robot,robotCode);
		App抖音火山.section4(robot,robotCode);
		App晴象浏览器.section4(robot,robotCode);
		App米读.section4(robot,robotCode);
		App必看.section4(robot,robotCode);
		App牛角.section4(robot,robotCode);
		App2345浏览器.section4(robot,robotCode);

		//-视频
		App刷宝.section4(robot,robotCode);
		App小吃货.section4(robot,robotCode);
		App火火.section4(robot,robotCode);
		App红包.section4(robot,robotCode);
		App彩蛋.section4(robot,robotCode);
		App热火.section4(robot,robotCode);
		App长豆.section4(robot,robotCode);

		//-新闻
		App微鲤看看.section4(robot,robotCode);
		App快看点.section4(robot,robotCode);
		App悦头条.section4(robot,robotCode);
		App惠头条.section4(robot,robotCode);
		App有料看看.section4(robot,robotCode);
		App点点.section4(robot,robotCode);
		App聚看点.section4(robot,robotCode);
		App蚂蚁看点.section4(robot,robotCode);
		App赚钱阅文赚.section4(robot,robotCode);
		App趣故事.section4(robot,robotCode);

		//-走路
		App一起来走路.section4(robot,robotCode);
		App乐步.section4(robot,robotCode);
		App多多步.section4(robot,robotCode);
		App多宝.section4(robot,robotCode);
		App步多多.section4(robot,robotCode);
		App步数赚零钱.section4(robot,robotCode);
		App步步多.section4(robot,robotCode);
		App步步宝.section4(robot,robotCode);
		App计步赚钱.section4(robot,robotCode);
		App走走赚.section4(robot,robotCode);
		App走路赚钱.section4(robot,robotCode);



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
		App快手极速.circulate(robot,robotCode);
		App今日头条.circulate(robot,robotCode);
		App趣头条.circulate(robot,robotCode);
		AppQQ阅读.circulate(robot,robotCode);
		App火山.circulate(robot,robotCode);
		AppNOW直播.circulate(robot,robotCode);
		App搜狗.circulate(robot,robotCode);
		App拼多多.circulate(robot,robotCode);
		App微博.circulate(robot,robotCode);

		//综合
		App书旗.circulate(robot,robotCode);
		App番茄.circulate(robot,robotCode);
		App奇热.circulate(robot,robotCode);
		App抖音火山.circulate(robot,robotCode);
		App晴象浏览器.circulate(robot,robotCode);
		App米读.circulate(robot,robotCode);
		App必看.circulate(robot,robotCode);
		App牛角.circulate(robot,robotCode);
		App2345浏览器.circulate(robot,robotCode);

		//-视频
		App刷宝.circulate(robot,robotCode);
		App小吃货.circulate(robot,robotCode);
		App火火.circulate(robot,robotCode);
		App红包.circulate(robot,robotCode);
		App彩蛋.circulate(robot,robotCode);
		App热火.circulate(robot,robotCode);
		App长豆.circulate(robot,robotCode);

		//-新闻
		App微鲤看看.circulate(robot,robotCode);
		App快看点.circulate(robot,robotCode);
		App悦头条.circulate(robot,robotCode);
		App惠头条.circulate(robot,robotCode);
		App有料看看.circulate(robot,robotCode);
		App点点.circulate(robot,robotCode);
		App聚看点.circulate(robot,robotCode);
		App蚂蚁看点.circulate(robot,robotCode);
		App赚钱阅文赚.circulate(robot,robotCode);
		App趣故事.circulate(robot,robotCode);

		//-走路
		App一起来走路.circulate(robot,robotCode);
		App乐步.circulate(robot,robotCode);
		App多多步.circulate(robot,robotCode);
		App多宝.circulate(robot,robotCode);
		App步多多.circulate(robot,robotCode);
		App步数赚零钱.circulate(robot,robotCode);
		App步步多.circulate(robot,robotCode);
		App步步宝.circulate(robot,robotCode);
		App计步赚钱.circulate(robot,robotCode);
		App走走赚.circulate(robot,robotCode);
		App走路赚钱.circulate(robot,robotCode);



	}



}
