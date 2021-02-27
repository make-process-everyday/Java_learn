package com.kkb;

/**
 * 自增自减运算符
 *
 * 变量前++ ：先给自己加1 , 然后再参与其他操作。
 * 例如 : 下面代码中变量a自己加1，将加1后的结果赋值给b，也就是说a先计算。a和b的结果都是2。
 *
 * 变量后++ ：先参与其他操作 , 然后再给自己加1。
 * 例如 : 下面代码中变量a先把自己的值赋值给变量b，此时变量b的值就是1，然后变量a自己再加1。a的结果是2，b的结果是1。
 */
public class Demo08 {
    public static void main(String[] args) {

        int n = 5;

        //int m = ++n; // n =6 , m=6
        int m = n++; //   n =6 , m=5

        System.out.println("m = " + m);
        System.out.println("n = " + n);

    }
}
