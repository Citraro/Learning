import java.util.*;

class Program {

  public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
		boolean flag = true;
		int pos = 0;
		Collections.sort(redShirtHeights, Collections.reverseOrder());
		Collections.sort(blueShirtHeights, Collections.reverseOrder());
		
    if(redShirtHeights.get(pos) > blueShirtHeights.get(pos)){
			while(pos < redShirtHeights.size()){
				if(redShirtHeights.get(pos) <= blueShirtHeights.get(pos)){
					flag = false;
				}
				pos++;
			}
		} else if(redShirtHeights.get(pos) < blueShirtHeights.get(pos)){
			while(pos < redShirtHeights.size()){
				if(redShirtHeights.get(pos) >= blueShirtHeights.get(pos)){
					flag = false;
				}
				pos++;
			}
		} else {
			flag = false;
		}
    return flag;
  }
}
