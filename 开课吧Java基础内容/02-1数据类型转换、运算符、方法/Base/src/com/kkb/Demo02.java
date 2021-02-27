package com.kkb;

/**
 * 数据类型转换( 自动转换)
 */
public class Demo02 {
    public static void main(String[] args) {
        int i = 1;
        byte b = 2;

        //byte x = b + i; // 报错

        //int类型和byte类型运算，结果是int类型
        int j = b + i;
        System.out.println(j);
    }
}
