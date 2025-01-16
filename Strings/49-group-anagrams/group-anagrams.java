class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();

    /*
        // Solution 1
        HashMap<String, List> map = new HashMap<>();

        for(String s : strs)
        {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i : count) {
                sb.append("#");
                sb.append(i);
            }

            String key = sb.toString();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    */
        // Solution 2
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs) 
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedChars = new String(chars);
            if(!map.containsKey(sortedChars)) {
                map.put(sortedChars, new ArrayList<String>());
            }
            map.get(sortedChars).add(str);
        }

        return new ArrayList<>(map.values());
    }
}