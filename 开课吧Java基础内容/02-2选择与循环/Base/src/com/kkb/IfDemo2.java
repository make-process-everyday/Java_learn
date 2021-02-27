package com.kkb;

/**
 * 演示if语句的 第二种格式
 */
public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("开始....");

        int a = 20;
        int b = 20;

        //判断 a和b的值 是否相等
        if( a == b) {
            //当a和b的值 相等, 执行下面的代码
            //语句体1
            System.out.println("a等于b");
        } else {
            //当a和b的值 不相等, 执行下面的代码
            //语句体2
            System.out.println("a不等于b");
        }

        System.out.println("结束....");

    }
}
