class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }

        int j;
        for(j=0; j<temp.size(); j++){
            nums[j] = temp.get(j);
        }

        for(int i=j; i<n; i++){
            nums[i] = 0;
        }
    }
}