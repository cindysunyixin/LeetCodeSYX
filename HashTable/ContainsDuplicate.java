public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        if (nums.length == 0) {
            return false;
        }
        for (int element: nums) {
            if (set.contains(element)) {
                return true;
            } else {
                set.add(element);
            }
        }
        return false;
        
    }
}
