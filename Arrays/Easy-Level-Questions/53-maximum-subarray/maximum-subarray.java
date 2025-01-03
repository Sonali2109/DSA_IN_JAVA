class Solution {
    public int maxSubArray(int[] nums) {

        long maxi = Long.MIN_VALUE; 
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return (int)maxi;
/*
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
*/
    }
}