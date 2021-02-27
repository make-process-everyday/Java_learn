package com.kkb2;

/**
 * 学生类的 测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建一个 学生对象
        //Student stu = new Student();
        Student stu = new Student("拉拉", 20);

        System.out.println(stu.getName()); //null
        System.out.println(stu.getAge()); // 0

        //为stu对象中的属性赋值
        stu.setName("热巴");
        stu.setAge(26);

        System.out.println(stu.getName()); //热巴
        System.out.println(stu.getAge()); // 26

        //调用对象的功能方法
        stu.eat();
        stu.study();
    }
}
