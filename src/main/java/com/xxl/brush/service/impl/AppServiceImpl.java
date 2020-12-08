package com.xxl.brush.service.impl;

import com.xxl.brush.app.*;
import com.xxl.brush.app.lifeA.App得意宝;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AdbTools;
import lombok.SneakyThrows;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
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
		LocalDateTime startTime = LocalDateTime.now();
		Duration duration = java.time.Duration.between( startTime,  LocalDateTime.now());

//*************A综合*****************
        App抖音极速.circulate(androidId);
		App火山极速.circulate(androidId);
		App快手极速.circulate(androidId);
	  	App今日头条.circulate(androidId);
	/*	App趣头条.circulate(androidId, port, systemPort);*/
		App抖音火山.circulate(androidId);

		//App京东
		App搜狗.circulate(androidId);
		App微博.circulate(androidId);
		App拼多多.circulate(androidId);
		App火山小说.circulate(androidId);
		AppNOW直播.circulate(androidId);


		duration = java.time.Duration.between( startTime,  LocalDateTime.now());
		if(duration.toMinutes()>60){
			log.info("*****************运行多长时间*************"+duration.toMinutes());
			return;
		}



//*************B综合*****************
		App米读.circulate(androidId);
		App书旗.circulate(androidId);



//*************重启人生A*****************
		App得意宝.circulate(androidId);

	}

	/**
	 * todo 获取所有手机截图
	 * @param androidId
	 */
	@Async
	@SneakyThrows
	@Override
	public void capture(String androidId) {
		AdbTools.screencap(androidId);
		AdbTools.pull(androidId);
	}


}
