class MedianFinder {
    
    private PriorityQueue<Integer> small; 
    private PriorityQueue<Integer> big;
    private int count;

    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        big   = new PriorityQueue<>();
        count = 0;
    }
    
    public void addNum(int num) {
        if(count % 2 == 0){ // even
            big.offer(num);
            small.offer(big.poll());
        }else{
            small.offer(num);
            big.offer(small.poll());
        }
        count++;
    }
    
    public double findMedian() {
        if(count % 2 == 0){
            return (small.peek() + big.peek()) / 2.0;
        }else{
            return small.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
