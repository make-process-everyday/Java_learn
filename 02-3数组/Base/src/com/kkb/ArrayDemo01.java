package com.kkb;

/**
 * @Author likepei
 * @Date 2020/6/18 21:01
 * @Version v1.0
 * @Description 数组的定义 和 数组元素的访问
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //定义一个数组
        //定义一个int类型的数组
        //int[] intArray = new int[5];
        int[] intArray = {11, 22, 33, 44, 55};
        //定义一个String类型的数组
        String[] strArray= {"hello","java", "world"};

        System.out.println("intArray的长度 = " + intArray.length);
        System.out.println("strArray的长度 = " + strArray.length);

        //获取打印数组中的元素值
        System.out.println( intArray[0] );
        System.out.println( intArray[1] );
        System.out.println( intArray[2] );
        System.out.println( intArray[3] );
        System.out.println( intArray[4] );

        //为数组中的元素 赋值
        intArray[0] = 100;
        intArray[1] = 101;
        intArray[2] = 102;

        System.out.println("---------------------");
        //获取打印数组中的元素值
        System.out.println( intArray[0] );
        System.out.println( intArray[1] );
        System.out.println( intArray[2] );
        System.out.println( intArray[3] );
        System.out.println( intArray[4] );
    }
}
