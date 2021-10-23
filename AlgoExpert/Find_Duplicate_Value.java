import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    
		for (int num : array){
			int absoluteValue = Math.abs(num);
			if(array[absoluteValue - 1] < 0) return absoluteValue;
			array[absoluteValue - 1] *= -1;
		}
			
    return -1;
  }
}
