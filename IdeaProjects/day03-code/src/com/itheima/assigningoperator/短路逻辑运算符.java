package com.itheima.assigningoperator;

public class 短路逻辑运算符 {
    public static void main(String[] args) {
        // 1.&&
        // 运算结果跟单个&是一样的
        // 表示两边都为真，结果才是真
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        // 2.||
        // 运算结果跟单个|是一样的
        // 表示两边只要有一个为真，结果就是真
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // 3.短路逻辑运算符具有短路效果
        // 简单理解：当左边的表达式能确定最终的结果，那么右边就不参与运行了
        int a = 10;
        int b = 20;
        boolean result = ((++a < 10) && (++b < 10));
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        // 4.总结
        // 注意事项：无论左边true false，右边都要执行
        // && || 具有短路效果，左边表达式能确定最终结果，右边不执行

    }
}
