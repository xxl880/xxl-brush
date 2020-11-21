package com.xxl.brush.app;

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

/*
*
 * todo App微博
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class App微博 {
    private static Logger log = LoggerFactory.getLogger(App微博.class);

/**
     * todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appTime())return;
            try {
                log.info("********************************微博操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup微博);

                log.info("3.启动appium");
                AdbTools.clear(androidId);

                handle1(androidId);
                handle4(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/**
     * todo 退出
     * @param */
    public static void quit(String androidId){

    }


/*
*
     * todo 清除
     * @param
*/
    public static void clear(String androidId){
        try {
        }catch (Exception e){}
    }




/**
     * todo 1.签到
     * @param */
    public static void handle1(String androidId){
        int hour = LocalDateTime.now().getHour();
        if(hour==0) {
            log.info("微博-签到");
            try {
                int yy = 1950;
                if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
                    yy = 2140;
                }
                AdbTools.tap(androidId, 110, yy);
                AdbTools.tap(androidId, 900, 136);

                AdbTools.upPage(androidId);
                Thread.sleep(2000);
                Integer y = OcrTools.getWordsInt(androidId, "关注@微博任务");
                if (null != y) {
                    AdbTools.tap(androidId, 540, y);
                }
                AdbTools.tap(androidId,70,140);
            } catch (Exception e) {
                log.info("微博-签到异常");
            }
        }
    }


/**
     * todo 2.看视频
     * @param */
    public static void handle2(String androidId){

    }


/**
     * todo 3.看小视频
     * @param */
    public static void handle3(String androidId){

    }



/**
     * todo 4 看关注微博转发评论等
     * @param */
    @SneakyThrows
    public static void handle4(String androidId){
        log.info("微博-看关注微博转发评论等");
        int y = 1950;
        if (androidId.equals(PhoneConstants.phone001) || androidId.equals(PhoneConstants.phone002)) {
            y = 2140;
        }
        AdbTools.tap(androidId,110,y);
        AdbTools.tap(androidId,450,140);
        try {
            int x = RandomTools.init(8) + 12;
            for (int a = 0; a < x; a++) {
                Thread.sleep(RandomTools.init(15000));
                AdbTools.down(androidId);
            }
            AdbTools.back(androidId);
        } catch (Exception e) {
            log.info("微博-刷公共微博异常");
        }

        Thread.sleep(2000);
        AdbTools.tap(androidId,620,140);
        Thread.sleep(4000);
        for(int i=0;i<12;i++){
            AdbTools.upPage(androidId);
            Thread.sleep(2000);
            AdbTools.tap(androidId,750,410);
            Integer yy = OcrTools.getWordsInt(androidId,"关注");
            if(null==yy){
                AdbTools.tap(androidId,970, yy);
                Thread.sleep(2000);
            }

            Integer yyy = OcrTools.getWordsInt(androidId,"赞");
            if(null==yyy){
                AdbTools.tap(androidId,900, yyy);
                Thread.sleep(2000);
            }

            Integer yyyy = OcrTools.getWordsInt(androidId,"转发");
            if(null==yyyy){
                AdbTools.tap(androidId,200, yyyy);
                AdbTools.tap(androidId,980, 140);
                Thread.sleep(2000);
            }

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

            Thread.sleep(1000);
            Integer yyyyy = OcrTools.getWordsInt(androidId,"评论");
            if(null==yyyyy){
                AdbTools.tap(androidId,540, yyyyy);
                Thread.sleep(2000);
                AdbTools.text(androidId, list.get(RandomTools.init(23)));
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    AdbTools.tap(androidId,980, 1210);
                }else {
                    AdbTools.tap(androidId,980, 1070);
                }
                Thread.sleep(2000);
            }
            AdbTools.back(androidId);

        }

        AdbTools.tap(androidId, 110, y);
        AdbTools.tap(androidId, 900, 136);
        try {
            AdbTools.upPage(androidId);
            AdbTools.upPage(androidId);
            AdbTools.down(androidId);
            AdbTools.down(androidId);
            Integer y1 = OcrTools.getWordsInt(androidId,"刷关注微博,即可获得任务奖励");
            if(null==y1){
                AdbTools.down(androidId);
                y1 = OcrTools.getWordsInt(androidId,"刷关注微博,即可获得任务奖励");
            }
            AdbTools.tap(androidId,930,y1-60);
            Thread.sleep(3000);

            Integer y2 = OcrTools.getWordsInt(androidId,"随意转发微博");
            if(null==y2){
                AdbTools.down(androidId);
                y2 = OcrTools.getWordsInt(androidId,"随意转发微博");
            }
            AdbTools.tap(androidId,930,y2-60);
            Thread.sleep(3000);

            Integer y3 = OcrTools.getWordsInt(androidId,"点赞任意微博");
            if(null==y3){
                AdbTools.down(androidId);
                y3 = OcrTools.getWordsInt(androidId,"点赞任意微博");
            }
            AdbTools.tap(androidId,930,y3-60);
            Thread.sleep(3000);

            Integer y4= OcrTools.getWordsInt(androidId,"评论任意微博");
            if(null==y4){
                AdbTools.down(androidId);
                y4 = OcrTools.getWordsInt(androidId,"评论任意微博");
            }
            AdbTools.tap(androidId,930,y4-60);
            Thread.sleep(3000);


        }catch (Exception e){
            log.info("微博-看关注微博转发评论等异常");
        }
    }


/**
     * todo 5.看小说
     * @param */
    public static void handle5(String androidId){

    }


/**
     * todo 6.看广告
     * @param */
    public static void handle6(String androidId){


    }

/**
     * todo 7.玩游戏
     * @param */
    public static void handle7(String androidId){

    }


/**
     * todo 8.领红包(操作流程：1-点击红包，2-看广告)
     * @param */
    public static void handle8(String androidId){

    }



/**
     * todo 9.开宝箱
     * @param */
    public static void handle9(String androidId){

    }


/**
     * todo 10.抽奖
     * @param */
    public static void handle10(String androidId){

    }


/**
     * todo 11.睡觉
     * @param */
    public static void handle11(String androidId){

    }

/**
     * todo 12.走路
     * @param */
    public static void handle12(String androidId){


    }


/**
     * todo 13.喝水
     * @param */
    public static void handle13(String androidId){

    }


/**
     * todo 14.充电
     * @param */
    public static void handle14(String androidId){

    }

/**
     * todo 15.听歌曲
     * @param */
    public static void handle15(String androidId){

    }

/**
     * todo 16.吃饭
     * @param */
    public static void handle16(String androidId){


    }

/**
     * todo 17.分享
     * @param */
    public static void handle17(String androidId){

    }

/*
*
     * todo 18.摇钱树
     * @param
*/
    public static void handle18(String androidId){

    }

/*
*
     * todo 19.刮奖
     * @param
*/
    public static void handle19(String androidId){

    }






}


