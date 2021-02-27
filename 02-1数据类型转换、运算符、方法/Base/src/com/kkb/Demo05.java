package com.kkb;

/**
 * 算数运算符
 * + - * / %
 */
public class Demo05 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println( n /1000 * 1000 ); //java中 两个整数相除 结果为整数
        System.out.println( n /1000.0 * 1000 ); //java中 小数参数运算 ,结果为 小数

        int m = 1;
        System.out.println("m+n的结果");
        System.out.println(n + m); // + 两边都是数字时, 加法操作
        System.out.println(n + m + "结果"); // + 两边若出现了 String类型, 数据的相连接的操作
        System.out.println("结果" + n + m); // + 两边若出现了 String类型, 数据的相连接的操作
                           //结果12341

    }
}
