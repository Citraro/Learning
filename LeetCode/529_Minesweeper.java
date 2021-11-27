class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        int rowCount = board.length;
        int colCount = board[0].length;
        if(board[row][col] == 'M'){
            board[row][col] = 'X';
            return board;
        }
        
        int count = 0;
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                if(i == 0 && j == 0) continue;
                int newRow = row + i;
                int newCol = col + j;
                if(newRow < 0 || newCol >= colCount || newCol < 0 || newRow >= rowCount) continue;
                if(board[newRow][newCol] == 'M' || board[newRow][newCol] == 'X'){
                    count++;
                }
            }
        }
        if(count > 0){
            board[row][col] = (char)(count + '0');
        }else {
            board[row][col] = 'B';
            for(int i = -1; i < 2; i++){
                for(int j = -1; j < 2; j++){
                    if(i == 0 && j == 0) continue;
                    int newRow = row + i;
                    int newCol = col + j;
                    if(newRow < 0 || newCol >= colCount || newCol < 0 || newRow >= rowCount) continue;
                    if(board[newRow][newCol] == 'E'){
                        updateBoard(board, new int[]{newRow,newCol});
                    }
                }
            }
        }
        
        return board;
    }
}
