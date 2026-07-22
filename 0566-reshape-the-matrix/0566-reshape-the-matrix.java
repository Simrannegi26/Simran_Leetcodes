class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row= mat.length;
        int col= mat[0].length;

        // If total number of elements doesn't match,
        // reshaping is not possible
        if (row*col != r*c){
            return mat;
        }

        int[][] result = new int[r][c];
        // Pointer for the new matrix
        int newRow = 0;
        int newCol = 0;

        for(int i=0; i<row; i++){
            for(int j =0; j <col; j++){
                result[newRow][newCol] =  mat[i][j];   // Copy the current element
                newCol++;                     // move to next col
            // If the current row is full,
            // move to the next row
            if (newCol == c) {
                newCol = 0;
                newRow++;
            }
            }          
        }
      return result;  
    }
}