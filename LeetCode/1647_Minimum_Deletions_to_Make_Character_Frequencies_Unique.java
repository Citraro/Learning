class Solution {
    public int minDeletions(String s) {
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            queue.add(entry.getValue());
        }
        
        while(queue.size() > 1){
            int most_freq = queue.remove();
            
            if(most_freq == queue.peek()){
                if(most_freq > 1){
                    queue.add(most_freq - 1);
                }
                count++;
            }
        }
        
        return count;
        
    }
}
