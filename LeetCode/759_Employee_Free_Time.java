/*
// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};
*/

class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        PriorityQueue<Interval> allIntervals = new PriorityQueue<>((i1,i2) -> i1.start-i2.start);
        
        List<Interval> result = new ArrayList<>();
        
        for(List<Interval> list : schedule) {
            allIntervals.addAll(list);
        }
        
        while(allIntervals.size() > 1){
            Interval first = allIntervals.poll();
            Interval second = allIntervals.poll();
            
            if(second.start > first.end){
                result.add(new Interval(first.end,second.start));
            }
            
            if(first.end > second.end){
                allIntervals.add(first);
            }else{
                allIntervals.add(second);
            }
        }
        return result;
    }
}
