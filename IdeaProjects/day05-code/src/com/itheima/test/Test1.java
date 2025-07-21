package com.itheima.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //分析：
        //1.定义数组表示奖池
        int [] arr= {2, 588, 888, 1000, 10000};
        //2.定义新数组用于存储抽奖的结果
        int [] newArr = new int[arr.length];
        //3.抽奖
        Random r = new Random();
        //因为有5个奖项，所以这里循环五次
        for (int i = 0; i < arr.length;){
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(newArr, prize);
            if(!flag){
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
                
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
