package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /* 需求：
        您和您的约会对象正试图再餐厅获得一张桌子，
        键盘录入两个整数，表示你和你约会对象衣服的时髦度（手动录入0~10之间的整数，不能录入其他）
        如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true，否则输出false
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的时髦程度：");
        int myFashion = sc.nextInt();
        System.out.println("请输入您的约会对象的时髦程度：");
        int girlFashion = sc.nextInt();
        boolean result = myFashion > girlFashion;
        System.out.println(result);
    }
}
