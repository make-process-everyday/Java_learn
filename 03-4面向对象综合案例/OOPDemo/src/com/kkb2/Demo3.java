package com.kkb2;

interface A3 {
    public static void inter(){
        System.out.println("A3 接口静态方法");
    }
}

interface B3{
    public static void inter(){
        System.out.println("B3接口静态方法");
    }
}

class C3 implements A3, B3{

}

public class Demo3 {
    public static void main(String[] args) {
        A3.inter();

        B3.inter();
    }
}
