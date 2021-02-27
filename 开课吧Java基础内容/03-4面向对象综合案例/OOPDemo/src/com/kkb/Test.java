package com.kkb;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建一个对象, 使用方法
        InterfaceImpl faceName = new InterfaceImpl();
        faceName.method();
        //调用接口中的默认方法
        faceName.method1();
        //调用接口中的静态方法
        InterFaceName.method2();
    }
}
