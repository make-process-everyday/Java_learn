package com.kkb1;

/**
 * final关键字的使用
 *
 * 1.final修饰的类, 不能被继承
 * 2.final修饰的方法, 子类不能进行重写, 可以继承过来使用
 * 3.final修饰的变量, 不能被重新赋值
 */

//final class Fu { }
class Fu {
    //使用final修饰
    public final void method(){
        System.out.println("这是父类的方法...");
    }
}

class Zi extends Fu {
    //重写父类中的方法
   /*
   @Override
    public void method() {
        System.out.println("子类重写后的方法...");
    }
    */
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();

        //变量被final所修饰
        final int num = 10;
        //num = 20; 被final修饰的变量 值不能发生改变
        System.out.println("num = " + num);

        final Person p = new Person("晓明");
        //p = new Person("校花");  //被final修饰的变量 值不能发生改变

        p.setName("哈哈");
        System.out.println(p.toString());

    }
}
