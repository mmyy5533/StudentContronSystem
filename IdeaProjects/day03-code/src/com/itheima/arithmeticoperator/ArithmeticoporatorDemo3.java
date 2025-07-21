package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticoporatorDemo3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        int qian = number / 1000 % 10;
        int wan = number / 10000 % 10;
        System.out.println(number);
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);
        System.out.println("千位："+qian);
        System.out.println("万位："+wan);

    }
}
