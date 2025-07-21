package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* 数字6是一个数字，键盘录入两个整数。
        如果其中一个为6，最终结果输出为true。
        如果他们的和为6，最终结果输出为true。
        其他情况都是false。
         */
        //分析：
        //1.键盘录入两个整数
        //变量a   变量b
        //2. a == 6 b== 6 (a+b)%6 == 0
        //如果满足其中一个，那么就可以输出true

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int number2 = sc.nextInt();
        boolean result = (number1 == 6) || (number2 == 6) || (number1 + number2) % 6 == 0;

        System.out.println(result);

    }
}
