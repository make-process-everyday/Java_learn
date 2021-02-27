package com.kkb4;

import java.util.Random;

/**
 * Random类 用于获取随机数字的类
 */
public class RandomTest {
    public static void main(String[] args) {
        //创建一个Random对象

        //代码提示 Alt+/
        //补充代码末位的;  Ctr了+ shift + Enter
        Random random = new Random();

        //获取一个随机数
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(10);
            System.out.println("num = " + num);
        }

    }


}
