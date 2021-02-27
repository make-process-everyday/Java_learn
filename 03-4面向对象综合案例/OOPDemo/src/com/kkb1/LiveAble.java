package com.kkb1;

/**
 * 接口: 活着的 有生命的
 */
public interface LiveAble {
    //定义变量
    final int num = 100;
    //
    public static final int num2 = 100;


    //定义两个抽象方法
    public abstract void eat();
    public abstract void sleep();

    //定义了一个默认方法
    public default void fly(){
        System.out.println("天上飞");
    }

    //定义了一个静态方法
    public static void run(){
        System.out.println("跑起来~~~");
    }
}
