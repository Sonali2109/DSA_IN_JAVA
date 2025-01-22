class Solution {
    public String minWindow(String s, String t) {

        // Two Pointers Approach - 1
        if (s.length() < t.length()) return "";
        
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        
        for (char c : t.toCharArray()) map[c]++;
        
        while (end < s.length()) {
            if (map[s.charAt(end++)]-- > 0) count--; // line of code merging
            
            while (count == 0) {
                if (end - start < minLen) {
                    minStart = start;
                    minLen = end - start;
                }
                
                if (map[s.charAt(start++)]++ == 0) count++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
/*       
        // Two Pointers Approach - 2
        int[] map = new int[256];
        int count = 0;
        int l = 0, r = 0, stIndex = -1, minLen = Integer.MAX_VALUE;

        for(int i=0; i<t.length(); i++){
            map[t.charAt(i)]++;
        }

        while(r < s.length()){
            if(map[s.charAt(r)] > 0)    count++;
            map[s.charAt(r)]--;

            while(count == t.length()) {
                if(r-l+1 < minLen) {
                    minLen = r-l+1;
                    stIndex = l;
                }
                map[s.charAt(l)]--;
                if(map[s.charAt(l)] > 0)    count--;
            }
            r++;
        }

        return stIndex == -1 ? "" : s.substring(stIndex, minLen);
*/
    }
}