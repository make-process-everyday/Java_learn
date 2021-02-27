package com.kkb2;

/**
 * 继承后的特点——非私有成员变量
 * 成员变量重名
 * 如果子类父类中出现重名的成员变量，这时的访问是有影响的。
 */

class Fu {
    // Fu中的成员变量。
    int num = 5;
}
class Zi extends Fu {
    // Zi中的成员变量
    int num = 6;

    // Zi中的成员方法
    public void show() {
        // 访问父类中的num， super.变量 访问的是父类中的成员变量
        System.out.println("Fu num="+super.num); // Fu num = 5
        // 访问子类中的num2  this.变量 访问的是本类中的成员变量
        System.out.println("Zi num="+this.num); // Zi num = 6
    }
}

public class ExtendsDemo3 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}
