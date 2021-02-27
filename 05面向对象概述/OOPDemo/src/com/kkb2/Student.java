package com.kkb2;

/**
 * 定义一个学生类
 */
public class Student {
    //属性, 成员变量
    private String name;//姓名
    private int age;//年龄

    //创建一个构造方法
    public Student(){
        System.out.println("空参数构造方法...");
    }
    //创建一个带有参数的构造方法
    public Student(String name, int age){
        System.out.println("有参数的构造方法执行了...");
        //为成员变量name,age赋值
        this.name = name;
        this.age = age;
    }



    //为private修饰的方法 提供 getXxx方法  setXxx方法
    //getXxx用于获取 成员变量的值
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //setXxx用于给 成员变量赋值
    public void setName(String name){
        this.name = name;

        //调用 getName方法
        //getName();
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }


    //功能, 成员方法
    //具备 吃饭的功能
    public void eat(){
        System.out.println("正在吃饭....");
    }

    //具备 学习的功能
    public void study(){
        System.out.println("正在学习中....");
    }
}
