package com.kkb3;

import com.kkb2.AccessDemo;

/**
 * 权限修饰符的方法访问测试
 */
public class Test {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        demo.publicMethod();
        //demo.protectedMethod();
        //demo.defaultMethod();
        //demo.privateMethod();
    }
}
