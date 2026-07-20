class Solution {
    public int firstUniqChar(String s) {
        int indx= -1;        // no unique char found
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i< s.length(); i++){
            char ch= s.charAt(i);

            int freq= map.getOrDefault(ch, 0); // get curr frq of ch, if not exists then 0
            map.put(ch,(freq+1));   // add ch to hashmap and update its freq
        }

         // Traverse the string again to find the first unique character
        for(int i=0; i<s.length(); i++){

             // If the frequency of the current character is 1,
             // then it is the first non-repeating character
            if (map.get(s.charAt(i)) == 1){   
                return i;   // Return its index immediately
            }

        }
        return indx;
        
    }
}