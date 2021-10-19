import java.util.*;

class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
    int[] largestNumArray = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
		
		for(int num : array){
			largestNumArray = helper(largestNumArray,num);
		}
		
    return largestNumArray;
  }
	public static int[] helper(int[] array, int num){
		if(num > array[2]){
			int temp = array[2];
			int temp2 = array[1];
			array[2] = num;
			array[1] = temp;
			array[0] = temp2;
		}else if(num > array[1]){
			int temp = array[1];
			array[1] = num;
			array[0] = temp;
		}else if(num > array[0]){
			array[0] = num;
		}
		
		return array;
		
	}
}
