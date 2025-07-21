package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        /* 需求：键盘录入星期数，显示今天的减肥活动
            周一：跑步
            周二：游泳
            周三：慢走
            周四：动感单车
            周五：拳击
            周六：爬山
            周日：好好吃一顿

         */
//        default:
//        位置：不一定在最下面，任意位置都可以，只不过习惯写在最下面
        /*
        case穿透
            就是语句体中没有写break导致的。
            执行流程：
                1.先执行第一个case语句体
                2.如果没有break，那么会继续执行下一个case语句体
                3.直到遇到break为止
         */
//        System.out.println("请输入星期数：");
//        Scanner sc = new Scanner(System.in);
//        int week = sc.nextInt();
//        switch (week){
//            case 1:
//                System.out.println("跑步");
//                break;
//            case 2:
//                System.out.println("游泳");
//                break;
//            case 3:
//                System.out.println("慢走");
//                break;
//            case 4:
//                System.out.println("动感单车");
//                break;
//            case 5:
//                System.out.println("拳击");
//                break;
//            case 6:
//                System.out.println("爬山");
//                break;
//            case 7:
//                System.out.println("好好吃一顿");
//                break;
//            default:
//                System.out.println("输入错误");
//        }
//        switch 新特性
        int number = 10;
        switch (number){
            case 1 -> System.out.println("一");

            case 2 -> System.out.println("二");

            case 3 -> System.out.println("三");

            default -> System.out.println("其他");
        }
    }
}
