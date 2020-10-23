package com.xxl.brush.service;

/**
 * 
 * todo app-视频服务接口类接口
 */
public interface AppService {



//************************一种类型：签到********************************************************
    /**
     * todo 1-签到
     */
    public void start(String robotCode);


//************************二种类型：分段（一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）*****************************************
    /***
     * todo 2.1-早上8:00-9:00  （一次性收取，睡觉收取，吃饭，喝水，打卡，种菜，分享，游戏，充电）
     */
    public void section1(String robotCode);

    /**
     * todo 2.2-中午11：00-12:00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     */
    public void  section2(String robotCode);
    /**
     * todo 2.3-下午19：00-20：00（吃饭，喝水，打卡，种菜，分享，游戏，充电）
     */
    public void  section3(String robotCode);
    /**
     * todo 2.4-晚上23：00-24：00（睡觉打卡，吃饭，喝水，打卡，种菜，分享，游戏，充电，步行收取）
     */
    public void  section4(String robotCode);

//*************************三种类型：循环(开宝箱，看广告，领红包,看视频，看新闻，看小说，刮卡，抽奖)********************************************************
    /**
     * todo 3.1-循环收取金币大于200金币
     */
    public void circulate1(String robotCode);

    /**
     * todo 3.2-循环收取金币小于200金币
     */
    public void circulate2(String robotCode);


}
