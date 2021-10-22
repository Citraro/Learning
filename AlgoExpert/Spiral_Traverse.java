import java.util.*;

class Program {
  public static List<Integer> spiralTraverse(int[][] array) {
    int startColumn = 0;
		int startRow = 0;
		int endRow = array.length - 1;
		int endColumn = array[0].length - 1;
		var result = new ArrayList<Integer>();
		while(startRow <= endRow && startColumn <= endColumn){
			for(int column = startColumn; column <= endColumn; column++){
				result.add(array[startRow][column]);
			}
			
			for(int row = startRow + 1; row <= endRow; row++){
				result.add(array[row][endColumn]);
			}
			
			for(int column = endColumn - 1; column >= startColumn; column--){
				if(startRow == endRow) break;
				result.add(array[endRow][column]);
			}
			
			for(int row = endRow - 1; row > startRow; row--) {
				if(startColumn == endColumn) break;
				result.add(array[row][startColumn]);
			}
			startColumn++;
			endRow--;
			startRow++;
			endColumn--;
		}
    return result;
  }
}
