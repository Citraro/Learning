import java.util.*;

// O(n) time | O(n) space

class Program {

  public int[] sortedSquaredArray(int[] array) {
		
		int[] res = new int[array.length];
		
    int right = array.length - 1;
		int left = 0;
		
		for(int i = array.length - 1; i >= 0; i--){
			int leftSqrt = array[left] * array[left];
			int rightSqrt = array[right] * array[right];
			
			if(leftSqrt > rightSqrt){
				res[i] = leftSqrt;
				left++;
			}else{
				res[i] = rightSqrt;
				right--;
			}
			
		}
    return res;
  }
}
