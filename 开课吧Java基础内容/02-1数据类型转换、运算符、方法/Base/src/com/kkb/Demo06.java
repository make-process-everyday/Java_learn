package com.kkb;

/**
 * 赋值运算符
 */
public class Demo06 {
    public static void main(String[] args) {
        int n = 5;

        n += 5.5;  //n = (int)(n+5.5);

        //soutv
        System.out.println("n = " + n);


        short s = 1;

        //强制类型转换
        //s = (short)(s + 1);
        s += 1;

        System.out.println("s = " + s);
    }
}
