package com.kkb9;

/**
 * JavaEE工程师
 */
public class JavaEE extends Developer {

    //构造方法 Alt + insert
    public JavaEE() {
        super();
    }

    public JavaEE(String id, String name) {
        super(id, name);
    }

    //实现所有的抽象方法
    @Override
    public void work() {
        System.out.println("员工号为"+ getId() +"的 "+ getName() +"员工，正在研发淘宝网站");
    }

    @Override
    public void Develop() {

    }
}
