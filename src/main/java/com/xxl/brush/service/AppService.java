package com.xxl.brush.service;

import java.util.Map;

/**
 * 
 * todo app-视频服务接口类接口
 */
public interface AppService {

    /**
     * todo 6-循环收取金币大于200金币
     */
    public void circulate(String androidId, int portSeq, Map<String,Integer> map);

    /**
     * todo 6-循环收取金币大于200金币
     */
    public void capture(String androidId);

}
