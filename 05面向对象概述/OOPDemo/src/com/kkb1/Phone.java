package com.kkb1;

/**
 * 定义一个手机类
 */
public class Phone {
    //属性,成员变量
    String brand; //品牌
    int price; //价格
    String color;//颜色

    //功能, 成员方法
    //发短信
    public void sendMessage(){
        System.out.println("正在发短信");
    }

    //打电话
    public void callPhone(String name){
        System.out.println("霈哥 正在打电话给..." + name);
    }
}
