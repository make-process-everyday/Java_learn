package com.kkb;

/**
 * 演示 各种类型的常量
 *
 * 整数常量
 * 所有的整数
 * 0，1，  567，  -9
 *
 * 小数常量
 * 所有的小数
 * 0.0，  -0.1，  2.55
 *
 * 字符常量
 * 单引号引起来,只能写一个字符,必须有内容
 * 'a' ，  '好'　
 *
 * 字符串常量
 * 双引号引起来,可以写多个字符,也可以不写
 * "A" ，"Hello" ，"你好" ，""
 *
 * 布尔常量
 * 只有两个值（流程控制中讲解）
 * true ，  false
 *
 * 空常量
 * 只有一个值（引用数据类型中讲解）
 * null
 */
public class ConstDemo {
    // psvm
    public static void main(String[] args){
        //整数常量
        System.out.println(123);
        //小数常量
        System.out.println(3.14);
        //字符常量
        System.out.println('\u0001');
        System.out.println('a');
        //字符串常量
        System.out.println("你好, 霈哥");
        //布尔类型常量
        System.out.println(true);
        System.out.println(false);
        //空常量
        //System.out.println(null);
    }
}
