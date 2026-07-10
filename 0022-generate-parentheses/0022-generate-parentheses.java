class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();    // to store final ans
        StringBuilder sb = new StringBuilder();     // recursion func.
        backtrack(result, sb, 0, 0, n);
        return result;
  
    }
    private void backtrack(List<String> result, StringBuilder sb, int open, int close, int n ){
        if(sb.length()== 2*n){                  // each pairs has 2 characters so length should be in multiple of 2
            result.add(sb.toString());          // convert stringbuilder to string
            return;
        }
        if( open <n){                           // can use only n opening brackets
            sb.append ('(');
            backtrack(result, sb, open+1, close, n);
            sb.deleteCharAt(sb.length()-1);     // removes last charater to explore more choices
        }
        if(close < open){
            sb.append(')');
            backtrack(result, sb, open, close +1, n);
            sb.deleteCharAt(sb.length()-1);
        }


    }
}