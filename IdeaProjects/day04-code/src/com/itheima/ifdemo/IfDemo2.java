package com.itheima.ifdemo;

/*
if的注意点：
    1.if语句控制的语句体如果是一条语句，大括号可以省略；如果是多条语句，就不能省略。建议永远不要省略。
    2.一般来说：有左大括号就没有分号，有分号就没有左大括号，个人建议不要省略大括号
    3.如果对一个布尔类型的变量进行判断，不要写==，直接把变量写在小括号中即可
 */




public class IfDemo2 {
    public static void main(String[] args) {
        boolean flag = false;
        if(!flag){
            System.out.println("number大于等于10");
        }
    }
}
