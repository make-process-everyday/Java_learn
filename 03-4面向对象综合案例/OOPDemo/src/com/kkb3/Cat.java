package com.kkb3;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫喜欢吃鱼...");
    }

    //特有功能
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
