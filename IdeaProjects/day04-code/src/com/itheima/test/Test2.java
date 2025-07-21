package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 1000;
        System.out.println("请输入一个整数表示你的会员等级：");
        int num = sc.nextInt();

        if (num == 1){
            System.out.println("实际需要花费：" + (price * 0.9));
        }else if (num == 2){
            System.out.println("实际需要花费：" + (price * 0.8));
        }else if (num == 3){
            System.out.println("实际需要花费：" + (price * 0.7));
        }else{
            System.out.println("实际需要花费：" + price);
        }
    }
}
