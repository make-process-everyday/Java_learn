package com.leetCode;

public class Practice {
    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        int slow = getNextNumber(n);
        int fast = getNextNumber(getNextNumber(n));
        do{
            if (fast ==1 || slow == 1){
                return true;
            }
            fast = getNextNumber(getNextNumber(fast));
            slow = getNextNumber(slow);
        }while (fast != slow);
        return false;
    }

    public int getNextNumber(int n){
        int sum = 0;
        while(n != 0){
            int a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        return sum;
    }
}
