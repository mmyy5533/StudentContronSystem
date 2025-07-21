package com.itheima.assigningoperator;

public class 赋值运算符和关系运算符 {
    public static void main(String[] args) {
        int a =  10;
        int b = 20;
        // +=
        //  把左边和右边的数据进行相加，然后把结果赋值给左边
        //  相当于 a = a + b;
        a += b;
        System.out.println(a);
        System.out.println(b);

        //细节
        short s = 1;
        //把左边和右边进行相加，得到结果2，再赋值给左边的变量
        s += 1;
        //等同于：s = s + 1;
        System.out.println(s);


        //2.关系运算符/比较运算符
        //  >  <  >=  <=  ==  !=
        // 注意事项：关系运算符的结果都是boolean类型，要么是true，要么是false，千万注意区分 == 和 =
        //  1.==  等于
        int c = 10;
        int d = 20;
        System.out.println(a == b);
    }
}
