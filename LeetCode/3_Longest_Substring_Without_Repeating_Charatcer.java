class Solution {
    public int lengthOfLongestSubstring(String s) {
 
        HashMap<Character,Integer> map = new HashMap<>();

        int start = 0;
        int maxLength = 0;
        
        for(int end = 0; end < s.length(); end++){
            char currentChar = s.charAt(end);
            
            if(map.containsKey(currentChar)){
                start = Math.max(start, map.get(currentChar)+1);
            }
            
            map.put(currentChar,end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        
        return maxLength;
    }
}
