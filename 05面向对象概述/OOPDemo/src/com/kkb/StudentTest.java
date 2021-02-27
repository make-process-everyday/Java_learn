package com.kkb;

/**
 * 学生类的 测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建一个 学生对象
        Student stu = new Student();

        System.out.println(stu.name); //null
        System.out.println(stu.age); // 0

        //为stu对象中的属性赋值
        stu.name = "热巴";
        stu.age = 26;

        System.out.println(stu.name); //热巴
        System.out.println(stu.age); // 26

        //调用对象的功能方法
        stu.eat();
        stu.study();
    }
}
