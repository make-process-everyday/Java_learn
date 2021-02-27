package com.kkb;

/**
 * 继承后的特点——非私有成员变量
 * 成员变量不重名
 * 如果子类父类中出现不重名的成员变量，这时的访问是没有影响的
 */

class Fu {
    // Fu中的成员变量。
    int num = 5;
}
class Zi extends Fu {
    // Zi中的成员变量
    int num2 = 6;

    // Zi中的成员方法
    public void show() {
        // 访问父类中的num，
        System.out.println("Fu num="+num); // 继承而来，所以直接访问。
        // 访问子类中的num2
        System.out.println("Zi num2="+num2);
    }
}

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}
