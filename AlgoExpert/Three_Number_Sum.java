import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    ArrayList<Integer[]> returnList = new ArrayList<Integer[]>();
		Arrays.sort(array); // o(nlogn)
		for (int index = 0; index < array.length - 2; index++) {
			int left = index + 1;
			int right = array.length - 1;
			while (left < right) {
				int currentSum = array[index] + array[left] + array[right];
				if(currentSum == targetSum){
					Integer[] tripplet = {array[index], array[left], array[right]};
					returnList.add(tripplet);
					left++;
					right--;
				} else if (currentSum > targetSum){
					right--;
				} else if (currentSum < targetSum){
					left++;
				}
			}
		}
    return returnList;
  }
}
