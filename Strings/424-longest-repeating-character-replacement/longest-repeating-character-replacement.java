class Solution {
    public int characterReplacement(String s, int k) 
    {
        HashMap<Character,Integer> freqs = new HashMap<Character,Integer>();
        int res = 0, i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) 
        {
            char c = s.charAt(j);
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(c));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freqs.put(left, freqs.get(left) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
        }

        return res;
/*
        HashMap<Character,Integer> mpp = new HashMap<Character,Integer>();
        int left = 0, right = 0;
        int len = 0;

        while( right < s.length()) {
            if(mpp.containsKey(s.charAt(right)))
            {
                left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            }

            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
*/
    }
}