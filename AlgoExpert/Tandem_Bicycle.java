import java.util.*;

class Program {

  public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
		int totalSpeed = 0;
		Arrays.sort(redShirtSpeeds);
		Arrays.sort(blueShirtSpeeds);

		if(!fastest){
			reverse(blueShirtSpeeds);
		}
		
		for(int i = 0; i < redShirtSpeeds.length; i++){
			totalSpeed += Math.max(redShirtSpeeds[i],blueShirtSpeeds[blueShirtSpeeds.length - i - 1]);
		}
    return totalSpeed;
  }
	
	public void reverse(int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start < end){
			int temp = array[start];
			array[start++] = array[end];
			array[end--] = temp;
		}
	}
}
