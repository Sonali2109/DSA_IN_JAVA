class Solution {
    public int missingNumber(int[] nums) 
    {
        // OPTIMAL APPROACH 1 - XOR Method
        int res = nums.length;

        for(int i=0; i<nums.length; i++)
        {
            res ^= i;
            res ^= nums[i];
        }
        
        return res;

    /*    
        // OPTIMAL APPROACH 2 - Sum Method
        int n = nums.length;
        int sum = (n * (n+1)) / 2;
        int s2 = 0;

        for(int i=0; i<n; i++)
        {
            s2 += nums[i];
        }
        
        return (sum-s2);
    */
    }
}