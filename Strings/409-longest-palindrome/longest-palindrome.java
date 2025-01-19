class Solution {
    public int longestPalindrome(String s) {
        int arrLower[] = new int[26];
        int arrUpper[] = new int[26];

        for(char c : s.toCharArray())
        {
            if(c >='a')
                arrLower[c - 'a']++;
            else
                arrUpper[c - 'A']++;
        }

        int ans = 0;
        boolean isPresent = false;

        for(int i=0; i<26; i++) 
        {
            if(arrLower[i]%2 == 0)
                ans += arrLower[i];
            else{
                ans += arrLower[i]-1;
                isPresent = true;
            }

            if(arrUpper[i]%2 == 0)
                ans += arrUpper[i];
            else{
                ans += arrUpper[i]-1;
                isPresent = true;
            }
        }

        return isPresent ? ans + 1 : ans;
    }
}