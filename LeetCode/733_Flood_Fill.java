class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int oldColor = image[sr][sc];
        boolean[][] isDone = new boolean[image.length][image[0].length];
        
        fill(image,isDone,sr,sc,newColor,oldColor);
        return image;
    }
    
    public void fill(int[][] image, boolean[][] isDone, int sr, int sc, int newColor, int oldColor){
        if(sr >= 0 && sr < image.length && sc >= 0 && sc < image[0].length && image[sr][sc] == oldColor && isDone[sr][sc] == false){
            isDone[sr][sc] = true;
            image[sr][sc] = newColor;
            fill(image,isDone,sr+1,sc,newColor,oldColor);
            fill(image,isDone,sr,sc+1,newColor,oldColor);
            fill(image,isDone,sr-1,sc,newColor,oldColor);
            fill(image,isDone,sr,sc-1,newColor,oldColor);
        }else{
            return;
        }
    }
}
