class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;

        for(int j =0; j<col; j++){                // Process one column at a time
            int max= Integer.MIN_VALUE;           // store max value of col's
             for (int i = 0; i < row; i++) {
                max = Math.max(max, matrix[i][j]);    // find max value in curr col
            }
              // Replace every -1 in this column with the maximum value
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max;
                }
            }

       
        }
        return matrix;
        
    }
}