package com.kkb3;

public class Test {
    public static void main(String[] args) {
        //普通用法, 不是多态
        Dog dog = new Dog();
        show(dog);
        Cat cat = new Cat();
        show(cat);

        //多态的用法
        Animal a1 = new Dog();
        show(a1);

        //多态的用法
        Animal a2 = new Cat();
        show(a2);
    }

    //打印动物吃东西的方法
    public static void show(Animal animal){ // Animal animal = a2
        animal.eat();
    }

    /*
    //打印狗吃东西的方法
    public static void show(Dog dog){
        dog.eat();
    }
    //打印猫吃东西的方法
    public static void show(Cat cat){
        cat.eat();
    }
    */
}
