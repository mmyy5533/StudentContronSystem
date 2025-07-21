package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        /*
            需求：给定两个整数，被除数和除数（都是整数，且不超过int的范围）。
            将两数相除，要求不使用乘法、除法和取余运算符，得到商和余数。
            分析：被除数/除数 = 商...余数
         */
//      1.定义变量记录被除数
        int dividend = 10;
//      2.定义变量记录除数
        int divisor = 3;
//      3.定义一个变量用来统计相减了多少次
        int count = 0;
//      3.循环while
//      在循环中，不断使用被除数-除数
//      只要被除数 是大于等于除数的，那么就一直循环
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        //当循环结束后，dividend就是余数
        System.out.println(dividend);
        System.out.println(count);
    }
}
