package com.kkb2;

/**
 * 在同一个包中 演示权限修饰符的访问情况
 */
public class Test {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();

        //demo.privateMethod();
    }
}
