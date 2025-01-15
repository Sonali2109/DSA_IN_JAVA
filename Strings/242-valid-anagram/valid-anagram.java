class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) 
            return false;
            
        int[] ca = new int[26];

        for (char c : s.toCharArray()) ca[c - 'a']++;
        for (char c : t.toCharArray()) ca[c - 'a']--;

        for (int i : ca) {
            if (i != 0) return false;
        }

        return true;

    }
}