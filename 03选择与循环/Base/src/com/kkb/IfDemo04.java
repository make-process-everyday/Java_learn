package com.kkb;

import java.util.Scanner;

public class IfDemo04 {
    public static void main(String[] args) {
        System.out.println("开始");
        // 需求：键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日
        System.out.println("请输入一个星期数(1~7)：");
        Scanner scanner = new Scanner(System.in);
        int week = scanner.nextInt(); //只能用来 接收键盘输入的一个整数

        //int week = 3; //这里目前没采用键盘录入方式赋值

        if(week == 1) {
            System.out.println("星期一");
        } else if(week == 2) {
            System.out.println("星期二");
        } else if(week == 3) {
            System.out.println("星期三");
        } else if(week == 4) {
            System.out.println("星期四");
        } else if(week == 5) {
            System.out.println("星期五");
        } else if(week == 6) {
            System.out.println("星期六");
        } else if(week == 7) {
            System.out.println("星期日");
        }else {
            System.out.println("数字有误");
        }
        System.out.println("结束");
    }
}
