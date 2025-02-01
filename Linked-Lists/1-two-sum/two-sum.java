class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Two Pointers Approach
        int l = 0;
        int r = nums.length-1;

        while(l < r) {
            if(nums[l] + nums[r] == target) return new int[]{l,r};
            else if(r == l+1) {
                l++;
                r = nums.length - 1;
            }
            else    r--;
        }

        return new int[]{-1,-1};
    }
}