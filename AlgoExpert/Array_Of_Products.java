import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    int[] products = new int[array.length];
		int totalProduct = 1;
		int totalProdWithoutZeros = 1;
		int countOfZeros = 0;
		Arrays.fill(products, 0); // o(n)
		
		for(int num : array){
			if(num != 0){
				totalProdWithoutZeros *= num;
			}
			if(num == 0)
				countOfZeros++;
			totalProduct*= num;
		}
		
		if(countOfZeros > 1) return products;
		
		for (int i = 0; i < array.length; i++){
			if (totalProduct == 0){
				if(array[i] == 0){
					products[i] = totalProdWithoutZeros;
				}
			} else {
				products[i] = totalProduct / array[i];
			}
		}

    return products;
  }
}
