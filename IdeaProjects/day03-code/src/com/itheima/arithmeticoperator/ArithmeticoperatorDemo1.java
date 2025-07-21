package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3+2);
        //-
        System.out.println(3-2);
        //*
        System.out.println(3*2);
        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果有小数参与运算，结果有可能不精确的
        //为什么呢？
        //暂时只要知道这个结论即可，以后再详细的解释
        //具体的原因，等我们到了JavaSE的时候，会再详细的讲解。
        System.out.println(1.1+1.1);
        System.out.println(1.1+1.1+1.01);
        System.out.println(1.1-1.01);
        System.out.println(1.1*1.01);
    }
}
