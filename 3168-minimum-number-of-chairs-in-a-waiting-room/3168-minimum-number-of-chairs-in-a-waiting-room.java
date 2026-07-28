class Solution {
    public int minimumChairs(String s) {
        int curr= 0;
        int max= 0;

        for(char ch: s.toCharArray()){
            if(ch== 'E'){
                curr++;
                max= Math.max(max, curr);
            }
            else{
                curr--;
            }

        }
        return max;
    }
}