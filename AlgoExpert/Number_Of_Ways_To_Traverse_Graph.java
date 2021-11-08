import java.util.*;

class Program {

  public int numberOfWaysToTraverseGraph(int width, int height) {
    int filledGraph[][] = new int[height + 1][width + 1];
		for(int col = 1; col < width + 1; col++){
			for(int row = 1; row < height + 1; row++){
				if(row == 1 || col == 1){
					filledGraph[row][col] = 1;
				}else{
					filledGraph[row][col] = filledGraph[row][col - 1] + filledGraph[row - 1][col];
				}
			}
		}
    return filledGraph[height][width];
  }
}
