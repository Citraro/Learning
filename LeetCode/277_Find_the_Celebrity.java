/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        
        int potentialCelebrity = 0;
        
        for(int i = 1; i < n; i++){
            if(knows(potentialCelebrity,i)){
                potentialCelebrity = i;
            }
        }
        
        for(int i = 0; i < n; i++){
            if((i != potentialCelebrity && knows(potentialCelebrity,i)) || !(knows(i,potentialCelebrity))){
                return -1;
            }
        }
        
        return potentialCelebrity;
    }
}
