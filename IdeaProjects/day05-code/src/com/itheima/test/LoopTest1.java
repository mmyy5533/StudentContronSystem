package com.itheima.test;

import java.util.Random;

public class LoopTest1 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(6,10);//0~9,包头不包尾，包左不包右
        System.out.println(number);


        //秘诀：
        //用来生成任意数到任意数之间的随机数
        //1.让这个范围头尾都减去一个值，让这个范围从0开始
        //2.尾巴+1
        //3.最终的结果，再加上第一步减去的值
    }

}
