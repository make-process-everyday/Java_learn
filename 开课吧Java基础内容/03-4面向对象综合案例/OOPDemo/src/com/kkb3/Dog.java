package com.kkb3;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头....");
    }

    //特有功能
    public void watchHouse() {
        System.out.println("看家");
    }
}
