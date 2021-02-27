package com.kkb2;

/**
 * 编写 带参数的方法
 */
public class Demo03 {
    public static void main(String[] args) {
        //调用方法
        printSum(3,5);
        printSum(5,8);
    }

    //定义一个方法 用于接收两个int参数, 把相加的结果打印出来
    public static void printSum(int x , int y){
        int sum = x + y;
        System.out.println("sum = " + sum);
    }
}
