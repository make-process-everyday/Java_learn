package com.kkb4;

/**
 * 笔记本电脑
 */
public class NoteBook {

    //运行方法
    public void run(){
        System.out.println("电脑已运行...");
    }

    //关机方法
    public void shutDown(){
        System.out.println("电脑已关机....");
    }

    //使用USB设置的方法
    public void useUSB(USB usb){
        //使用USB设备
        usb.open();
        //USB设备的断开
        usb.close();
    }
}
