class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        // OPTIMAL APPROACH - Using Two Pointers
        int left = 0;
        int right = nums.length-1;

        while(left < right)
        {
            int sum = nums[left] + nums[right];

            if(sum == target)   return new int[]{left,right};
            else if(right == left+1){
                left++;
                right = nums.length-1;
            }
            else    right--;
        }

        return new int[]{-1,-1};

/*
        // BETTER APPROACH - Using Hashing (HashMap)
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;

        for(int i=0; i<nums.length; i++)
        {
            int require = target - nums[i];
            
            if(hashMap.containsKey(require)){
                ans[0] = hashMap.get(require);
                ans[1] = i;
                return ans;
            }
            hashMap.put(nums[i],i);
        }
        return ans;
*/

/*
        // BRUTE APPROACH
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if( i==j )  continue;
                if( nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
*/
    }
}