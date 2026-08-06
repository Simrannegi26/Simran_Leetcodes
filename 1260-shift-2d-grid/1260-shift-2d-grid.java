class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows=  grid.length;
        int cols = grid[0].length;
        
        int total= rows*cols;
        
        // New grid to store shifted values
        int[][] shifted= new int[rows][cols];

        // Traverse every element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Convert (row, col) into 1D index
                int currentIndex = i * cols + j;
                // Find new position after shifting k times
                int newIndex = (currentIndex + k) % total;
                // Convert new 1D index back to 2D coordinates
                int newRow = newIndex / cols;
                int newCol = newIndex % cols;

                // Place the element in its new position
                shifted[newRow][newCol] = grid[i][j];
            }
        }
        // Convert int[][] to List<List<Integer>>
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < rows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                row.add(shifted[i][j]);
            }

            answer.add(row);
        }

        return answer; 
    }
}