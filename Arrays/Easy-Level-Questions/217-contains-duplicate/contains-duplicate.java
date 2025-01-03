class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        // Using Hashing
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size() < nums.length){
            return true;
        }

        return false;

/*
        // Sorting Method 
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1])
                return true;
        }

        return false;
*/
    }
}