class FreqStack {

    int index;
    PriorityQueue<int[]> pq;
    Map<Integer,Integer> map;
    
    public FreqStack() {
        index = 0;
        pq = new PriorityQueue<>((a,b)->(a[1] != b[1] ? b[1] - a[1] : b[2] - a[2]));
        map = new HashMap<>();
    }
    
    //o(log(n))
    public void push(int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
        pq.offer(new int[]{val, map.get(val), index++});
    }
    
    //o(1)
    public int pop() {
        int val = pq.poll()[0];
        map.put(val,map.get(val) - 1);
        if(map.get(val) == 0){
            map.remove(val);
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
