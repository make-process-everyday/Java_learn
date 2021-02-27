package com.kkb;

/**
 * 继承的格式
 */

//父类 员工类
class Employee {
    //成员变量
    String name;

    //成员方法
    public void work(){
        System.out.println("正在工作....");
    }
}

//子类  教师类 继承  员工类
class Teacher extends Employee{

    //定义成员方法  讲法
    public void teach(){
        System.out.println( name + "正在讲Java...");
    }
}

/**
 * 测试类
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        //创建一个教师对象
        Teacher t = new Teacher();
        //为 对象 赋值name
        t.name = "热巴";
        //调用
        t.teach();
        t.work();
    }
}
