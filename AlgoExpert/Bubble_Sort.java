import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    boolean isSorted = false;
		int counter = 0;
		while(!isSorted){
			isSorted = true;
			for(int i = 0; i < array.length - 1 - counter; i ++){
				if(array[i] > array[i + 1]){
					swap(array,i);
					isSorted = false;
				}
			}
			counter++;
		}
    return array;
  }
	
	public static void swap(int[] array, int pos){
		int temp = array[pos+1];
		array[pos+1] = array[pos];
		array[pos] = temp;
	}
}
