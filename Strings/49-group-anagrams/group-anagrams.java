class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs) {
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