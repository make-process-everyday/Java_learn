package com.kkb2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 演示Junit单元测试的使用
 */
public class JunitDemo {

    @Before
    public void beforeTest(){
        System.out.println("beforeTest方法执行了。。。");
    }

    @Test
    public void testPrintMethod(){
        System.out.println("我是霈哥");
    }

    @Test
    public void testPrintMethod2(){
        System.out.println("我是霈哥666");
    }

    @After
    public void afterTest(){
        System.out.println("afterTest方法执行了...");
    }
}
