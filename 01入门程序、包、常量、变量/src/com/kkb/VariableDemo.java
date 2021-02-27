package com.kkb;

/**
 * 演示各种类型的变量
 *
 * 格式:
 *    数据类型 变量名 = 数值;
 */
public class VariableDemo {
    public static void main(String[] args) {
        //byte 字节型变量
        byte b = 100;
        //soutv
        b = 123;
        System.out.println("b = " + b);

        //short 短整型变量
        short s = 12345;
        System.out.println("s = " + s);

        //int 整形变量
        int i = 9999;
        System.out.println("i = " + i);

        //long 长整形变量 , 必须数据后面 + 字母L
        long l = 123456789012L;
        System.out.println("l = " + l);

        //float 单精度浮点数 (7位有效小数), 必须数据后面 + 字母F
        float f = 3.141414141F;
        System.out.println("f = " + f);

        //double 双精度浮点数(15位有效小数)
        double d = 13.999999;
        System.out.println("d = " + d);

        //char 字符型变量
        char ch = 'A';
        ch = '0';
        System.out.println("ch = " + ch);

        //boolean 布尔类型变量
        boolean bool = true;
        System.out.println("bool = " + bool);

        //字符串变量
        String str = "我是字符串";
        str = "猜猜我是谁";
        System.out.println("str = " + str);

    }
}
