package com.kkb;

/**
 * 接口的实现类
 * 类实现接口, 需要将接口中的所有抽象方法 进行重写
 */
public class InterfaceImpl implements InterFaceName {

    @Override
    public void method() {
        System.out.println("类中的method方法");
    }
}
