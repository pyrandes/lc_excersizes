package lc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidSudokuTest {
  ValidSudoku t;
  
  @BeforeEach
  void setUp() throws Exception {
    t = new ValidSudoku();
  }

  @Test
  void test() {
    char[][] board = 
      {{'5','3','.','.','7','.','.','.','.'}
      ,{'6','.','.','1','9','5','.','.','.'}
      ,{'.','9','8','.','.','.','.','6','.'}
      ,{'8','.','.','.','6','.','.','.','3'}
      ,{'4','.','.','8','.','3','.','.','1'}
      ,{'7','.','.','.','2','.','.','.','6'}
      ,{'.','6','.','.','.','.','2','8','.'}
      ,{'.','.','.','4','1','9','.','.','5'}
      ,{'.','.','.','.','8','.','.','7','9'}};
    assertTrue(t.isValidSudoku(board));
  }

}
