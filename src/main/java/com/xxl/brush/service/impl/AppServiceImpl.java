package com.xxl.brush.service.impl;

import com.xxl.brush.app.*;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AppiumWindow;
import lombok.SneakyThrows;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * todo app-统一接口
 */
@Service
public class AppServiceImpl implements AppService {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(AppServiceImpl.class);


	/**
	 * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
	 */
	@Async
	@SneakyThrows
	@Override
	public void circulate(String androidId,int portSeq,Map<String,Integer> map){
		Robot robot = new Robot();
		AppiumWindow appiumWindow = new AppiumWindow();

		int port = 4723+ portSeq;
		int systemPort = 9000+ portSeq;

		appiumWindow.init(port,systemPort, appiumWindow);

		LocalDateTime startTime = LocalDateTime.now();
		Duration duration = java.time.Duration.between( startTime,  LocalDateTime.now());

		//综合A
     	App抖音极速.circulate(androidId);
		App火山极速.circulate(androidId);
	/*	App快手极速.circulate(androidId);
	    App今日头条.circulate(androidId);
		App趣头条.circulate(androidId, port, systemPort, map);
		AppQQ阅读.circulate(androidId);
		App火山小说.circulate(androidId);
		AppNOW直播.circulate(androidId);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}


		App搜狗.circulate(androidId, port, systemPort, map);
		App拼多多.circulate(androidId, port, systemPort, map);
		App微博.circulate(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}


		//综合B
		App书旗.circulate(androidId, port, systemPort, map);
		App番茄.circulate(androidId, port, systemPort, map);
		App抖音火山.circulate(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}


		App米读.circulate(androidId, port, systemPort, map);
		App必看小说.circulate(androidId, port, systemPort, map);
		App牛角.circulate(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
		  log.info("*****************运行多长时间*************"+duration.toMinutes());
          return;
		}

*//*		App2345浏览器.circulate(androidId, port, systemPort, map);*//*

		App晴象浏览器.circulate(androidId, port, systemPort, map);
		App晴象浏览器.circulate1(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}

		App晴象浏览器.circulate2(androidId, port, systemPort, map);
		App晴象浏览器.circulate3(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}

		App晴象浏览器.circulate4(androidId, port, systemPort, map);
		App晴象浏览器.circulate5(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}
		App晴象浏览器.circulate6(androidId, port, systemPort, map);
		App晴象浏览器.circulate7(androidId, port, systemPort, map);
		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}
*/
		/*//-视频
		App刷宝.circulate(androidId, port, systemPort, map);
		App小吃货.circulate(androidId, port, systemPort, map);
		App火火.circulate(androidId, port, systemPort, map);
		App红包.circulate(androidId, port, systemPort, map);
		App彩蛋.circulate(androidId, port, systemPort, map);
		App热火.circulate(androidId, port, systemPort, map);
		App长豆.circulate(androidId, port, systemPort, map);

		//-新闻
		App微鲤看看.circulate(androidId, port, systemPort, map);
		App快看点.circulate(androidId, port, systemPort, map);
		App悦头条.circulate(androidId, port, systemPort, map);
		App惠头条.circulate(androidId, port, systemPort, map);
		App有料看看.circulate(androidId, port, systemPort, map);
		App点点.circulate(androidId, port, systemPort, map);
		App聚看点.circulate(androidId, port, systemPort, map);
		App蚂蚁看点.circulate(androidId, port, systemPort, map);
		App赚钱阅文赚.circulate(androidId, port, systemPort, map);
		App趣故事.circulate(androidId, port, systemPort, map);

		//-走路
		App一起来走路.circulate(androidId, port, systemPort, map);
		App乐步.circulate(androidId, port, systemPort, map);
		App多多步.circulate(androidId, port, systemPort, map);
		App多宝.circulate(androidId, port, systemPort, map);
		App步多多.circulate(androidId, port, systemPort, map);
		App步数赚零钱.circulate(androidId, port, systemPort, map);
		App步步多.circulate(androidId, port, systemPort, map);
		App步步宝.circulate(androidId, port, systemPort, map);
		App计步赚钱.circulate(androidId, port, systemPort, map);
		App走走赚.circulate(androidId, port, systemPort, map);
		App走路赚钱.circulate(androidId, port, systemPort, map);
*/
/*		appiumWindow.stopServer();*/

	}



}
