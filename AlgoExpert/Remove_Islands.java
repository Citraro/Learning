import java.util.*;

class Program {

  public int[][] removeIslands(int[][] matrix) {
    
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				boolean rowIsBorder = (row == 0) || (row == matrix.length - 1);
				boolean colIsBorder = (col == 0) || (col == matrix[row].length - 1);
				boolean isBorder = rowIsBorder || colIsBorder;
				if(!isBorder){
					continue;
				}
				if(matrix[row][col] != 1){
					continue;
				}
				
				changeBorderOnesToTwo(matrix,row,col);
			}
		}
		
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				int number = matrix[row][col];
				if(number == 1){
					matrix[row][col] = 0;
				}else if(number == 2){
					matrix[row][col] = 1;
				}
			}
		}
		
    return matrix;
  }
	
	public void changeBorderOnesToTwo(int[][] matrix, int startRow, int startCol){
		Stack<int[]> positions = new Stack<>();
		positions.push(new int[]{startRow,startCol});
		
		while(positions.size() > 0){
			int[] position = positions.pop();
			int currentRow = position[0];
			int currentCol = position[1];
			
			matrix[currentRow][currentCol] = 2;
			
			int[][] neighbors = getNeighbors(matrix, currentRow, currentCol);
			for(int[] neighbor : neighbors){
				int row = neighbor[0];
				int col = neighbor[1];
				
				if(matrix[row][col] != 1){
					continue;
				}
				positions.push(neighbor);
			}
		}
	}
	public int[][] getNeighbors(int[][] matrix, int row, int col){
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		ArrayList<int[]> temp = new ArrayList<>();
		
		//UP
		if(row - 1 >= 0){
			temp.add(new int[] { row - 1, col});
		}
		
		//DOWN
		if(row + 1 < numRows){
			temp.add(new int[] { row + 1, col});
		}
		
		//LEFT
		if(col - 1 >= 0){
			temp.add(new int[] {row, col - 1});
		}
		
		//RIGHT
		if(col + 1 < numCols){
			temp.add(new int[] {row, col + 1});
		}
		
		int[][] neighbors = new int[temp.size()][2];
		for(int i = 0; i < temp.size(); i++){
			neighbors[i] = temp.get(i);
		} 
		return neighbors;
	}
}
