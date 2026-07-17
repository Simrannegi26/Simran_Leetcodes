class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(words[i])) return false;
            } 
            else {
                if (map.containsValue(words[i])) return false;
                map.put(ch, words[i]);
            }
        }
        return true;
 
    }
}