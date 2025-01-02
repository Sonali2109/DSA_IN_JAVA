class Solution {
    public int[] twoSum(int[] nums, int target) 
    { 
        // Better Approach - Hashing

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        for(int i=0; i<nums.length; i++) 
        {
            int a = nums[i];
            int more = target - a;

            if(hashMap.containsKey(more)){
                ans[0] = hashMap.get(more);
                ans[1] = i;
                return ans;
            }

            hashMap.put(nums[i],i);
        }

        return ans;

/*
        // my approach - TWO POINTERS APPROACH
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
*/

    }
}