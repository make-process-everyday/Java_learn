package com.kkb4;

public class Test {
    public static void main(String[] args) {
        //创建一个匿名内部类
        Flyable fly = new Flyable(){
            //实现接口所有的抽象方法
            @Override
            public void fly() {
                System.out.println("飞机正在飞....");
            }
        };

        fly.fly();
        fly.fly();
        fly.fly();


    }
}
