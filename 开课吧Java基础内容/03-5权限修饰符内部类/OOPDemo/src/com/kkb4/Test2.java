package com.kkb4;

public class Test2 {
    public static void main(String[] args) {
        //匿名内部类 调用方法
        //使用场景:  对象中的方法调用仅使用一次时
        new Flyable(){
            @Override
            public void fly() {
                System.out.println("小鸟正在飞...");
            }
        }.fly();

    }
}
