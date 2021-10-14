import java.util.*;

// O(n) time | O(n) space

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : array){
			int lookingNum = targetSum - num;
			if(set.contains(lookingNum) && num != lookingNum){
				return new int[]{lookingNum, num};
			} else {
				set.add(num);
			}
		}
		
    return new int[0];
  }
}