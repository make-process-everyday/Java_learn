package com.kkb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过Class对象， 使用Constructor的相关方法 来完成Student对象的创建
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Student的class对象
        Class clazz = Class.forName("com.kkb.Student");
        //获取Student类中 所有的public修饰的构造方法
        Constructor[] students = clazz.getConstructors();
        for (Constructor student : students) {
            System.out.println("student = " + student);
        }

        //方式一： 获取指定的构造方法
        //获取空参数的构造方法
        Constructor constructor = clazz.getConstructor();
        System.out.println("constructor = " + constructor);
        //使用空参数的构造方法，创建对象
        Object stduent = constructor.newInstance();
        System.out.println("stduent = " + stduent);

        //方式二： 获取带参数的构造方法
        Constructor constructor2 = clazz.getConstructor(String.class, int.class);
        System.out.println("constructor2 = " + constructor2);
        //使用带参数的构造方法， 创建对象
        Object student2 = constructor2.newInstance("热巴", 26);
        System.out.println("student2 = " + student2);
    }
}
