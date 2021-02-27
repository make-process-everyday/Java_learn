package com.kkb;

/**
 * 数组操作的常见问题
 *
 *  数组越界异常
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //定义一个数组
        char[] charArray = {'h','e','l','l','o'};
        //                   0   1   2   3   4
        //获取数组中  索引为 1的元素值
        System.out.println("charArray索引为 1的元素值 = " + charArray[1]);
        //获取数组中  索引为 5的元素值
        System.out.println("charArray索引为 5的元素值 = " + charArray[5]);
    }
}
