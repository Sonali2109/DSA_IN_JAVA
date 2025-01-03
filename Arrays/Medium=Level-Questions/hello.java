class Solution {
    public int maxSubArray(int[] nums) {
        // Brute Approach
        int maxi = Integer.MIN_VALUE; 
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }
}
