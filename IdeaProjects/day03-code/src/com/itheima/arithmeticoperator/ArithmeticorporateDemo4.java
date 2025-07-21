package com.itheima.arithmeticoperator;

public class ArithmeticorporateDemo4 {
    public static void main(String[] args) {
        // 类型转换的分类
        // 1.隐式转换（自动类型提升）
        //  把一个取值范围小的数值，转成取值范围大的数据
        // 隐式转换的两种提升规则：
        // 1.1 取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算
        // 1.2 byte、short、char三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算
        // byte < short < int < long < float < double
        // 什么时候转换？
        // 数据类型不一样，不能进行计算，需要转成一样的才可以进行计算。
        // 转换规则1：
        // 取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算
        // 转换规则2：
        // byte、short、char三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算
        // 2.强制转换
        // 如果要把一个取值范围大的数据，转成取值范围小的数据，就需要强制转换
        // 强制转换格式：目标数据类型 变量名 = (目标数据类型)值或者变量;
        byte b1 = 127;
        byte b2 = 100;
        byte result = (byte)(b1 + b2);
        System.out.println(result);
    }
}
