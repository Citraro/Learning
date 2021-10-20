import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    int len = str.length() - 1;
		int counter = 0;
		while(counter < len - counter){
			if(str.charAt(counter) != str.charAt(len-counter)){
				return false;
			}
			counter++;
		}
    return true;
  }
}
