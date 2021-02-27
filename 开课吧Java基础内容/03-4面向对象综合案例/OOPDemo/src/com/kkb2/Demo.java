package com.kkb2;

interface A {
    public abstract void showA();
    public abstract void show();
}

interface B {
    public abstract void showB();
    public abstract void show();
}

/**
 *  java中的类 可以实现多个接口
 *  要求类要实现所有接口中的所有抽象方法
 */
class C implements A, B{

    @Override
    public void showA() {
        System.out.println("showA....");
    }

    @Override
    public void showB() {
        System.out.println("showB...");
    }

    @Override
    public void show() {
        System.out.println("show....");
    }
}

public class Demo {
    public static void main(String[] args) {
         C c = new C();
         c.show();
         c.showA();
         c.showB();
    }
}
