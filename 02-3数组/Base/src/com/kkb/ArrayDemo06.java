package com.kkb;

public class ArrayDemo06 {
    public static void main(String[] args) {
        // 定义变量
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b);// a:10,b:20
        change(10, 20);
        System.out.println("a:" + a + ",b:" + b);// a:10,b:20
    }

    public static void change(int a, int b) { // a=10,b=20
        System.out.println("a:" + a + ",b:" + b);// a:10,b:20
        a *= 10; // a=100;
        b *= 10;// b=200;
        System.out.println("a:" + a + ",b:" + b);// a:100,b:200
    }
}
