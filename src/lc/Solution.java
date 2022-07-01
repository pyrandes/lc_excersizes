package lc;

import java.util.PriorityQueue;

public class Solution {
	public static void main(String args[]) {
	  int[] nums1 = {1, 3, 5, 7};
	  int[] nums2 = {2};
	  
	  System.out.print(findMedianSortedArrays(nums1, nums2));
	}
	
	public static float findMedianSortedArrays(int[] nums1, int[] nums2)
	{
	  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(),
	                         minHeap = new PriorityQueue<>();
	 
	  for (int i = 0; i < nums1.length; i++)
	  {
	    if (i < nums1.length/2-1) 
	      maxHeap.add(nums1[i] * -1);
	    else
	      minHeap.add(nums1[i]);
	  }
	  
	  for(int j = 0; j < nums2.length; j++)
	  {
	    if (maxHeap.isEmpty()) {
	      maxHeap.add(-1*nums2[j]);
	    } else if (maxHeap.peek()*-1 < nums2[j]) {
	      minHeap.add(nums2[j]);
	    }
	    
	    if (!minHeap.isEmpty() || nums2[j] < minHeap.peek()) {
	      maxHeap.add(-1*nums2[j]);
	    } else {
	      minHeap.add(nums2[j]);
	    }
	    
	    if (maxHeap.size() - minHeap.size() > 1) {
	      minHeap.add(-1*maxHeap.remove());
	    } else if (maxHeap.size() - minHeap.size() < -1) {
	      maxHeap.add(-1*minHeap.remove());
	    }
	  }
	  
	  
	  if (minHeap.size() < maxHeap.size()) {
	    return maxHeap.peek() * -1;
	  } 
	  if (maxHeap.size() < minHeap.size()) {
	    return minHeap.peek();
	  }
	  return (minHeap.peek() + (-1)*maxHeap.peek()) / 2f; 
	  
	}
	

}


 
