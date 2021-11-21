class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int[] sum1 = new int[arr1.length];
        int[] dif1 = new int[arr1.length];
        int[] sum2 = new int[arr1.length];
        int[] dif2 = new int[arr1.length];
        
        for(int i = 0; i < arr1.length; i++){
            sum1[i] = arr1[i] + arr2[i] + i;
            dif1[i] = arr1[i] - arr2[i] + i;
            sum2[i] = arr1[i] + arr2[i] - i;
            dif2[i] = arr1[i] - arr2[i] - i;
        }
        
        return Math.max(Math.max(helper(sum1),helper(dif1)),Math.max(helper(sum2),helper(dif2)));
    }
    
    public int helper(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        
        return (max-min);
    }
}
