class Solution 
{
    public int lenOfLongestSubarr(int[] arr, int k) 
    {
        // code here
        // FOR POSITIVES, NEGATIVES AND ZEROS { Better Approach }
        
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        int maxLen = 0, sum = 0;
        
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
            
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            
            int rem = sum - k;
            
            if(mpp.containsKey(rem)){
                int len = i - mpp.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            
            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
        }
        
        return maxLen;
        
    /*
        // FOR POSITIVES AND ZEROS { Optimal Approach }
        
        int left = 0, right = 0, maxLen = 0;
        int sum = arr[0];
        int n = arr.length;
        
        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            
            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            
            if(right < n)
                sum += arr[right];
        }
        
        return maxLen;
    */
    }
}
