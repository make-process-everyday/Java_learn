package com.kkb;

/**
 * 定义了一个接口
 */
public interface InterFaceName {
    //定义一个抽象方法
    public abstract void method();

    //默认方法 使用default修饰
    public default void method1(){
        System.out.println("我是接口中的默认方法");
    }

    //静态方法: 使用 static修饰
    public static void method2(){
        System.out.println("我是接口中的静态方法");
    }
}
