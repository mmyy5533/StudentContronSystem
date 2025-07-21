package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
    /* 需求：键盘录入两个数字，表示一个范围
    在这个范围中，既能被3整除，又能被5整除的数字有哪些？
     */
        //分析：
        //1.键盘录入两个数字
        //变量a   变量b
        //2.判断a<b
        //3.如果满足条件，就输出这个范围中，既能被3整除，又能被5整除的数字有哪些？
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
