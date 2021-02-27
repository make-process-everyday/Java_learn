package com.kkb;

/**
 * for循环的练习
 *
 */
public class ForDemo02 {
    public static void main(String[] args) {
        //在控制台输出打印 1-5
        printNum(5);
        //System.out.println("-------------");
        //printNum2(5);
        //System.out.println("-------------");
        //求 1-n之间数据之和,把累加和结果 输出打印
        //printSum(100);
        //求1-n之间的偶数的累加和 , 把累加的结果打印在控制台
        //printSum2(100);
    }

    //练习3: 求1-n之间的偶数的累加和 , 把累加的结果打印在控制台
    public static void printSum2(int n){
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            //偶数的累加和
            if ( i % 2 == 0) {
                sum += i;
            }

        }

        System.out.println("sum = " + sum);
    }


    //练习2 : 求 1-n之间数据之和,把累加和结果 输出打印
    public static void printSum(int n){
        //定义一个存放累加值的变量 sum
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; //sum = sum + i;
        }

        System.out.println("sum = " + sum);
    }

    //练习1: 在控制台输出打印 1-5
    public static void printNum(int n){
        //fori
        //变量名.fori
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
        }
    }

    //练习1: 在控制台输出打印 5-1
    public static void printNum2(int n){
        ////变量名.forr
        for (int i = n; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }
}
