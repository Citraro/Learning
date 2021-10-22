import java.util.*;

class Program {
  public static int longestPeak(int[] array) {
		int longestPeak = 0;
		int index = 1;
		while(index < array.length - 1){
			boolean isPeak = array[index] > array[index+1] && array[index] > array[index - 1];
			if(!isPeak){
				index++;
				continue;
			}
			
			int leftIndex = index - 2;
			while(leftIndex >= 0 && array[leftIndex] < array[leftIndex+1]){
				leftIndex--;
			}
			
			int rightIndex = index + 2;
			while(rightIndex < array.length && array[rightIndex] < array[rightIndex-1]){
				rightIndex++;
			}
			int currentPeak = rightIndex - leftIndex - 1;
			if(currentPeak > longestPeak){
				longestPeak = currentPeak;
			}
			
			index = rightIndex;
			
		}
		return longestPeak;
  }
}
