package com.kkb2;

/**
 * 方法的重载
 */
public class Demo05 {
    public static void main(String[] args) {
        //定义不同数据类型的变量
        byte a = 10;
        byte b = 20;

        short c = 10;
        short d = 20;

        int e = 10;
        int f = 10;

        long g = 10;
        long h = 20;

        //调用方法
        compare(a, b);
        compare(c, d);
        compare(e, f);
        compare(g, h);
    }

    //参数为 long类型的方法
    public static boolean compare(long x, long y) {
        System.out.println("执行了参数为long类型的方法....");
        return x == y;
    }

    //参数为 int类型的方法
    public static boolean compare(int x, int y) {
        System.out.println("执行了参数为int类型的方法....");
        return x == y;
    }

    //参数为 short类型的方法
    public static boolean compare(short x, short y) {
        System.out.println("执行了参数为short类型的方法....");
        return x == y;
    }

    //参数为 byte类型的方法
    public static boolean compare(byte x, byte y) {
        System.out.println("执行了参数为byte类型的方法....");
        return x == y;
    }
}
