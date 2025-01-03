class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
/*
        // Using Hashing - variant 1
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size() < nums.length){
            return true;
        }

        return false;
*/
        // Variant - 2
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int num : nums) 
        {
            if (!uniqueSet.add(num)) {
                return true;
            }
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