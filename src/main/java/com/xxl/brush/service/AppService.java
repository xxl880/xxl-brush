package com.xxl.brush.service;

/**
 * 
 * todo app-视频服务接口类接口
 */
public interface AppService {


    /**
     * todo 1.凌晨0:00-2:00(签到)
     */
    public void start(String robotCode);



    /**
     * todo 6-循环收取金币大于200金币
     */
    public void circulate(String robotCode);



}
