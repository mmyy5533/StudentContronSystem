package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*
            需求：世界最高峰是珠穆朗玛峰（8844.43米 = 8844430毫米），如果我有一张足够大的纸，它的厚度为0.1毫米。
            请问，我折叠多少次，可以折成珠穆朗玛峰的高度？
         */
//      1.定义一个变量记录珠穆朗玛峰的高度
        double height = 8844430;
//      2.定义一个变量记录纸张的厚度
        double paper = 0.1;
//      3.定义一个变量记录折叠次数
        int count = 0;
//      4.循环折叠纸张，直到纸张的厚度大于珠穆朗玛峰的高度
        while (paper <= 8844430){
            paper *= 2;
            count++;
        }
        System.out.println("需要折叠" + count + "次");
    }
}
