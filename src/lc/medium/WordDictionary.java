package lc.medium;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary 
{
  Node root;
  public WordDictionary() 
  {
    root = new Node();
  }

  public void addWord(String word) 
  {
    Node nxtNode = root;
    for(char c: word.toCharArray()) {
      nxtNode = nxtNode.addNextCharacter(c);
    }
    nxtNode.isWord = true;
  }

  public boolean search(String word) 
  {
    return search(word, 0, root);
  }

  private boolean search(String word, int nxtChr, Node currNode) 
  {
    if (currNode == null) return false;
    if (nxtChr == word.length()) return currNode.isWord;
    
    char nextC = word.charAt(nxtChr);
    if (nextC != '.') {
      return search(word, nxtChr+1, currNode.nextNodes.get(nextC));
    }
    
    for(char c: currNode.nextNodes.keySet()) {
      if (search(word, nxtChr+1, currNode.nextNodes.get(c))) 
        return true;
    }
    return false;
  }
  
  private static class Node {
    Map<Character, Node> nextNodes;
    boolean isWord;
    
    public Node()
    {
      isWord = false;
      nextNodes = new HashMap<>();
    }
    
    public boolean hasNextCharacter(char character)
    {
      return nextNodes.containsKey(character);
    }
    public Node addNextCharacter(char character)
    {
      if (hasNextCharacter(character))
        return nextNodes.get(character);
      
      Node nd = new Node();
      nextNodes.put(character, nd);
      return nd;
    }
  }
}
