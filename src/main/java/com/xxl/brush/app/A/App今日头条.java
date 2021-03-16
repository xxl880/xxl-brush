
package com.xxl.brush.app.A;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * todo App今日头条
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
 */
public class App今日头条 {
    private static Logger log = LoggerFactory.getLogger(App今日头条.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos
     */
    public static void circulate(String androidId){
            try {
                log.info("********************************今日头条操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile( androidId);

                log.info("2.启动app");
                AdbTools.startup( androidId, AppConstants.startup今日头条);
                int y = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                     y= 2140;
                }
                AdbTools.tap(androidId, 110, y);
                handle4( androidId);

                AdbTools.clear(androidId);
                clear(androidId);

                AdbTools.tap(androidId, 760, y);
                Thread.sleep(2000);
                handle1( androidId);
                handle9( androidId);
                handle20( androidId);
                handle21( androidId);
                handle16( androidId);
                handle12( androidId);
                handle11( androidId);
                handle5( androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/**
     * todo 退出
     * @param androidId

     */

    public static void quit( String androidId){

    }


/**
     * todo 清除
     * @param androidId

     */
    @SneakyThrows
    public static void clear(String androidId){
        Thread.sleep(2000);
        Integer y1 = OcrTools.getWordsInt(androidId,"以后再说");
        if(null!=y1){
            AdbTools.tap(androidId,540,y1-240);
            Thread.sleep(12000);
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId,540,1860);
                Thread.sleep(12000);
                AdbTools.tap(androidId,770,1950);
                Thread.sleep(6000);
            }else{
                AdbTools.tap(androidId,540,1700);
                Thread.sleep(12000);
                AdbTools.tap(androidId,770,1850);
                Thread.sleep(6000);
            }

        }
    }



/**
     * todo 1.签到
     * @param androidId

     */

    public static void handle1(String androidId){
        if(AppTools.appSignTime())return;
            log.info("今日头条-签到");
        try {
            Integer y = OcrTools.getWordsInt(androidId,"签到成功");
            if(null!=y){
                AdbTools.tap(androidId,540,y+800);
                Thread.sleep(32000);
                AdbTools.back(androidId);
            }
        } catch (Exception e) {
            log.info("今日头条-签到异常");
        }
    }


/**
     * todo 2.看视频
     * @param androidId
     */

    public static void handle2(String androidId){

    }



/**
     * todo 3.看小视频
     * @param androidId
     */

    public static void handle3(String androidId){

    }



/**
     * todo 4.看新闻
     * @param androidId
     */

    public static void handle4(String androidId){
        log.info("今日头条-看新闻");
        try {
            int x = RandomTools.init(8);
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(2000));
                AdbTools.tap(androidId, 540, 730);
                for(int i=0;i<8;i++){
                    Thread.sleep(RandomTools.init(8000)+2000);
                    AdbTools.down(androidId);
                }
                AdbTools.back(androidId);
            }

        }catch (Exception e){
            log.info("今日头条-看新闻异常");
        }
    }



/**
     * todo 5.看小说
     * @param androidId
     */

    public static void handle5(String androidId){
        if(AppTools.appNovelTime())return;
            log.info("今日头条-看小说");
            try {
                Integer y = OcrTools.getWordsInt(androidId,"看小说赚金币");
                if(null==y){
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId,"看小说赚金币");
                }
                if(null==y){
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId,"看小说赚金币");
                }
                if(null!=y){
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(2000);
                    AdbTools.downPage(androidId);
                    AdbTools.tap(androidId, 160, 1580);
                    int yy = 1950;
                    if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                        yy = 2140;
                    }
                    AdbTools.tap(androidId, 830, yy);
                    Thread.sleep(3000);
                    for (int i = 0; i < 60; i++) {
                        try {
                            Thread.sleep(RandomTools.init(3000));
                            if (i % 8 == 0) {
                                Integer yyy = OcrTools.getWordsInt(androidId,"看视频再领");
                                if(null!=yyy){
                                    AdbTools.tap(androidId,540,yyy);
                                    Thread.sleep(27000);
                                    AdbTools.back(androidId);
                                }
                            }
                        } catch (Exception e) {
                        }

                        AdbTools.tap(androidId, 1030, 600);
                    }
                }







            } catch (Exception e) {
                log.info("今日头条-看小说异常");
            }
    }



/**
     * todo 6.看广告
     * @param androidId
     */

    public static void handle6(String androidId){

    }


/**
     * todo 7.玩游戏
     * @param androidId
     */

    public static void handle7(String androidId){

    }



/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param androidId
     */

    public static void handle8(String androidId){

    }




/**
     * todo 9.开宝箱
     * @param androidId
     */

    public static void handle9(String androidId){
        log.info("今日头条-开宝箱");
        try {
            Thread.sleep(2000);
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId, 930, 1950);
                AdbTools.tap(androidId, 540, 1440);
            }else{
                AdbTools.tap(androidId, 930, 1740);
                AdbTools.tap(androidId, 540, 1340);
            }
            Thread.sleep(32000);

            AdbTools.back(androidId);
        }catch (Exception e){
            log.info("今日头条-开宝箱异常");
        }
    }



/**
     * todo 10.抽奖
     * @param androidId
     */

    public static void handle10(String androidId){

    }



/**
     * todo 11.睡觉
     * @param androidId
     */

    public static void handle11(String androidId){
        log.info("今日头条-睡觉");
        if(AppTools.appSleepTime())return;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"睡觉赚钱");
                if(null!=y) {
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(2000);

                    int yy = 1860;
                    int yyy = 1400;
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        yy = 2050;
                        yyy = 1500;
                    }
                    AdbTools.tap(androidId, 540, yy);
                    AdbTools.tap(androidId, 540, yy);
                    AdbTools.tap(androidId, 540, yyy);
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("今日头条-睡觉异常");
            }
    }


/**
     * todo 12.走路
     * @param androidId
     */

    public static void handle12(String androidId){
        log.info("今日头条-走路");
        if(AppTools.appWalkTime())return;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"走路赚钱");
                if(null!=y) {
                    AdbTools.tap(androidId, 220, y);
                    Thread.sleep(2000);
                    AdbTools.tap(androidId, 540, 1060);
                    Integer y1 = OcrTools.getWordsInt(androidId,"看视频");
                    if(null!=y1){
                        AdbTools.tap(androidId,540,y1);
                        Thread.sleep(32000);
                        AdbTools.back(androidId);
                    }
                    AdbTools.back(androidId);
                }
            } catch (Exception e) {
                log.info("今日头条-走路异常");
            }
    }

/**
     * todo 13.喝水
     * @param androidId
     */

    public static void handle13(String androidId){

    }


/**
     * todo 14.充电
     * @param androidId
     */

    public static void handle14(String androidId){

    }

/**
     * todo 15.听歌曲
     * @param androidId
     */

    public static void handle15(String androidId){

    }


/**
     * todo 16.吃饭
     * @param androidId
     */

    public static void handle16(String androidId){
        log.info("今日头条-吃饭");
        if(AppTools.appEatTime())return;
            try {
                AdbTools.upPage(androidId);
                AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"吃饭补贴");
                if(null!=y) {
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(2000);

                    int yy = 1820;
                    int yyy = 1400;
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        yy = 2000;
                        yyy = 1500;
                    }
                    AdbTools.tap(androidId, 540, yy);
                    Integer y1 = OcrTools.getWordsInt(androidId,"看视频");
                    if(null!=y1){
                        AdbTools.tap(androidId,540,y1);
                        Thread.sleep(32000);
                        AdbTools.back(androidId);
                    }
                    AdbTools.back(androidId);
                }

            } catch (Exception e) {
                log.info("今日头条-吃饭异常");
            }
    }


/**
     * todo 17.分享
     * @param androidId
     */

    public static void handle17(String androidId){

    }


/**
     * todo 18.摇钱树
     * @param androidId
     */

    public static void handle18(String androidId){

    }


/**
     * todo 19.刮奖
     * @param androidId
     */

    public static void handle19(String androidId){

    }


/**
     * todo 20.模拟开店赚钱
     * @param androidId
     */

    public static void handle20(String androidId){
        log.info("今日头条-模拟开店赚钱");
        if(AppTools.appPlayTime1())return;
            try {
                Integer y = OcrTools.getWordsInt(androidId,"模拟开店赚钱");
                if(null==y){
                    AdbTools.upPage(androidId);
                    AdbTools.upPage(androidId);
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId,"模拟开店赚钱");
                }
                if(null==y){
                    AdbTools.upPage(androidId);
                    y = OcrTools.getWordsInt(androidId,"模拟开店赚钱");
                }

                if(null!=y) {
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(6000);

                    AdbTools.tap(androidId, 950, 960);
                    AdbTools.tap(androidId, 950, 870);
                    AdbTools.tap(androidId, 950, 930);
                    AdbTools.tap(androidId, 1000, 470);
                    AdbTools.tap(androidId, 1000, 400);

                    AdbTools.tap(androidId, 970, 300);
                    AdbTools.tap(androidId, 970, 320);
                    Thread.sleep(1000);
                    AdbTools.tap(androidId, 970, 320);
                    Thread.sleep(1000);
                    AdbTools.tap(androidId, 970, 320);

                    AdbTools.tap(androidId, 950, 840);
                    AdbTools.tap(androidId, 950, 930);
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 990, 140);
                    } else {
                        AdbTools.tap(androidId, 1000, 130);
                    }
                }
            } catch (Exception e) {
                log.info("今日头条-模拟开店赚钱异常");
            }
    }

/**
     * todo 21.种菜赚金币
     * @param androidId
     */

    public static void handle21(String androidId){
        log.info("今日头条-种菜赚金币");
        if(AppTools.appPlayTime2())return;
            try {
                Integer y = OcrTools.getWordsInt(androidId,"种菜赚金币");
                if(null==y){
                    AdbTools.upPage(androidId);
                    AdbTools.upPage(androidId);
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId,"种菜赚金币");
                }
                if(null==y){
                    AdbTools.downPage(androidId);
                    y = OcrTools.getWordsInt(androidId,"种菜赚金币");
                }

                if(null!=y) {
                    AdbTools.tap(androidId, 540, y);
                    Thread.sleep(6000);

                    AdbTools.tap(androidId, 970, 800);
                    AdbTools.tap(androidId, 970, 880);
                    AdbTools.tap(androidId, 970, 470);
                    AdbTools.tap(androidId, 970, 460);
                    for (int i = 0; i < 3; i++) {
                        AdbTools.tap(androidId, 970, 300);
                        AdbTools.tap(androidId, 540, 1260);
                        AdbTools.tap(androidId, 540, 1360);
                        Thread.sleep(18000);
                        AdbTools.back(androidId);
                        AdbTools.tap(androidId, 540, 1260);
                        AdbTools.tap(androidId, 540, 1360);
                    }

                    AdbTools.tap(androidId, 950, 840);
                    AdbTools.tap(androidId, 950, 930);
                    if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                        AdbTools.tap(androidId, 990, 140);
                    } else {
                        AdbTools.tap(androidId, 1000, 130);
                    }
                }
            } catch (Exception e) {
                log.info("今日头条-种菜赚金币异常");
            }
    }



/**
     * todo 22.搜索
     * @param androidId
     */

    public static void handle22(String androidId){

    }



/**
     * todo 获取横幅广告
     * @return
     */

    public static java.util.List getBanner(){
        List<String> list = new ArrayList<>();
        list.add("看小说赚金币");
        list.add("限时任务赚金币");
        list.add("扫码立得现金");
        list.add("看视频,赚金币");
        list.add("睡觉赚金币");
        list.add("走路赚金币");
        list.add("看小说赚金币");
        list.add("玩游戏赚钱");
        list.add("签到");
        list.add("0.3元提现");

        return list;
    }


}

