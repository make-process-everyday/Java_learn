package com.kkb4;

/**
 * 鼠标类
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标连接了....");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开了....");
    }
}
