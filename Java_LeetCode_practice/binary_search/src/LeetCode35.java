public class LeetCode35 {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int [] {-1,-1};
        if (nums == null || nums.length == 0){
            return ans;
        }
        int end = nums.length - 1;
        int start = 0;
        while (end - start > 0){
            int mid = (start + end) / 2;
            if (nums[mid] >= target){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        if (nums[start] != target){
            return ans;
        }
        ans[0] = start;
        int j = nums.length - 1;
        int i = 0;
        while (i < j){
            int mid = (i + j) / 2;
            if (nums[mid] <= target){
                i = mid+1;
            }
            else {
                j = mid;
            }
        }
        ans[1] = i-1;
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {5,7,7,8,8,10};
        int target = 8;
        LeetCode35 solution = new LeetCode35();
        System.out.println(solution.searchRange(nums,target));
    }
}