package lc.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfMatchingSubsequences {

  public int numMatchingSubseq(String s, String[] words)
  {
    int matchCnt = 0;
    Map<String, Integer> wordFreq = new HashMap<>();
    Arrays.stream(words).forEach(word -> wordFreq.put(word, wordFreq.getOrDefault(word, 0)+1));
    for(String word:wordFreq.keySet()) {
      int j = 0;
      for(int i = 0; i < s.length() && j < word.length(); i++)
      {
        char c = s.charAt(i);
        char wc = word.charAt(j);
        if (c == wc) j++;
      }
      if (j == word.length()) matchCnt += wordFreq.get(word);
    }
    return matchCnt;
  }

}
