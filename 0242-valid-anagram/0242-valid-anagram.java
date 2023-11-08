class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(char i : t.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) - 1);
            if(map.get(i) == 0) {
                map.remove(i);
        }
        }
        return map.isEmpty();
}
}