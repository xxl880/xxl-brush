package com.xxl.brush.tools;

import java.util.Random;

public class RandomTools {

    /**
     * 随机产生 1-100之间数
     * @return
     */
    public static int init(int number){
        Random rand =new Random();
        int i=rand.nextInt(number);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(init(10));
    }
}
