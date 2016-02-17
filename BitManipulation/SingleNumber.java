public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < nums.length; i ++) {
            rst ^= nums[i];
        }
        return rst;
        
        
    }
}
