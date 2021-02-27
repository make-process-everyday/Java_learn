package com.kkb2;

class Student {
    private String name;
    private int age;

    // 类变量，记录学生学习的学校
    public static String school = "开课吧";

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //定义static修饰的方法
    public static void method2(){
        System.out.println("这是Student类中的静态方法...");
    }

    // 打印属性值
    public void show() {
        System.out.println("name=" + name + ", age=" + age + ", school=" + school );
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class StaticDemo{
    public static void main(String[] args) {
        //创建一个Student对象
        Student s1 = new Student("热巴", 26);
        Student s2 = new Student("娜扎", 22);

        //使用类名.变量名的方式 修改school
        Student.school = "B站学习";
        //s1.school = "优酷平台";

        s1.show();
        s2.show();

        //调用静态方法 使用类名.静态方法名 调用
        Student.method2();
        //s2.method2();
    }
}