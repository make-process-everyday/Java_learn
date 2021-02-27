package com.kkb;

public class Demo11 {
    public static void main(String[] args)  {
        int x = 4;
        int y = 4;
        //System.out.println((x++ > 4) & (y++ > 5)); // false两个表达式都会运算
        //System.out.println(x); // 5
        //System.out.println(y); // 5

        System.out.println((x++ > 4) && (y++ > 5)); // false 左边结果为false，右边不参与运算
        System.out.println(x); // 5
        System.out.println(y); // 4
    }
}
