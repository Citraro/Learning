class Solution {
    public int[] sumZero(int n) {
        if(n == 1) return new int[1];
        int[] result = new int[n];
        
        int middle = n / 2;
        int left = middle - 1;
        int right = middle;
        
        helper(result,left,right);
        return result;
    }
    
    public void helper(int[] result, int left, int right){
        int count = 1;
        while(left >= 0 && right < result.length){
            result[left--] = 0 - count;
            result[right++]= count;
            count++;
        }
        if(result[result.length - 1] == 0){
            result[result.length - 1] = count;
            result[0] = 0 - result[result.length - 1] - result[result.length - 2];
        }
    }
}
