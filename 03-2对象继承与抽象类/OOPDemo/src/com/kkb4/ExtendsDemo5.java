package com.kkb4;

/**
 * 成员方法重名——重写(Override)
 * 如果子类父类中出现重名的成员方法，这时的访问是一种特殊情况，叫做方法重写 (Override)。
 *
 * 方法重写(方法覆盖) ：
 * 子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），
 * 会出现覆盖效果，也称为重写或者复写。声明不变，重新实现。
 */

class Fu {
    public void show() {
        System.out.println("Fu show");
    }
}
class Zi extends Fu {
    //子类重写了父类的show方法
    public void show() {
        System.out.println("Zi show");
    }

    public void method(){
        //调用本类方法 (this可以省略的)
        this.show();
        //调用父类方法
        super.show();
    }
}

public class ExtendsDemo5 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        //zi.show();
        zi.method();
    }
}
