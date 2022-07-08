package lc.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements 
{
  // return the <k> most frequent elements from <nums>
  public int[] topKFrequent(int[] nums, int k)
  {
    int[] freq = new int[k];
    Map<Integer, Integer> freqMap = new HashMap<>();
    for(int num: nums)
    {
      if(!freqMap.containsKey(num)) 
        freqMap.put(num, 0);
      freqMap.replace(num, freqMap.get(num)+1);
    }
    
    // now we know how often these appear, sort these by frequency of appearance
    Queue<Node> heap = new PriorityQueue<>();
    for(int num: freqMap.keySet()) {
      heap.add(new Node(num, freqMap.get(num)));
    }
    
    for(int i = 0; i < k; i++) {
      freq[i] = heap.poll().num;
    }
    
    return freq;
  }
  
  public static class Node implements Comparable<Node>, Comparator<Node> 
  {
    int num;
    int freq;
    public Node(int num, int freq) {
      this.num = num;
      this.freq = freq;
    }
    
    @Override
    public int compare(Node o1, Node o2) {
      return o1.compare(o1, o2);
    }
    @Override
    public int compareTo(Node o) {
      return  o.freq - this.freq;
    }
    
    @Override
    public String toString() {
      // TODO Auto-generated method stub
      return "[" + num + "-" + freq + "]";
    }
  }
}
