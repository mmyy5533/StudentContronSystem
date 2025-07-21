package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int number2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int number3 = sc.nextInt();

        int temp = number1 > number2 ? number1:number2;
        int max = temp > number3 ? temp : number3;
        System.out.println("最高的和尚的身高为：" + max+"cm");

    }
}
