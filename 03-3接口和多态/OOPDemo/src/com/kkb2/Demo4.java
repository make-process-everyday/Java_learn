package com.kkb2;

interface A4 {
    public default void method(){
        System.out.println("AAAAAAAAAAAAAAAAAAA");
    }
}

interface B4 {
    public default void method(){
        System.out.println("BBBBBBBBBBBBBBBBBBB");
    }
}

interface C4 extends A4, B4{
    @Override
    default void method() {
        System.out.println("CCCCCCCCCCCCCCCCCCC");
    }
}

public class Demo4 {
}
