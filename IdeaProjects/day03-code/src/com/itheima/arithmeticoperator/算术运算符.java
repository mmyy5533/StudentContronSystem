package com.itheima.arithmeticoperator;

public class 算术运算符 {
    public static void main(String[] args) {

        System.out.println(3.7+"abc");
        System.out.println("abc"+true);
        System.out.println('中'+"abc"+true);

        int age = 18;
        System.out.println("我的年龄是" + age + "岁");
        System.out.println("我的年龄是" + "age" + "岁");
        System.out.println(1+2+"abc"+2+1);

        // 当字符+字符的时候，会把字符通过ASCII码表进行转换，再进行计算
        // 当字符+数字的时候，会把字符通过ASCII码表进行转换，再进行计算
        System.out.println('a' + 0);
    }
}
