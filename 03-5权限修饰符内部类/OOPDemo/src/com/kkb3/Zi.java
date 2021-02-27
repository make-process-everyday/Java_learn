package com.kkb3;

import com.kkb2.AccessDemo;

/**
 * 权限修饰符访问 (在不同包中的 子父类中的情况)
 */
public class Zi extends AccessDemo {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.publicMethod();
        zi.protectedMethod();
        //zi.defaultMethod();
        //zi.privateMethod();

        //AccessDemo demo = new AccessDemo();
        //demo.publicMethod();
        //demo.protectedMethod();
        //demo.defaultMethod();
        //demo.privateMethod();
    }
}
