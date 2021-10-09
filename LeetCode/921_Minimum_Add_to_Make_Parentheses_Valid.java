class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0;
        int right = 0;
        
        int pairs = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                left++;              
            }else if(s.charAt(i) == ')'){
                if(left > 0){
                    pairs++;
                    left--;
                    right--;
                }else{
                    right++;
                }
                    
            }
        }
        
        int result = 0;
        if(pairs > 0){
            result = s.length() - (pairs * 2);
        }else{
            result = left + right;
        }
        
        return result;
    }
}
