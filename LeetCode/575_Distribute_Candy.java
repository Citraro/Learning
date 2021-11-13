class Solution {
    public int distributeCandies(int[] candyType) {
        
        HashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i : candyType){
            set.add(i);
        }
        
        int numOfCandyTypes = set.size();
        
        if((candyType.length / 2) >= set.size()){
            return set.size();
        }else{
            return candyType.length / 2;
        }
        
    }
}
