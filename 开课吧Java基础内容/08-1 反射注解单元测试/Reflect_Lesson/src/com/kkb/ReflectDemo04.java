package com.kkb;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 练习： 读取config.properties文件 指定的类名创建对象， 调用指定方法 执行方法
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //2. 在程序中加载 读取配置文件内容
        InputStream in = ClassLoader.getSystemResourceAsStream("config.properties");
        //3. 把流中的数据， 保存到Map集合中
        Properties prop = new Properties();
        //通过properties集合中load方法， 实现把流中的数据 保存到集合中
        prop.load(in);
        System.out.println(prop);

        //通过反射技术， 创建配置文件中className 所指定的对象
        //1.加载 配置文件中className 所对应的类
        Class clazz = Class.forName(prop.getProperty("className"));
        //2.创建 className 所对应的类的对象
        Object obj = clazz.newInstance();

        //通过反射技术， 创建配置文件中 methodName 所指定的方法对象
        Method method = clazz.getMethod(prop.getProperty("methodName"));
        //执行方法
        method.invoke(obj);
    }
}
