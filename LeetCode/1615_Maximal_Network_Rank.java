class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        int[] numberOfRoadsConnectedToCity = new int[n];
        
        boolean[][] roadExists = new boolean[n][n];
        
        for(int[] cities : roads){
            numberOfRoadsConnectedToCity[cities[0]]++;
            numberOfRoadsConnectedToCity[cities[1]]++;
            
            roadExists[cities[0]][cities[1]] = true;
            roadExists[cities[1]][cities[0]] = true;            
        }
        
        int maxRank = 0;
        for(int city1 = 0; city1 < n - 1; city1++){
            for(int city2 = city1 + 1; city2 < n; city2++){
                
                int rank = numberOfRoadsConnectedToCity[city1] + numberOfRoadsConnectedToCity[city2];
                
                if(roadExists[city1][city2]) rank--;
                
                maxRank = Math.max(maxRank,rank);
            }
        }
        
        return maxRank;
        
    }
}
