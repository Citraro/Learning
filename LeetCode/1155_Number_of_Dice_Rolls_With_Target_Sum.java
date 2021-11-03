class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsArray = new int[26];
        int count = 0;
        for(char c : chars.toCharArray()){
            charsArray[c-'a']++;
        }
        MAIN:
        for(String word : words){
            int[] wordArray = new int[26];
            for(char c : word.toCharArray()){
                wordArray[c-'a']++;
            }
            boolean isValid = true;
            for(int i = 0; i < 26; i++){
                if(wordArray[i] > 0 && wordArray[i] > charsArray[i]){
                    isValid = false;
                }
            }
            if(isValid){
                count += word.length();        
            }
        }
        return count;
    }
}
