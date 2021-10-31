class Solution {
    public String interpret(String command) {
        String returnString = "";
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                returnString += "G";
            } else if (command.charAt(i) == '('){
                if(command.charAt(i+1) == 'a') {
                    returnString += "al";
                } else {
                    returnString += "o"; 
                }
            }
        }
        return returnString;
    }
}
