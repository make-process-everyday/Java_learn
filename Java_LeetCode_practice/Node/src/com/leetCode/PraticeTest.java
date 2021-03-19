package com.leetCode;

public class PraticeTest {
    public static void main(String[] args) {
        Practice practice = new Practice();
        double result = 0;
        for (int i=0;i<=100000;i++){
            if (practice.isHappy(i)){
                result += i;
            }

        }
        String a = result + "";
        System.out.println((a));
    }
}
