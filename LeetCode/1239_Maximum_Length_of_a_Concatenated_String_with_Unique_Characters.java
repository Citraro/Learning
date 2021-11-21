class Solution {
    public int maxLength(List<String> arr) {
        return backTrack(arr, 0, 0, new int[26]);
    }
    
    private int backTrack(List<String> arr, int index, int length, int[] set){
        
        if(index >= arr.size()){
            return length;
        }
        
        
        boolean containsOnlyUnique = true;
        char[] chars = arr.get(index).toCharArray();
        
        for(char c : chars){
            if(++set[c - 'a'] > 1){
                containsOnlyUnique = false;
            }
        }
        
        int unique = 0;
        if(containsOnlyUnique){
            unique = backTrack(arr, index + 1, length + chars.length, set);
        }
        
        for(char c : chars) {
            set[c - 'a']--;
        }
        
        return Math.max(unique, backTrack(arr,index + 1,length, set));
    }
}
