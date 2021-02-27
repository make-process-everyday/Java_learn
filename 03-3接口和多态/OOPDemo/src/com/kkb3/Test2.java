package com.kkb3;

/**
 * 多态中的 类型转换 (引用数据类型的向下类型)
 */
public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        //Animal animal = new Cat();
        animal.eat();

        //如果想使用子类中 特有的方法, 必须要向下转型
        //int num = (int)5.5;

        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }

    }
}
