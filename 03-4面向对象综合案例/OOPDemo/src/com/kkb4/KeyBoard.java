package com.kkb4;

/**
 * 键盘类
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘连接了...");
    }

    @Override
    public void close() {
        System.out.println("键盘断开了....");
    }
}
