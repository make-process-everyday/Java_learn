package com.kkb;

/**
 * @Author likepei
 * @Date 2020/6/18 22:03
 * @Version v1.0
 * @Description 数组的练习 [ 获取数组元素的最大值]
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] array = {5, 15, 2000, 10000, 100, 4000};

        //定义一个变量, 记录数组元素的最大值, 初始值 赋值为 第一个元素值
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            //获取数组中的每一个元素值 , 与max值 比较, 比较后 更新max值即可
            if (array[i] > max){
                //更新max的值
                max = array[i];
            }
        }

        //soutv
        System.out.println("max = " + max);
    }
}
