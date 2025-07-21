package com.itheima.assigningoperator;

public class 逻辑运算符 {
    public static void main(String[] args) {
        //1.并且
        //  两个条件同时满足，结果才是true，只要有一个条件不满足，结果就是false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //2.或者
        //  两个条件只要有一个满足，结果就是true，两个条件都不满足，结果才是false
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //3.异或^
        //  两个条件结果不一样，为true，两个条件结果一样，为false
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //4.取反
        //  !
        // 取反的感叹号不要写多次，如果写多次，结果会和原来的结果相反
        System.out.println(!true);
        System.out.println(!false);
    }
}
