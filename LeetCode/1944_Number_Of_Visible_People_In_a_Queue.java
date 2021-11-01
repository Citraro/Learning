class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int len = heights.length;
        int[] resultant = new int[len];
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < len; i++){
            while(!stack.isEmpty() && heights[stack.peek()] < heights[i]){
                resultant[stack.pop()] += 1;
            }
            if(!stack.isEmpty()){
                resultant[stack.peek()] += 1;
            }
            stack.push(i);
        }
        return resultant;
    }
}
