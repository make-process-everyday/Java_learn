package com.kkb;

/**
 * 自增自减运算符
 * ++  运算，变量自己增长1。
 * -- 运算，变量自己减少1，用法与++ 一致。
 *
 * - 独立操作：
 *   - 变量在独立操作时，前++和后++没有区别 。
 *   - 变量前++   ：例如 ++i 。
 *   - 变量后++   ：例如 i++ 。
 */
public class Demo07 {
    public static void main(String[] args) {
        int n = 5;

        //n++;
        ++n;

        System.out.println("n = " + n);
    }
}
