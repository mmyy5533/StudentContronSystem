package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*
        需求：给一个整数 X
        如果 x 是一个回文整数，打印 true，否则，返回false。
        解释：回文数是指正序（从左往右）和倒序（从右往左）读都是一样的整数。
        例如：121是回文，而123不是。
         */
//        核心思路：把数字倒过来跟原来的数字进行比较

        int x= 121;
        int temp = x;
        int num = 0;
        while(x != 0){
            //从右往左获取每一个数字
            int ge = x % 10;
            x = x/10;
            num = num * 10 + ge;
        }
        System.out.println(num == temp);
    }
}
