package com.kkb8;


/**
 * 定义一个抽象类
 */
abstract class Employee {
    //定义成员变量
    private String name;

    //定义一个普通方法 getName
    public String getName(){
        return name;
    }

    //定义一个抽象方法
    public abstract void work();
    ///public abstract void work2();

    public Employee(){
        System.out.println("父类中的构造方法");
    }

    public Employee(String name){
        System.out.println("父类中的有参数的构造方法执行了...");
        this.name = name;
    }
}

//定义一个Teacher类 继承 抽象类
abstract class Teacher extends Employee{

    public Teacher(){
        //调用父类的构造方法
        super("热巴");
        System.out.println("子类中的构造方法");
    }


    //@Override 这个标示 代表父类方法的重写(覆盖)
    //@Override
    public void work() {
        System.out.println("霈哥正在讲课...");
    }

}


public class AbstractDemo {
    public static void main(String[] args) {
        //Teacher teacher = new Teacher();
        //System.out.println( teacher.getName() );
        //teacher.work();

        //Employee employee = new Employee();
    }
}
