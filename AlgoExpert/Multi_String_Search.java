import java.util.*;

class Program {
  public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
    Trie trie = new Trie();
		for(String smallString : smallStrings){
			trie.insert(smallString);
		}
		
		Set<String> containedStrings = new HashSet<String>();
		
		for(int i = 0; i < bigString.length(); i++){
			findSmallSubstringIn(bigString,i, trie, containedStrings);
		}
		
		List<Boolean> result = new ArrayList<Boolean>();
		
		for(String str : smallStrings) {
			result.add(containedStrings.contains(str));
		}
		
    return result;
  }
	
	public static void findSmallSubstringIn(String big, int startIndex, Trie trie, Set<String> containedStrings){
		TrieNode currentNode = trie.root;
		for(int i = startIndex; i < big.length(); i++){
			char currentChar = big.charAt(i);
			if(!currentNode.children.containsKey(currentChar)){
				break;
			}
			currentNode = currentNode.children.get(currentChar);
			if(currentNode.children.containsKey(trie.endSymbol)){
				containedStrings.add(currentNode.word);
			}
		}
	}
	
	
	static class TrieNode {
		Map<Character, TrieNode> children = new HashMap<>();
		String word;
	}

	static class Trie { 
		TrieNode root = new TrieNode();
		char endSymbol = '*';

		public void insert(String str){
			TrieNode node = root;
			for(int i = 0; i < str.length(); i++){
				char letter = str.charAt(i);
				if(!node.children.containsKey(letter)){
					node.children.put(letter, new TrieNode());
				}
				node = node.children.get(letter);
			}
			node.children.put(endSymbol,null);
			node.word = str;
		}
	}
}
