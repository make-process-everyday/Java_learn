package com.kkb9;

/**
 * 安卓工程师
 */
public class Android extends Developer {
    //构造方法
    public Android() {
        super();
    }

    public Android(String id, String name) {
        super(id, name);
    }

    @Override
    public void Develop() {

    }


    //实现所有的抽象方法
    @Override
    public void work() {
        System.out.println("员工号为"+ getId() +"的 "+ getName() +"员工，正在研发淘宝手机客户端软件");
    }
}
