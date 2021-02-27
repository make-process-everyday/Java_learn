package com.kkb9;

/**
 * 开发者(抽象类)
 */
public abstract class Developer extends Employee {
    //构造方法
    public Developer() {
        super();
    }

    public Developer(String id, String name) {
        super(id, name);
    }

    //有自己的抽象方法
    public abstract void Develop();
}
