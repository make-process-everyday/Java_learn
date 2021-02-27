package com.kkb1;

/**
 * 手机类的测试
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建一个 手机对象
        Phone p = new Phone();
        //打印手机对象的属性
        System.out.println(p.brand); //null
        System.out.println(p.price); //0
        System.out.println(p.color); //null

        //为手机对象的属性 赋值
        p.brand = "华为p40";
        p.price = 3999;
        p.color = "白色";

        System.out.println(p.brand); // 华为p40
        System.out.println(p.price); // 3999
        System.out.println(p.color); // 白色

        //调用 对象的方法
        p.sendMessage();
        p.callPhone("热巴");
    }
}
