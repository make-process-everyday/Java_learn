package com.kkb3;

/**
 * 继承后的特点——非私有成员方法
 * 成员方法不重名
 * 如果子类父类中出现不重名的成员方法，这时的调用是没有影响的
 */

class Fu{
    public void show(){
        System.out.println("Fu类中的show方法执行");
    }
}
class Zi extends Fu{
    public void show2(){
        System.out.println("Zi类中的show2方法执行");
    }
}

public class ExtendsDemo4 {
    public static void main(String[] args) {
        //创建对象
        Zi zi = new Zi();
        zi.show();
        zi.show2();
    }
}
