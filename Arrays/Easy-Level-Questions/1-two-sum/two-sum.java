class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;

        while(i<j)
        {
            int sum = nums[i] + nums[j];

            if(sum == target){
                return new int[]{i,j};
            }
            else if(j==i+1)
            {
                i++;
                j = nums.length-1;
            }
            else{
                j--;
            }
        }

        return new int[]{-1};
    }
}