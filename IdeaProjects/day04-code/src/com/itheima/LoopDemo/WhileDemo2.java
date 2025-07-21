package com.itheima.LoopDemo;
/*
    for和while循环的区别：
    相同点：运行规则是一样的
    区别：
    for循环中，控制循环的变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
    while循环中，控制循环的变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量还可以继续使用
    for循环中：知道循环次数或者循环的范围
    while循环中：不知道循环次数，只知道循环的结束条件
 */

public class WhileDemo2 {
    public static void main(String[] args) {
//        需求：利用while循环打印1~100
        //分析
        //开始条件:1
        //结束条件:100
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
