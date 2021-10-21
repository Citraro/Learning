import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    HashMap<Character,Integer> occurances = new HashMap<>();
		for(char character : characters.toCharArray()){
			occurances.put(character, occurances.getOrDefault(character,0) + 1);
		}
		
		for(char character : document.toCharArray()){
			if(occurances.containsKey(character) && occurances.get(character) != 0){
				occurances.put(character, occurances.get(character) - 1);
			}else{
				return false;
			}
		}
    return true;
  }
}
