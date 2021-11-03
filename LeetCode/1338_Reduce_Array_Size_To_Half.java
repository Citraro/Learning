class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); //o(logn)
        HashMap<Integer,Integer> map = new HashMap<>();
        int numToRemove = 0;
        int remainingNum = 0;
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i : map.values()){
            queue.offer(i);
        }
        
        while(remainingNum < arr.length / 2) {
            remainingNum += queue.poll();
            numToRemove++;
        }
        
        return numToRemove;
    }
}
