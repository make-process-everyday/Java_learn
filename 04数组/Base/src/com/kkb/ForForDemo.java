package com.kkb;

/**
 * @Author likepei
 * @Date 2020/6/18 20:34
 * @Version v1.0
 * @Description 介绍一下 continue break, return的作用
 *
 * continue
 * 在循环语句中，结束当前for循环中的本次循环操作，继续下一次的循环操作
 *
 * break
 * 在循环语句中，结束当前for循环，执行for循环后续操作
 *
 * return
 * 结束当前方法执行，返回方法调用处 执行后续操作
 */
public class ForForDemo {
    public static void main(String[] args) {
        System.out.println("==========开始==========");
        printDate();
        System.out.println("==========结束==========");
    }

    //日期打印
    public static void printDate() {
        //打印 2021年 - 2023年之间的 每一个月份
        //外层循环 代表的年份
        for (int i = 2021; i <= 2023; i++) {
            System.out.println("年份i = " + i);
            //内层循环表示 月份
            for (int j = 1; j <= 12; j++) {
                if(j == 5){
                    //continue;
                    //break;
                    return;
                }
                System.out.println("---------- 年份 "+ i +"月份 j = " + j);
            }
        }
    }

}
