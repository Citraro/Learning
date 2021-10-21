import java.util.*;

class Program {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
    int occurances = 0;
		for(int i = 0; i < array.size() - occurances; i++){
			if(array.get(i) == toMove && array.get(array.size() - occurances - 1) != toMove){
				swap(array,i, occurances);
				occurances++;
			}else if(array.get(array.size() - occurances - 1) == toMove){
				occurances++;
				i--;
			}
			
		}
    return array;
  }
	
	
	public static void swap(List<Integer> array, int i, int occurances){
		int posToSwapWith = array.size() - occurances - 1;
		int temp = array.get(posToSwapWith);
		array.set(posToSwapWith,array.get(i));
		array.set(i,temp);
	}
	
	
}
