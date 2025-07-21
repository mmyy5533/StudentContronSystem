package com.itheima.assigningoperator;

public class 三元运算符 {
    public static void main(String[] args) {
        // 1.格式
        // 比较表达式 ? 表达式1 : 表达式2;
        // 2.执行流程
        // 首先计算比较表达式的值，看是true还是false
        // 如果是true，表达式1的值就是运算结果
        // 如果是false，表达式2的值就是运算结果
        // 3.整个三元运算符的表达式一定要被使用
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);
    }
}
