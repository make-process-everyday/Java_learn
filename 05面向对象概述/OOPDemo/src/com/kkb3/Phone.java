package com.kkb3;

/**
 * 定义一个手机类 Javabean
 */
public class Phone {
    //属性,成员变量
    private String brand; //品牌
    private int price; //价格
    private String color;//颜色

    //功能, 成员方法
    //发短信
    public void sendMessage(){
        System.out.println("正在发短信");
    }

    //打电话
    public void callPhone(String name){
        System.out.println("霈哥 正在打电话给..." + name);
    }

    //构造方法
    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //setXxx,  getXxx
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
