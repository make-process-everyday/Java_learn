package com.kkb9;

/**
 * 员工类 (抽象类)
 */
public abstract class Employee {
    //成员变量
    private String id;
    private String name;

    //构造方法
    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //set,get方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Alt + insert
    //普通方法(抽象方法)
    public abstract void work();
}
