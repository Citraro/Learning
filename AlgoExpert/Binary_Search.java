import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
		return BS(array,target,0,array.length - 1);
    
  }
	
	public static int BS(int array[], int target, int start, int end){
		if(start > end){
			return -1;
		}
		int mid = (start + end) / 2;
		int current = array[mid];
		if(current == target){
			return mid;
		}else if (current > target){
			return BS(array,target,0,mid - 1);
		}else{
			return BS(array,target,mid + 1,end);
		}
	}
}
