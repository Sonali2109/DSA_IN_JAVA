class Solution {
    public int maxArea(int[] height) {

        int maxWater = 0;
        // OPTIMAL APPROACH
        int lp = 0, rp = height.length-1;

        while(lp < rp)
        {
            int wt = rp - lp;
            int ht = Math.min(height[lp],height[rp]);
            int currWater = wt * ht;
            maxWater = Math.max(maxWater, currWater); 

            if(height[lp] < height[rp])
                lp++;
            else
                rp--;
        }

        // BRUTE APPROACH
/*
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int wt = j-i;
                int ht = Math.min(height[i],height[j]);
                int currWater = wt * ht;
                maxWater = Math.max(maxWater, currWater);
            }
        }
*/
        return maxWater;
    }
}