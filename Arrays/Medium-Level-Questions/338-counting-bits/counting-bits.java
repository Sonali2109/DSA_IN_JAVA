class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        ans[0] = 0;

        for(int i=0; i<=n; i++) {
            String binary_num = Integer.toBinaryString(i);
            ans[i] = countOnes(binary_num);
        }

        return ans;
    }

    private int countOnes(String num) {
        int count = 0;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '1') 
                count++;
        }
        return count;
    }
}