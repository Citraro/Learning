import java.util.*;

class Program {
  public static int[] insertionSort(int[] array) {
    for(int i = 1; i < array.length; i++){
			int j = i;
			while(j > 0 && array[j] < array[j-1]){
				swap(array,j-1,j);
				j--;
			}
		}
    return array;
  }
	
	public static void swap(int[] array, int left, int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
