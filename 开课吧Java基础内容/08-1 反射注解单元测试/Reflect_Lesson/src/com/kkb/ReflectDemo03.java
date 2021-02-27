package com.kkb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射 获取Student类中的成员方法
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Student类的class对象
        Class clazz = Class.forName("com.kkb.Student");
        //通过构造方法，创建student对象
        Object studentObj = clazz.getConstructor().newInstance();

        //获取Student类中的所有方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        System.out.println("---------------------------");

        //获取Student类中的study方法，并执行
        Method studyMethod = clazz.getMethod("study");
        //执行
        studyMethod.invoke(studentObj);

        //获取Student类中的eat方法， 并执行
        Method eatMethod = clazz.getMethod("eat", String.class, double.class);
        //执行
        eatMethod.invoke(studentObj, "热巴", 666.6);


    }
}
