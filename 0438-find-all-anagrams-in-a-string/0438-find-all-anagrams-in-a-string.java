class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] countP = new int[26];
        int[] countS = new int[26];

        // First window
        for (int i = 0; i < p.length(); i++) {
            countP[p.charAt(i) - 'a']++;
            countS[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(countP, countS)) {
            ans.add(0);
        }

        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {

            countS[s.charAt(i) - 'a']++;

            countS[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(countP, countS)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }
}