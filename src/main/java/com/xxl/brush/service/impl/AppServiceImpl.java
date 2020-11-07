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
	 * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
	 */
	@Async
	@SneakyThrows
	@Override
	public void circulate(String robotCode){
		AppiumWindow appiumWindow001 = null;
		if(robotCode.equals("phone001")){
			appiumWindow001 = new AppiumWindow();
			appiumWindow001.init(6000,9220, appiumWindow001);
		}else if(robotCode.equals("phone002")){
			AppiumWindow appiumWindow002 = new AppiumWindow();
			appiumWindow002.init(6001,9221,appiumWindow002);
		}else if(robotCode.equals("phone003")){
			AppiumWindow appiumWindow003 = new AppiumWindow();
			appiumWindow003.init(4723,9222,appiumWindow003);
		}else if(robotCode.equals("phone0031")){
			AppiumWindow appiumWindow0031 = new AppiumWindow();
			appiumWindow0031.init(6003,9223,appiumWindow0031);
		}else if(robotCode.equals("phone0032")){
			AppiumWindow appiumWindow0032 = new AppiumWindow();
			appiumWindow0032.init(6004,9224,appiumWindow0032);
		}
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

		/*//-视频
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
*/


	}



}
