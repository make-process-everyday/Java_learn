package com.kkb2;

/**
 * 静态代码块
 */

class Person{
    private String name;
    private int age;

    //静态变量
    private static String city;

    //静态代码块
    static {
        System.out.println("静态代码块执行了..");
        //为city赋值
        city = "北京";
    }

    //构造方法
    public Person(){
        System.out.println("构造方法执行了....");
    }

    public String show() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        System.out.println( p.show() );
        System.out.println( p2.show() );
        System.out.println( p3.show() );
    }
}
