class Solution {
    public int maxPower(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int max = 1;
        int currentRun = 1;
        char current = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(current == s.charAt(i)){
                currentRun++;
            }else{
                current = s.charAt(i);
                currentRun = 1;
            }
            max = Math.max(max,currentRun);
        }
        return max;
    }
}
