package com.xxl.brush.app.invite;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.RandomTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * todo App惠头条
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */

public class App惠头条 {
    private static Logger log = LoggerFactory.getLogger(App惠头条.class);


/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */

    public static void circulate(String androidId){
        try{
            log.info("********************************惠头条操作********************************************");

            log.info("1.初始化手机");
             AdbTools.initMobile(androidId);

            log.info("2.启动app");
            AdbTools.startup(androidId, AppConstants.startup惠头条);

            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId,110,2140);
            }else{
                AdbTools.tap(androidId,110,1950);
            }

            handle4(androidId);


        }catch (Exception e){}

    }




/**
     * todo 4.看新闻
     * @param
     */

    public static void handle4(String androidId){
        log.info("惠头条-看新闻");
        try {
            for (int a = 0; a < 12; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.down(androidId);
                for (int i = 0; i < 12; i++) {
                    AdbTools.tap(androidId, 540, 600);
                    Thread.sleep(RandomTools.init(9000));
                    AdbTools.down(androidId);
                }
                AdbTools.back(androidId);
            }
            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("惠头条-看新闻异常");
        }
    }




}


