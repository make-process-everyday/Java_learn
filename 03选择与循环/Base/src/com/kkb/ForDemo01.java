package com.kkb;

/**
 * 演示 for循环
 */
public class ForDemo01 {
    public static void main(String[] args) {

        //打印 5次 helloworld
        for (int i=0; i<37; i++) {
            System.out.println("helloWorld ===" + i);
        }

        System.out.println("=============");

        //调用方法, 打印10次helloworld
        printHello( 10 );

        System.out.println("=============");
        //调用方法, 打印10次helloworld
        printHello( 15 );

    }

    //定义一个方法, 打印n次 helloworld
    public static void printHello(int n){
        for (int i=0; i<n; i++) {
            System.out.println("helloWorld ===" + i);
        }
    }
}
