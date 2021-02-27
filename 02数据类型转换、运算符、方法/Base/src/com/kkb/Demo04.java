package com.kkb;

/**
 * ASCII 码表  键盘上的每一个字符 对应着一个数字
 */
public class Demo04 {
    public static void main(String[] args) {
        //字符类型变量
        char ch = 'a';
        int i = 10;
        //字符类型和int类型计算
        System.out.println('a'+0);//输出结果是97
        System.out.println('A'+0);//输出结果是65
        System.out.println('0'+0);//输出结果是48

        System.out.println(ch + i); // 97 + 10
    }
}
