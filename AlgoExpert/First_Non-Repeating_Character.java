import java.util.*;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    HashMap<Character,Integer> charOccurances = new HashMap<>();
		for(char character : string.toCharArray()){
			charOccurances.put(character,charOccurances.getOrDefault(character,0) + 1);
		}
		
		for(int index = 0; index < string.length(); index++){
			char currentChar = string.charAt(index);
			if(charOccurances.get(currentChar) == 1){
				return index;
			}
		}
    return -1;
  }
}
