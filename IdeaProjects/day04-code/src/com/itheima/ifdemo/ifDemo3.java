package com.itheima.ifdemo;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if(number >= 100){
            System.out.println("吃网红餐厅");
        } else{
            System.out.println("吃沙县小吃");

        }
    }
}
