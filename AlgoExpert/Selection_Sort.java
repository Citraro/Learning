import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {

		for(int i = 0; i < array.length; i++){
			int j = i;
			int smallestPos = i;
			while(j < array.length){
				if(array[smallestPos] > array[j]){
					smallestPos = j;
				}
				j++;
			}
			if(i != smallestPos)
				swap(array,i, smallestPos);
		}
    return array;
  }
	
	public static void swap(int[] array,int i, int smallestPos){
		int temp = array[i];
		array[i] = array[smallestPos];
		array[smallestPos] = temp;
	}
}
