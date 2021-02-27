package com.kkb2;

/**
 * 方法练习
 */
public class Demo06 {
    public static void main(String[] args) {
        //调用方法
        printNumber(5678);
    }

    //定义一个方法, 接收int参数, 把参数值的个位,十位, 百位,千位数值打印出来
    public static void printNumber(int num){
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;
        System.out.println("ge = " + ge);
        System.out.println("shi = " + shi);
        System.out.println("bai = " + bai);
        System.out.println("qian = " + qian);
    }
}
