class Solution {
    public int mySqrt(int x)
    { int l = 0, r = x, ans = -1;
        while (l <= r) { int mid = l + (r - l) / 2; if ((long) mid * mid <= x) { ans = mid; l = mid + 1; } else { r = mid - 1; } }return ans; } }

public class LeetCode69 {
    public int mySqrt(int x) {
        int  start = 0, end=x, ans = -1;
        while(end - start > 3 ){
            int mid = start + (end - start) / 2;
            long res = (long) mid * mid;
            if (res == x){
                return mid;
            }
            else if (res < x){
                start = mid;

            }
            else {
                end = mid -1;
            }
        }
        for (int i=start; i<=end; i++){
            if ((long) i*i <= x){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode69 leetCode69 = new LeetCode69();
        int x =  2147483640;

        System.out.print(leetCode69.mySqrt(x));

    }
}


