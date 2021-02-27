package com.kkb2;

/**
 * 带有返回值的方法
 */
public class Demo04 {
    public static void main(String[] args) {
        //调用getSum方法, 把方法结果 赋值为变量sum
        int sum = getSum(5,8);
        System.out.println("sum = " + sum);

    }

    //定义一个方法, 接收2个int参数, 将相加的结果返回
    public static int getSum(int x , int y){
        //int n = x + y;
        //return n;

        return x+y;
    }
}
