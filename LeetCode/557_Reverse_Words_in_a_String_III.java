class Solution {
    public String reverseWords(String s) {
        
        String reversed = "";
        
        int left = 0;
        int right = 0;
        
        while(right < s.length()){
            if(s.charAt(right) == ' '){
                reversed += reversedWord(s,left,right-1) + " ";
                left = right + 1;
            }else if(right == s.length() - 1){
                reversed += reversedWord(s,left,right);
            }
            right++;
        }
        
        return reversed;
    }
    
    private String reversedWord(String s, int start, int end){
        String revString = "";        
        while(end != start - 1){
            revString += s.charAt(end--) + "";
        }
        return revString;
    }
}
