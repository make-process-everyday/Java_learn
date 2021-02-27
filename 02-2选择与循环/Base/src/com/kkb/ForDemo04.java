package com.kkb;

/**
 * 循环嵌套
 * for(){
 *     for(){}
 * }
 */
public class ForDemo04 {
    public static void main(String[] args) {
        //打印 2021年 - 2023年之间的 每一个月份
        //外层循环 代表的年份
        for (int i = 2021; i <= 2023; i++) {
            System.out.println("年份i = " + i);
            //内层循环表示 月份
            for (int j = 1; j <= 12; j++) {
                System.out.println("---------- 年份 "+ i +"月份 j = " + j);
            }
        }
    }

}
