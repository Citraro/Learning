import java.util.*;

class Program {
  public String runLengthEncoding(String string) {
    int count = 1;
		String retString = "";
		for(int i = 1; i < string.length(); i++){
			char currentChar = string.charAt(i);
			char previousChar = string.charAt(i-1);
			if(currentChar != previousChar || count == 9){
				retString += Integer.toString(count) + Character.toString(previousChar);
				count = 0;
			}
			count++;
		}
		
		retString += Integer.toString(count) + string.charAt(string.length() - 1);

    return retString ;
  }
}
