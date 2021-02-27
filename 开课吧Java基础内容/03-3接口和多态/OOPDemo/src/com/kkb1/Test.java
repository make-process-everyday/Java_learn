package com.kkb1;

public class Test {
    public static void main(String[] args) {
        //创建Animal对象,调用方法
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.fly();

        //调用接口中的静态方法
        LiveAble.run();

        //调用接口中的变量 ( 接口中的变量 必须通过接口名.变量 的方法访问)
        System.out.println( LiveAble.num );
    }
}
