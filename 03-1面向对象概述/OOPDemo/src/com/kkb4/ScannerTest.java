package com.kkb4;

import java.util.Scanner;

/**
 * Scanner类 接收键盘输入的数据
 */
public class ScannerTest {
    public static void main(String[] args) {
        //创建一个Scanner对象
        //System.in 从键盘输入数据
        Scanner scanner = new Scanner(System.in);
        //调用对象中提供的方法 ( 用于接收 int类型数据)
        //int num = scanner.nextInt();
        //System.out.println("num = " + num);

        //用于接收 String类型的数据
        String str = scanner.next();
        System.out.println("str = " + str);
    }
}
