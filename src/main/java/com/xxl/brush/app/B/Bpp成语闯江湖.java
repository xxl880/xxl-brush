package com.xxl.brush.app.B;

import com.xxl.brush.constants.AppConstants;
import com.xxl.brush.constants.PhoneConstants;
import com.xxl.brush.tools.AdbTools;
import com.xxl.brush.tools.AppTools;
import com.xxl.brush.tools.OcrTools;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * todo App成语闯江湖
 * app-用户行为操作(签到，看视频，关注，点赞，收藏，评论，开宝箱，种菜，走路)
*/
public class Bpp成语闯江湖 {
    private static Logger log = LoggerFactory.getLogger(Bpp成语闯江湖.class);


    /* todo 循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)
     * 以category分类定位，再点击用户行为,用一category下不可多次点击category,否则试为程序运行
     * 传相应的app_code对应的phoneCodeDtos*/
    public static void circulate(String androidId){
        if(AppTools.appWithdrawTime())return;
            try {
                log.info("********************************成语闯江湖操作********************************************");

                log.info("1.初始化手机");
                AdbTools.initMobile(androidId);

                log.info("2.启动app");
                AdbTools.startup(androidId, AppConstants.startup成语闯江湖);

                log.info("3.清除");
                AdbTools.clear(androidId);

                handle10(androidId);
                //hndle1(androidId);
                handle9(androidId);
                handle6(androidId);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }



/*
     * todo 退出
     * @param robot
*/
    @SneakyThrows
    public static void quit(String androidId){
/*        AdbTools.tap(androidId,970, 90);
        AdbTools.tap(androidId,970, 190);
        AdbTools.startup(androidId, AppConstants.startup成语闯江湖);
        AdbTools.tap(androidId,970, 90);
        AdbTools.tap(androidId,970, 190);*/

        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){

           // AdbTools.tap(androidId, 970, 170);
            AdbTools.tap(androidId, 102, 170);
        }else{
            //AdbTools.tap(androidId, 970, 95);
            AdbTools.tap(androidId, 102, 95);
        }


        AdbTools.startup(androidId, AppConstants.startup成语闯江湖);
        if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
            AdbTools.tap(androidId,970, 560);
            AdbTools.tap(androidId,890, 540);
        }else{
            AdbTools.tap(androidId,930, 480);
            AdbTools.tap(androidId,860, 460);
        }

    }


/*
     * todo 清除
     * @param robot
*/
    public static void clear( String androidId){
         
    }


/*
     * todo 1.签到
     * @param robot
*/
    @SneakyThrows
    public static void handle1(String androidId){
            try{
                log.info("成语闯江湖-签到");
                Integer y = OcrTools.getWordsInt(androidId,"可领取");
                if(null!=y){
                    AdbTools.tap(androidId,540, y+100);
                    Thread.sleep(36000);
                    AdbTools.tap(androidId,970, 90);
                    AdbTools.tap(androidId,970, 190);
                }

                Integer yy = OcrTools.getWordsInt(androidId,"签到奖励");
                if(null!=yy){
                    AdbTools.tap(androidId,890, yy-420);
                }

                Integer yyy = OcrTools.getWordsInt(androidId,"我的金币");
                if(null!=yyy){
                    AdbTools.tap(androidId,890, yyy-620);
                }

            } catch (Exception e) {
                log.info("成语闯江湖-签到异常");
            }
    }


/*
     * todo 6.答题
     * @param robot
*/
    public static void handle6(String androidId){
        log.info("成语闯江湖 -答题");
        try{
            int y = 1890;
            int yy = 1580;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2060;
                yy = 1660;
            }
            AdbTools.tap(androidId,540, y);
            Thread.sleep(2000);
            for(int i=0;i<6;i++){
                AdbTools.tap(androidId,90, yy);
                AdbTools.tap(androidId,220, yy);
                AdbTools.tap(androidId,340, yy);
                AdbTools.tap(androidId,470, yy);
                AdbTools.tap(androidId,590, yy);
                AdbTools.tap(androidId,710, yy);
            }

            Integer yyy = OcrTools.getWordsInt(androidId,"金币");
            if(null!=yyy){
                AdbTools.tap(androidId,540, yy+350);
                Thread.sleep(36000);
                AdbTools.tap(androidId,970, 90);
                AdbTools.tap(androidId,970, 190);
            }

            AdbTools.back(androidId);

        }catch (Exception e){
            log.info("成语闯江湖-答题异常");
        }

    }



    /*
     * todo 9.看视频广告
     * @param robot
     */
    public static void handle9(String androidId){
        log.info("成语闯江湖 -看视频广告");
        try{
            int y = 540;
            int yy  = 820;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                AdbTools.tap(androidId,840, 150);
                y = 600;
                yy = 820;
            }else{
                AdbTools.tap(androidId,770, 140);
            }

            Thread.sleep(2000);

            AdbTools.tap(androidId,780, y);
            AdbTools.downPage(androidId);

            AdbTools.tap(androidId,540, yy);

            for (int a = 0; a < 60; a++) {
                Thread.sleep(2000);
                if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                    AdbTools.tap(androidId, 540, 1550);
                    Thread.sleep(59000);
                    AdbTools.tap(androidId, 970, 170);
                    AdbTools.tap(androidId, 102, 170);
                }else{
                    AdbTools.tap(androidId, 540, 1410);
                    Thread.sleep(59000);
                    AdbTools.tap(androidId, 970, 95);
                    AdbTools.tap(androidId, 102, 95);
                }

            }


        }catch (Exception e){
            log.info("成语闯江湖-答题异常");
        }

    }



    /*
     * todo 10.领金币
     * @param robot
     */
    public static void handle10(String androidId){
        log.info("成语闯江湖 -领金币");
        try{
            int y = 1890;
            int yy = 1580;
            if(androidId.equals(PhoneConstants.phone001)||androidId.equals(PhoneConstants.phone002)){
                y = 2060;
                yy = 1660;
            }
            AdbTools.tap(androidId,200, 450);
            AdbTools.tap(androidId,200, 450);
            Thread.sleep(36000);
            quit(androidId);

            AdbTools.tap(androidId,420, 450);
            AdbTools.tap(androidId,420, 450);
            Thread.sleep(36000);
            quit(androidId);

            AdbTools.tap(androidId,680, 450);
            AdbTools.tap(androidId,680, 450);
            Thread.sleep(36000);
            quit(androidId);

            AdbTools.tap(androidId,200, 630);
            AdbTools.tap(androidId,200, 630);
            Thread.sleep(36000);
            quit(androidId);

            AdbTools.tap(androidId,620, 630);
            AdbTools.tap(androidId,620, 630);
            Thread.sleep(36000);
            quit(androidId);


            AdbTools.tap(androidId,890, 630);
            AdbTools.tap(androidId,890, 630);
            Thread.sleep(36000);
            quit(androidId);

        }catch (Exception e){
            log.info("成语闯江湖-答题异常");
        }

    }



}


