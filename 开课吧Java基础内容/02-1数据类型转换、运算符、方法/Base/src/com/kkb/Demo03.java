package com.kkb;

/**
 * 数据类型转换( 自动转换)
 */
public class Demo03 {
    public static void main(String[] args) {
        int i = 1;
        double d = 2.5;
        //int类型和double类型运算，结果是double类型
        //int类型会提升为double类型
        double e = d+i;
        System.out.println(e);

        byte b1 = 100;
        short s1 = 123;
        //short y = b1 + s1;
    }
}
