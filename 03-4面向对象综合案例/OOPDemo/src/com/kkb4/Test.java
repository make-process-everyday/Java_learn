package com.kkb4;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建电脑对象, 调用方法
        NoteBook noteBook = new NoteBook();

        //调用方法
        noteBook.run();

        //调用使用USB设备的方法
        USB keyBoard = new KeyBoard();
        noteBook.useUSB(keyBoard);

        USB mouse = new Mouse();
        noteBook.useUSB(mouse);

        noteBook.shutDown();
    }
}
