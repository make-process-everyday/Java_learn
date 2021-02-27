package com.kkb;

/**
 * 死循环: 无限循环
 */
public class ForDemo03 {
    public static void main(String[] args) {
        for ( ; ; ){
            System.out.println("开课吧 你好");
        }

        //下面这行代码 永远执行不了, 又因为上面for死循环: 无限循环
        //System.out.println("结束....");
    }
}
