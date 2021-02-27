package com.kkb2;

/**
 * 演示 java中的四种 访问权限修饰符
 *
 */
public class AccessDemo {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        demo.privateMethod();
    }


    //public 修饰的方法
    public void publicMethod(){
        System.out.println("public 修饰的方法....");
    }
    //protected修饰的方法
    protected void protectedMethod(){
        System.out.println("protected 修饰的方法....");
    }
    //default修饰的方法 (当方法 不加权限方法修饰符时, 默认的修饰符 Default)
    void defaultMethod(){
        System.out.println("default 修饰的方法....");
    }
    //private 修饰的方法
    private void privateMethod(){
        System.out.println("private 修饰的方法....");
    }
}
