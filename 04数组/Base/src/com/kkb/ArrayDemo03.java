package com.kkb;

/**
 * 数组常见的异常
 *
 * 空指针异常 NullPointerException
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //定义一个数组
        char[] charArray = {'h','e','l','l','o'};
        //                   0   1   2   3   4
        System.out.println("charArray索引为1的元素值 = " + charArray[1]);


        //定义一个数组, 但是不给数组赋值
        charArray = null;
//        System.out.println("charArray索引为1的元素值 = " + charArray[0]);
    }
}
