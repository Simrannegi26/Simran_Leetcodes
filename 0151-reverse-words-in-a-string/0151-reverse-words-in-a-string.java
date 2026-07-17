class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            if (!words[i].equals("")) {
                result = result + words[i] + " ";
            }
        }

        return result.trim();
    }
}