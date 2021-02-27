package com.kkb1;

/**
 * 定义一个类, 实现有生命的接口
 */
public class Animal implements LiveAble {
    @Override
    public void eat() {
        System.out.println("正在吃晚餐...");
    }

    @Override
    public void sleep() {
        System.out.println("正在呼呼的睡大觉...");
    }

    //重新接口中的默认方法
    @Override
    public void fly() {
        System.out.println("Animal中有些小动物不能飞...");
    }
}
