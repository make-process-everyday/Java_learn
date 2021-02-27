package com.kkb2;

interface A2 {
    public default void methodA(){
        System.out.println("A2...methodA...");
    }
    public default void method(){
        System.out.println("A2....method...");
    }
}

interface B2 {
    public default void methodB(){
        System.out.println("B2....methodB");
    }
    public default void method(){
        System.out.println("B2....method");
    }
}

class C2 implements A2, B2{
    //c2类 集成method方法时, 懵逼了, 不知道我该继承的A2接口中的方法  还是 B2接口中的方法, 解决方案: C2类自己重写method方法
    @Override
    public void method() {
        System.out.println("C2类的method...");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        C2 c2 = new C2();
        c2.method();
        c2.methodA();
        c2.methodB();
    }
}
