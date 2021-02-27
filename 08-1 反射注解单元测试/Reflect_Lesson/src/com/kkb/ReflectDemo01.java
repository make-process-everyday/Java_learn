package com.kkb;

/**
 * 获取Class对象的方式
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一： 获取指定字符串路径获取
        Class clazz1 = Class.forName("com.kkb.Student");
        System.out.println("clazz1 = " + clazz1);

        //方式二， 通过类名的属性class获取
        Class clazz2 = Student.class;
        System.out.println("clazz2 = " + clazz2);

        //方式三， 通过对象的getCLass（）方法获取
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println("clazz3 = " + clazz3);
    }
}
