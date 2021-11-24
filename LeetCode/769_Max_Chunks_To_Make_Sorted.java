class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
            if(max == i){
                answer++;
            }
        }
        return answer;
    }
}
