package com.xxl.brush.service;

/**
 * 
 * todo app-视频服务接口类接口
 */
public interface AppService {

    /**
     * todo 6-循环收取金币大于200金币
     */
    public void circulate(String androidId);

    /**
     * todo 指定手机获取图片
     */
    public void capture(String androidId);

    /**
     * todo 清除指定手机缓存
     */
    public void cache(String androidId);

}
