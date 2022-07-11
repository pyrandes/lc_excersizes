package lc.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSearchII {  
  Trie dict = new Trie();
  int rowSize, colSize;
  List<String> foundWords;
  
  public List<String> findWords(char[][] board, String[] words) 
  {
    for(String word:words) {
      dict.insert(word);
    }
    
    rowSize = board.length;
    colSize = board[0].length;
    
    foundWords = new ArrayList<>();
    
    for(int r = 0; r < rowSize; r++) {
      for(int c = 0; c < colSize; c++) {
        findWords(board, r, c, dict.root);
      }
    }
    
    return foundWords;
  }
  
  
  private void findWords(char[][] board, int r, int c, Trie.Node node) 
  {
    if (r < 0 || r >= rowSize || c < 0 || c >= colSize || board[r][c] == '#') return;
    
    char ch = board[r][c];
    Trie.Node tnode = node.nextNodes.get(ch);

    if (tnode == null) {
      return;
    }
    if (!tnode.word.isEmpty()) {
      foundWords.add(tnode.word);
      tnode.word = "";
    }
        
    board[r][c] = '#';
    findWords(board, r+1, c, tnode);
    findWords(board, r-1, c, tnode);
    findWords(board, r, c+1, tnode);
    findWords(board, r, c-1, tnode);
    board[r][c] = ch;  
    
  }
  
  
  private class Trie 
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
      nxtNode.word = word;
    }

    public Node search(String word) 
    {
      Node nxtNode = root;
      for(char c: word.toCharArray()) {
        nxtNode = nxtNode.getNextCharacter(c);
        if (nxtNode == null) return null;
      }
      return nxtNode;
    }
    
    public class Node {
      Map<Character, Node> nextNodes;
      String word;
      
      public Node()
      {
        word = "";
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
}
