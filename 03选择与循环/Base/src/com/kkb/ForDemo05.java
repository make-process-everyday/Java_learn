package com.kkb;

/**
 * 练习
 */
public class ForDemo05 {
    public static void main(String[] args) {
        //printNum(100);

        printImage();
    }

    //练习二: 打印出5行 由@符号 组成的 三角形
    //System.out.print("@");   打印数据, 但不换行
    //System.out.println("@"); 打印数据, 会换行
    public static void printImage(){
        for (int i = 1; i <= 5; i++) {
            // i = 1 , 2 ,3, 4,5
            for (int j = 1; j <= i ; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    //练习一: 打印出1-100之间 既是3的倍数 又是 5的倍数的数字
    public static void printNum(int n){
        for (int i = 1; i <= n; i++) {
            //3的倍数 又是 5的倍数的数字
            if(i%3==0 && i%5==0){
                System.out.println("i = " + i);
            }
        }
    }
}
