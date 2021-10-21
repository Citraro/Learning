import java.util.*;

class Program {
  public static boolean isMonotonic(int[] array) {
    if (array.length <= 2) return true;
		
		boolean isDecreasing = true;
		boolean isIncreasing = true;
		
		for(int i = 0; i < array.length - 1; i++){
			if(array[i] > array[i+1]){
				isIncreasing = false;
			}
			
			if(array[i] < array[i+1]){
				isDecreasing = false;
			}
		}
		
		return isDecreasing || isIncreasing;
	}
}
