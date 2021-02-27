package com.kkb;

/**
 * if语句的 第三种格式
 */
public class IfDemo03 {
    public static void main(String[] args) {
        System.out.println("开始....");

        int score = 30;

        if(score > 100 || score < 0){
            System.out.println("当前成绩 非法");
        } else if(score >= 90){ // 90 - 100
            System.out.println("成绩为 优");
        } else if(score >= 80){ // 80 - 90
            System.out.println("成绩为 良");
        } else if(score >= 60){ // 60 - 80
            System.out.println("成绩为 及格");
        } else { // 0 - 60
            System.out.println("成绩为 不及格");
        }

        System.out.println("结束....");

    }
}
