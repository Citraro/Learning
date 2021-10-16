import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    int minWait = 0;
		
		
		Arrays.sort(queries); // o(nlogn)
		
		for(int i = 0; i < queries.length; i++){
			int duration = queries[i];
			int queriesLeft = queries.length - (i + 1);
			minWait += duration * queriesLeft;
		}
		
		return minWait;
  }
}
