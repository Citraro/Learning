  class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> time = new PriorityQueue<>();
        time.add(intervals[0][1]);
        for(int i = 1; i < intervals.length; i++){
            if(time.peek() <= intervals[i][0]){
                time.poll();
            }
            time.offer(intervals[i][1]);
            
        }
        return time.size();
    }
}
