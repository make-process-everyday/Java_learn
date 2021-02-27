package com.kkb3;

/**
 * 手机类的测试
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建一个 手机对象
        Phone p = new Phone();
        //打印手机对象的属性
        System.out.println(p.getBrand()); //null
        System.out.println(p.getPrice()); //0
        System.out.println(p.getColor()); //null

        //为手机对象的属性 赋值
        p.setBrand("华为p40");
        p.setPrice(2999);
        p.setColor("金色");

        System.out.println(p.getBrand()); //华为p40
        System.out.println(p.getPrice()); //2999
        System.out.println(p.getColor()); //金色

        //调用 对象的方法
        p.sendMessage();
        p.callPhone("热巴");
    }
}
