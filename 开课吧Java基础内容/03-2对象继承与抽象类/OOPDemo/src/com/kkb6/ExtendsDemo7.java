package com.kkb6;

/**
 * 继承后的特点——构造方法
 *
 * 1. 构造方法的名字是与类名一致的。所以子类是无法继承父类构造方法的。
 * 2. 构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。
 * 子类的构造方法中默认有一个super() ，表示调用父类的构造方法，父类成员变量初始化后，才可以给子类使用
 */

class Fu {
    //成员变量私有
    private int n;
    //构造方法
    public Fu(){
        System.out.println("Fu()");
    }
    //带有参数的构造方法
    public Fu(int n){
        this.n = n;
    }

    public int getN(){
        return n;
    }

}
class Zi extends Fu {
    //构造方法
    public Zi(){
        //super();//，调用父类 空参数的构造方法
        super(50); //调用父类 有参数的构造方法

        System.out.println("Zi（）");
    }
}

public class ExtendsDemo7 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        int num = zi.getN();
        System.out.println("num = " + num);
    }
}
