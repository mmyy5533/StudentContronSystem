package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择");
        int number = sc.nextInt();
//      根据选择执行不同的代码
        switch (number){
            case 1:
                System.out.println("您选择了机票查询");
                break;
            case 2:
                System.out.println("您选择了机票预订");
                break;
            case 3:
                System.out.println("您选择了机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }

    }
}
