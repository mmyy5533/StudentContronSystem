package com.itheima.SwitchDemo1;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        // 兰州拉面、武汉热干面、北京炸酱面、陕西油泼面
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你喜欢的面");
        String noodles = sc.next();
        switch (noodles){
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
                default:
                    System.out.println("吃泡面把");
        }
    }
}
