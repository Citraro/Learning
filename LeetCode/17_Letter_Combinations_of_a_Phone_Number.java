class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits.length() == 0) return new ArrayList<String>();
        
        HashSet<String> set = new HashSet<>();
        backTrack(set, new StringBuilder(),0,digits);
        
        return new ArrayList<>(set);
    }
    
    private void backTrack(Set<String> set, StringBuilder sb, int i, String digits){
        
        if(digits.length() == sb.length()) {
            set.add(sb.toString());
            return;
        }
        
        String letters = numToLetters(digits.charAt(i));
        for(int j = 0; j < letters.length(); j++){
            sb.append(letters.charAt(j));
            backTrack(set,sb,i+1,digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    private String numToLetters(char c){
        switch(c) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return null;
        }
    }
}
