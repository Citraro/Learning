import java.util.*;

class Program {
  public static boolean hasSingleCycle(int[] array) {
    int visitedCount = 0;
		int currentIndex = 0;
		
		while (visitedCount < array.length) {
			if(visitedCount > 0 && currentIndex == 0){
				return false;
			}
			currentIndex = getNextIndex(currentIndex, array);
			visitedCount++;
		}
		
    return currentIndex == 0;
  }
	
	public static int getNextIndex(int currentIndex, int[] array) {
		int jump = array[currentIndex];
		int nextIndex = (currentIndex + jump) % array.length;
		return nextIndex >= 0 ? nextIndex : array.length + nextIndex;
	}
}
 
