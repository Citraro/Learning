import java.util.*;

class Program {
  public static int kadanesAlgorithm(int[] array) {
    int maxEndingHere = array[0];
		int maxSoFar = array[0];
		for(int i = 1; i < array.length; i++) {
			int number = array[i];
			maxEndingHere = Math.max(maxEndingHere + number, number);
			maxSoFar = Math.max(maxSoFar,maxEndingHere);
		}
    return maxSoFar;
  }
}
