import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
		
    int minChange = 0;
		
		Arrays.sort(coins); // o(nlogn)
		
		for(int coin : coins){
			if(coin > minChange + 1){
				return minChange + 1;
			}
			minChange += coin;
		}
		
    return minChange + 1;
  }
}
