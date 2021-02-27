package com.kkb7;

/**
 * 继承的特点
 * java的类 只支持单继承, 不支撑多继承
 * Java支撑多层继承
 */


//java的类 只支持单继承, 不支撑多继承
//Java支撑多层继承
class A extends Object {} // A 理解为爷爷
class B extends A{} //B 理解为爸爸
class C extends B{} //C 理解为孙子

//class D extends C,B{} //这种继承是错误的, 在java中

public class ExtendsDemo7 {
}
