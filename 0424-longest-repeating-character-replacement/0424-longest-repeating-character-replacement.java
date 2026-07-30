class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left=0;
        int maxfreq=0;
        int maxlen=0;

        for(int right=0; right<s.length(); right++){

            //increase freq of curr char
            freq[s.charAt(right) - 'A']++;
            //update highest freq in curr window
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
            //if replacemnt needed > k, shrink window
            while((right- left +1)- maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            //update max valid window
            maxlen = Math.max(maxlen, right - left +1);

        }
        return maxlen;

        
    }
}