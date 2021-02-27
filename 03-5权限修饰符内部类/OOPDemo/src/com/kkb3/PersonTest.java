package com.kkb3;

/**
 * 演示内部类的访问
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建一个Person对象
        Person p = new Person();
        // 创建p对象的心脏
        Person.Heart heart = p.new Heart();

        //查询person对象的心跳情况
        heart.jump();

        //改变person中的 live生命的状况
        p.setLive(false);

        // 查询person对象的心跳情况
        heart.jump();
    }
}
