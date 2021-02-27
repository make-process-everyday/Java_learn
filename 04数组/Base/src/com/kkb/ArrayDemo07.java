package com.kkb;

public class ArrayDemo07 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = { 10, 20};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("----------------");
        change(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void change(int[] arr) {
        arr[0] = arr[0]*10;
        arr[1] = arr[1]*10;
    }
}
