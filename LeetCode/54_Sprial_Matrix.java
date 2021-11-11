 class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        var result = new ArrayList<Integer>();
        
        while(startRow <= endRow && startCol <= endCol){
            for(int col = startCol; col <= endCol; col++){
                result.add(matrix[startRow][col]);
            }
            for(int row = startRow + 1; row <= endRow; row++){
                result.add(matrix[row][endCol]);
            }
            for(int col = endCol - 1; col >= startCol; col--){
                if(startRow == endRow) break;
                result.add(matrix[endRow][col]);
            }
            for(int row = endRow - 1; row > startRow; row--){
                if(startCol == endCol) break;
                result.add(matrix[row][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }
}
