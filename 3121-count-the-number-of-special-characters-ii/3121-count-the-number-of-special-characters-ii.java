class Solution {
    public int numberOfSpecialChars(String word) {
          int count = 0;

        for (char c = 'a'; c <= 'z'; c++) {

            char upper = Character.toUpperCase(c);

            int lastLower = word.lastIndexOf(c);
            int firstUpper = word.indexOf(upper);

            if (lastLower != -1 && firstUpper != -1) {
                if (lastLower < firstUpper) {
                    count++;
                }
            }
        }

        return count;
        
    }
}