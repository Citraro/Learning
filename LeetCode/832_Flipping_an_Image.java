class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int count = 0;
        int[][] result = new int[image.length][image[0].length];
        for(int[] bits : image){
            int start = 0;
            int end   = bits.length-1;
            while(start <= end){
                if(start == end){
                    bits[start] = bits[start] == 1 ? 0 : 1;
                }else {
                    int temp = bits[start];
                    bits[start] = bits[end] == 1 ? 0 : 1;
                    bits[end] = temp == 1 ? 0 : 1;
                }
                start++;
                end--;
            }
            result[count] = bits;
            count++;
        }
        
        return result;
    }
}
