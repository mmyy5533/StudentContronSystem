package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        // Division
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(10.0/3);

        // Modulo operation. Actually, it's also a division operation, but the result is the remainder, not the quotient
        System.out.println(10%2);

        // Check if the divisor is zero before division
        int divisor = 0;
        if (divisor != 0) {
            System.out.println(10/divisor);
        } else {
            System.out.println("Cannot divide by zero");
        }
        // Application scenarios:

        //应用场景：
        //1.可以用取模来判断，A是否可以被B整除
        //A % B    10 % 3
        //2.可以用取模来判断，A是否为偶数
        //A % 2    结果为0，说明A是偶数，如果A为1，说明A是奇数
        //3.在以后，斗地主发牌
        //三个玩家
        //每个牌都定义一个序号
        //拿着序号%3如果结果为1，那就发给第一个玩家。
        //拿着序号%3如果结果为2，那就发给第二个玩家。
        //拿着序号%3如果结果为0，那就发给第三个玩家。
    }
}
