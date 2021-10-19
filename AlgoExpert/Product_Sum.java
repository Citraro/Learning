import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return productSumHelper(array, 1);
  }
	
	public static int productSumHelper(List<Object> array, int depth){
		int sum = 0;
		for(Object obj : array){
			if(obj instanceof ArrayList){
				List<Object> innerObj = (ArrayList<Object>) obj;
				sum += productSumHelper(innerObj, depth + 1);
			}else{
				sum += (int) obj;
			}
		}
		return sum * depth;
	}
}
