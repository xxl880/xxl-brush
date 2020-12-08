package com.xxl.brush.service.impl;

import com.xxl.brush.app.*;
import com.xxl.brush.app.lifeA.App得意宝;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.service.AppService;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.OcrTools;
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
	public void circulate(String androidId){
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

	/**
	 * todo 清除手机缓存
	 * @param androidId
	 */
	@Async
	@SneakyThrows
	@Override
	public void cache(String androidId) {
		String operate = "adb -s " + androidId + " shell input keyevent 3";
		AdbTools.process(operate);
		if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
			return;
		}
		AdbTools.tap(androidId,160,1350);
		Integer y = OcrTools.getWordsInt(androidId,"存储空间");
		AdbTools.tap(androidId,540,y);
		Integer y1 = OcrTools.getWordsInt(androidId,"缓存数据");
		AdbTools.tap(androidId,540,y1);
		AdbTools.tap(androidId,880, 1920);

	}


}
