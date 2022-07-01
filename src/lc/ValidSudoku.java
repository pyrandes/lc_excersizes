package lc;

import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
  public boolean isValidSudoku(char[][] board) 
  {
    for(int r = 0; r < board.length; r++)
      if (!isValidRow(board, r)) return false;
    
    for(int c = 0; c < board.length; c++)
      if (!isValidColumn(board, c)) return false;
    
    for(int r = 0; r < board.length; r+=3) {
      for(int c = 0; c < board.length; c+=3) {
        if (!isValidSubboard(board, r, c, r+3, c+3))  return false;
      }
    }
    
    return true;
  }
  
  boolean isValidRow(char[][] board, int r)
  {
    List<Character> l = new ArrayList<>();
    
    for(int c = 0; c < board.length; c++)
    {
      if (board[r][c] == '.') continue;
      if (l.contains(board[r][c])) return false;
      l.add(board[r][c]);
    }
    return true;
  }
  
  boolean isValidColumn(char[][] board, int c)
  {
    List<Character> l = new ArrayList<>();
    
    for(int r = 0; r < board.length; r++)
    {
      if (board[r][c] == '.') continue;
      if (l.contains(board[r][c])) return false;
      l.add(board[r][c]);
    }
    return true;
  }
  
  // check if a 3x3 board is valid
  boolean isValidSubboard(char[][] board, int xl, int yl, int xr, int yr)
  {
    List<Character> l = new ArrayList<>();
    for (int r = xl; r < xr; r++)
    {
      for(int c = yl; c < yr; c++)
      {
        if (board[r][c] == '.') continue;
        if (l.contains(board[r][c])) return false;
        l.add(board[r][c]);
      }
    }
    
    return true;
  }
}



