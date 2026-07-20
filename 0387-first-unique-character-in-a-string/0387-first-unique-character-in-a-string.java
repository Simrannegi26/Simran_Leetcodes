class Solution {
    public int firstUniqChar(String s) {
        int indx= -1;        // no unique char found
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i< s.length(); i++){
            char ch= s.charAt(i);
            int freq= map.getOrDefault(ch, 0); // get curr frq of ch, if not exists then 0
            map.put(ch,(freq+1));   // add ch to hashmap and update its freq
        }
        for(int i=0; i<s.length(); i++){
            if (map.get(s.charAt(i)) == 1){
                indx = i;
                break;
            }

        }
        return indx;
        
    }
}