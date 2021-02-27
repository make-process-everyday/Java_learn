package com.kkb;

/**
 * 三元运算符
 *  数据类型 变量名 = 布尔类型表达式？结果1：结果2
 */
public class Demo12 {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;

        int max = (a>b ? a : b);//max赋值为 a，b中较大的值
        System.out.println(max);//200

        int min = (a<b ? a : b);//min赋值为 a，b中较小的值
        System.out.println(min);//100

        String result = (a == b ? "相等" : "不相等");
        System.out.println("result = " + result);
    }
}
