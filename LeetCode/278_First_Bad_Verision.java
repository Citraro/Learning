/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int mid = n / 2;
        if(isBadVersion(mid)){
            return firstBadVersion(0, mid, mid);
        }
        return firstBadVersion(mid+1, n, n);
    }
    
    public int firstBadVersion(int start, int end, int minBad){
        
        if(start >= end){
            return minBad;
        }
        
        int mid = start + (end - start) / 2;
        
        if(isBadVersion(mid)){
            return firstBadVersion(start,mid,mid);
        }else{
            return firstBadVersion(mid+1,end,minBad);
        }
    }
}