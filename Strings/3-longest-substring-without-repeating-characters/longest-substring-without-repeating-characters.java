class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[255];
        Arrays.fill(hash,-1);
        int l = 0;
        int r = 0;
        int maxLength = 0;

        while(r < s.length())
        {
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)] + 1;
                }
            }

            int len = r - l + 1;
            maxLength = Math.max(len, maxLength);
            hash[s.charAt(r)] = r;
            r++;
        }

        return maxLength;
    }
}