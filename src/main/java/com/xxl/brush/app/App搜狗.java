package com.xxl.brush.app;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import com.xxl.brush.tools.RandomTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
*
 * todo App搜狗
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)*/
public class App搜狗 {
    private static Logger log = LoggerFactory.getLogger(App搜狗.class);

/**
     * todo 6.循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************搜狗操作********************************************");
                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup搜狗);

                log.info("3.清除");
                AdbTools.clear(androidId);

                int y = 1960;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    y = 2140;
                }
                AdbTools.tap(androidId, 540, y);
                AdbTools.tap(androidId, 900, 160);

                handle1(androidId);
                handle20(androidId);
                handle4(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }

    }


/*

*
     * todo 退出
     * @param robot
*/
    public static void quit(String androidId){

    }


/*
*
     * todo 清除
     * @param robot
*/
    public static void clear(String androidId){

    }


/*
*
     * todo 1.签到
     * @param robot
*/
    public static void handle1(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==0||AppTools.isTest()) {
            log.info("搜狗-签到");
            try {
                AdbTools.upPage(androidId);
                AdbTools.tap(androidId,180,540);
                AdbTools.tap(androidId,410,540);
                AdbTools.tap(androidId,650,540);
                AdbTools.tap(androidId,880,540);

                AdbTools.tap(androidId,180,840);
                AdbTools.tap(androidId,410,840);
                AdbTools.tap(androidId,780,840);

                Integer y = OcrTools.getWordsInt(androidId,"立即查看");
                if(null!=y){
                  AdbTools.tap(androidId,540,y);
                }

            } catch (Exception e) {
                log.info("搜狗-签到异常");
            }
        }
    }


/*
*
     * todo 2.看视频
     * @param robot
*/
    public static void handle2(String androidId){

    }


/*
*
     * todo 3.看小视频
     * @param robot
*/
    public static void handle3(String androidId){

    }


/*
*
     * todo 4.看新闻
     * @param robot
*/
    public static void handle4(String androidId){
        log.info("搜狗-看新闻");
        try {
            AdbTools.upPage(androidId);
            Integer y = OcrTools.getWordsInt(androidId,"认真完整阅读");
            if(null!=y){
                AdbTools.tap(androidId,910,y-70);
                Thread.sleep(2000);
                for(int i= 0;i<8;i++) {
                    AdbTools.tap(androidId, 540, 1000);
                    int x = RandomTools.init(6) + 6;
                    for (int a = 0; a < x; a++) {
                        Thread.sleep(RandomTools.init(15000) + 6000);
                        AdbTools.down(androidId);
                    }
                    AdbTools.back(androidId);
                }

                int yy = 1960;
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    yy = 2140;
                }
                AdbTools.tap(androidId, 540, yy);
                AdbTools.tap(androidId, 900, 160);
                AdbTools.tap(androidId,910,y-70);
            }
        }catch (Exception e){
            log.info("搜狗-看新闻异常");
        }
    }


/*
*
     * todo 5.看小说
     * @param robot
*/
    public static void handle5(String androidId){

    }


/*
*
     * todo 6.看广告
     * @param robot

*/
    public static void handle6(String androidId){


    }

/*
*
     * todo 7.玩游戏
     * @param robot
*/
    public static void handle7(String androidId){

    }


/*
*
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param robot
*/
    public static void handle8(String androidId){

    }



/*
*
     * todo 9.开宝箱
     * @param robot

*/
    public static void handle9(String androidId){

    }


/*
*
     * todo 10.抽奖
     * @param robot
*/
    public static void handle10(String androidId){

    }


/*
*
     * todo 11.睡觉
     * @param robot
*/
    public static void handle11(String androidId){

    }

/*
*
     * todo 12.走路
     * @param robot
*/
    public static void handle12(String androidId){

    }


/*
*
     * todo 13.喝水
     * @param robot
*/
    public static void handle13(String androidId){

    }


/*
*
     * todo 14.充电
     * @param robot
*/
    public static void handle14(String androidId){

    }

/*
*
     * todo 15.听歌曲
     * @param robot
*/
    public static void handle15(String androidId){

    }

/*
*
     * todo 16.吃饭
     * @param robot
*/
    public static void handle16(String androidId){



    }

/*
*
     * todo 17.分享
     * @param robot
*/
    public static void handle17(String androidId){

    }

/*
*
     * todo 18.摇钱树
     * @param robot
*/
    public static void handle18(String androidId){

    }

/*
*
     * todo 19.刮奖
     * @param robot
*/
    public static void handle19(String androidId){

    }

/*
*
     * todo 20.搜索
     * @param robot
*/
    public static void handle20(String androidId){
            log.info("搜狗-搜索");
            try {
               AdbTools.upPage(androidId);
                Integer y = OcrTools.getWordsInt(androidId,"去搜索框");
                if(null!=y){
                    AdbTools.tap(androidId,910,y-70);
                    for (int i = 0; i < 6; i++) {
                        List<String> list = new ArrayList();
                        list.add("ligangjianying");
                        list.add("jianqianyankai");
                        list.add("tianjingdiyi");
                        list.add("detianduhou");
                        list.add("chuitousanqi");
                        list.add("moshouchenggui");
                        list.add("gangbiziyong");
                        list.add("lijingtuzhi");
                        list.add("xinkuangshenyi");
                        list.add("duoduobiren");
                        list.add("haogaowuyuan");
                        list.add("heaikeqin");
                        list.add("jianfengshiduo");
                        list.add("yuanmuqiuyu");
                        list.add("kuizhirenkou");
                        list.add("laojianjuhua");
                        list.add("maogusongran");
                        list.add("mingguanjiuzhou");
                        list.add("ouxinlixue");
                        list.add("rencaijiji");
                        list.add("ruyuanyichuang");
                        list.add("ruobujingfeng");
                        list.add("sesanbanlan");
                        list.add("bixinliyi");
                        list.add("suijiyingbian");
                        list.add("chujiubuxin");
                        list.add("haogaowuyuan");
                        AdbTools.tap(androidId, 540, 136);
                        AdbTools.text(androidId, list.get(RandomTools.init(23)));
                        Thread.sleep(1000);
                        AdbTools.tap(androidId, 1000, 136);
                        Thread.sleep(1000);
                        AdbTools.tap(androidId, 540, 680);
                    }
                    int yy = 1960;
                    if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                        yy = 2140;
                    }
                    AdbTools.tap(androidId, 540, yy);
                    AdbTools.tap(androidId, 900, 160);
                }
            } catch (Exception e) {
                log.info("搜狗-搜索异常");
            }
    }





}


