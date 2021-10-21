import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    int closest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		Arrays.sort(arrayOne); // o(nlogn)
		Arrays.sort(arrayTwo); // o(mlogm)
		int idxOne = 0;
		int idxTwo = 0;
		int[] smallestPair = new int[2];
		while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){
			int firstNum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxTwo];
			current = Math.abs(firstNum - secondNum);
			if(firstNum < secondNum){
				idxOne++;
			}else if (secondNum < firstNum){
				idxTwo++;
			}else{
				return new int[] {firstNum, secondNum};
			}
			
			if(current < closest){
				smallestPair = new int[] { firstNum, secondNum };
				closest = current;
			}
			
		}
    return smallestPair;
  }
}
