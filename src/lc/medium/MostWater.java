package lc.medium;

public class MostWater {

	public int maxArea(int[] height)
	{
	  // no water can be contained with 1 or 0 elements
	  if (height.length < 2) return 0; 
	  
	  // max distance vs max height[i]
	  
	  // height   = min(height[i], height[j])
	  // distance = j - i (i < j) 
	  int i = 0, j = height.length-1, area = 0;
	  while (i < j) {
	    area = height[i] < height[j] ? 
	        Math.max(area, height[i] * (j-i++)) :
	        Math.max(area, height[j] * ((j--)-i));
	  }
	  return area;
	}
	
	
}


 
