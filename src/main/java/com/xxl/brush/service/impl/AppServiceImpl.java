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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * todo app-统一接口
 */
@Service
public class AppServiceImpl implements AppService {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(AppServiceImpl.class);
	//增加全局map事件处理，用于保存数据
	Map<String,String> map = new HashMap<String,String>();

	/**
	 * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
	 */
	@Async
	@SneakyThrows
	@Override
	public void circulate(String androidId,int portSeq){
		Robot robot = new Robot();

		AppiumWindow appiumWindow = new AppiumWindow();
		int port = 4724+ portSeq;
		int systemPort = 9000+ portSeq;

		appiumWindow.init(port,systemPort, appiumWindow);

	 	//-综合
	 	App抖音极速.circulate(robot,androidId, port, systemPort);
		App火山极速.circulate(robot,androidId, port, systemPort);
		App快手极速.circulate(robot,androidId, port, systemPort);
	    App今日头条.circulate(robot,androidId, port, systemPort);
		App趣头条.circulate(robot,androidId, port, systemPort);
		AppQQ阅读.circulate(robot,androidId, port, systemPort);
		App火山.circulate(robot,androidId, port, systemPort);
		AppNOW直播.circulate(robot,androidId, port, systemPort);
		App搜狗.circulate(robot,androidId, port, systemPort);
		App拼多多.circulate(robot,androidId, port, systemPort);
		App微博.circulate(robot,androidId, port, systemPort);

		//综合
		App书旗.circulate(robot,androidId, port, systemPort);
		App番茄.circulate(robot,androidId, port, systemPort);
		App奇热.circulate(robot,androidId, port, systemPort);
		App抖音火山.circulate(robot,androidId, port, systemPort);
		App晴象浏览器.circulate(robot,androidId, port, systemPort);
		App米读.circulate(robot,androidId, port, systemPort);
		App必看.circulate(robot,androidId, port, systemPort);
		App牛角.circulate(robot,androidId, port, systemPort);
/*		App2345浏览器.circulate(robot,androidId, port, systemPort);*/

		/*//-视频
		App刷宝.circulate(robot,androidId, port, systemPort);
		App小吃货.circulate(robot,androidId, port, systemPort);
		App火火.circulate(robot,androidId, port, systemPort);
		App红包.circulate(robot,androidId, port, systemPort);
		App彩蛋.circulate(robot,androidId, port, systemPort);
		App热火.circulate(robot,androidId, port, systemPort);
		App长豆.circulate(robot,androidId, port, systemPort);

		//-新闻
		App微鲤看看.circulate(robot,androidId, port, systemPort);
		App快看点.circulate(robot,androidId, port, systemPort);
		App悦头条.circulate(robot,androidId, port, systemPort);
		App惠头条.circulate(robot,androidId, port, systemPort);
		App有料看看.circulate(robot,androidId, port, systemPort);
		App点点.circulate(robot,androidId, port, systemPort);
		App聚看点.circulate(robot,androidId, port, systemPort);
		App蚂蚁看点.circulate(robot,androidId, port, systemPort);
		App赚钱阅文赚.circulate(robot,androidId, port, systemPort);
		App趣故事.circulate(robot,androidId, port, systemPort);

		//-走路
		App一起来走路.circulate(robot,androidId, port, systemPort);
		App乐步.circulate(robot,androidId, port, systemPort);
		App多多步.circulate(robot,androidId, port, systemPort);
		App多宝.circulate(robot,androidId, port, systemPort);
		App步多多.circulate(robot,androidId, port, systemPort);
		App步数赚零钱.circulate(robot,androidId, port, systemPort);
		App步步多.circulate(robot,androidId, port, systemPort);
		App步步宝.circulate(robot,androidId, port, systemPort);
		App计步赚钱.circulate(robot,androidId, port, systemPort);
		App走走赚.circulate(robot,androidId, port, systemPort);
		App走路赚钱.circulate(robot,androidId, port, systemPort);
*/
		appiumWindow.stopServer();

	}



}
