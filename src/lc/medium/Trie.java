package lc.medium;

import java.util.HashMap;
import java.util.Map;

public class Trie 
{
  Node root;
  public Trie() 
  {
    root = new Node();
  }

  public void insert(String word) 
  {
    Node nxtNode = root;
    for(char c: word.toCharArray()) {
      nxtNode = nxtNode.addNextCharacter(c);
    }
    nxtNode.isWord = true;
  }

  public boolean search(String word) 
  {
    Node nxtNode = root;
    for(char c: word.toCharArray()) {
      nxtNode = nxtNode.getNextCharacter(c);
      if (nxtNode == null) return false;
    }
    return nxtNode.isWord;
  }

  public boolean startsWith(String prefix) 
  {
    Node nxtNode = root;
    for(char c: prefix.toCharArray()) {
      nxtNode = nxtNode.getNextCharacter(c);
      if (nxtNode == null) return false;
    }
    return true;
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
    public Node getNextCharacter(char character)
    {
      if (hasNextCharacter(character))
        return nextNodes.get(character);
      
      return null;
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

/**
* Your Trie object will be instantiated and called as such:
* Trie obj = new Trie();
* obj.insert(word);
* boolean param_2 = obj.search(word);
* boolean param_3 = obj.startsWith(prefix);
*/