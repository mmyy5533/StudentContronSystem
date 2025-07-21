package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        if (isLightGreen){
            System.out.println("请通行");
        }else if (isLightYellow){
            System.out.println("请减速");
        }else if (isLightRed){
            System.out.println("请停车");
        }
    }
}
