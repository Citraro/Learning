import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    
		int seqPos = 0;
		
		for(int i : array){
			if(seqPos == sequence.size()) break;
			
			if(sequence.get(seqPos) == i){
				seqPos++;
			}
		}
		
    return seqPos == sequence.size();
  }
}
