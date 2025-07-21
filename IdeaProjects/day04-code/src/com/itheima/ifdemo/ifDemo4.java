package com.itheima.ifdemo;

import java.util.Scanner;

public class ifDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明成绩：");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100){
            if(score >= 95 && score <= 100) {
                System.out.println("送自行车一辆");
            } else if (score >=90 && score < 95) {
                System.out.println("游乐场玩一天");
            } else{
                System.out.println("揍一顿");
            }
        }else {
            System.out.println("输入不合法");
        }
    }
}
