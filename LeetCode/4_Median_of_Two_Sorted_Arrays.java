class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length){
            return findMedium(nums2,nums2.length,nums1,nums1.length);
        }else{
            return findMedium(nums1,nums1.length,nums2,nums2.length);
        }
    }
    
    public double findMedium(int[] a, int n, int[] b, int m){
        int leftHalfSize = (n + m + 1) / 2;
        int aMaxCount = n;
        int aMinCount = 0;
        
        while(aMinCount <= aMaxCount){
            int aCount = aMinCount + ((aMinCount - aMinCount) / 2);
            int bCount = leftHalfSize - aCount;
            
            if( aCount > 0 && a[aCount - 1]> b[bCount] ){
                aMaxCount = aCount - 1;
            } else if ( aCount < n && b[bCount - 1] > a[aCount]){
                aMinCount = aCount + 1;
            } else {
                int leftHalfEnd = (aCount == 0) 
                    ? b[bCount - 1] 
                    : (bCount == 0) 
                        ? a[aCount - 1] 
                        : Math.max(a[aCount - 1],b[bCount - 1]);
                
                if((n+m) % 2 == 1){
                    return leftHalfEnd;
                }
                
                int rightHalfStart = (aCount == n) 
                    ? b[bCount]
                    : (bCount == m)
                        ? a[aCount]
                        : Math.min(a[aCount],b[bCount]);
                return (leftHalfEnd + rightHalfStart) / 2.0;
            }
        }
        return 0;
    }
}
