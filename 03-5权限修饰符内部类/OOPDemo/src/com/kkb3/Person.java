package com.kkb3;

/**
 * 演示内部类
 */
public class Person {
    //成员变量
    private boolean live = true;

    //内部类, 在person类中的成员位置
    class Heart {
        public void jump(){
            if(live){
                System.out.println("心脏跳跳跳....");
            } else {
                System.out.println("心脏不跳了....");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
