package lc.hard;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordSearchIITest {

  WordSearchII ws;
  
  @BeforeEach
  void setUp() throws Exception {
    ws = new WordSearchII();
  }

  @Test
  void test() {
    char[][] board = {
        {'o','a','a','n'},
        {'e','t','a','e'},
        {'i','h','k','r'},
        {'i','f','l','v'}
    };
    String[] words = {
        "oath","pea","eat","rain"
    };
    
    List<String> foundWords = ws.findWords(board, words);
    assertTrue(foundWords.contains("oath") && foundWords.contains("eat"));
    
  }

  
  @Test
  void test2() {
    char[][] board = {
        {'a','b'},
        {'c','d'}
    };
    String[] words = {
        "abcb"
    };
    
    List<String> foundWords = ws.findWords(board, words);
    assertTrue(foundWords.isEmpty());
    
  }
  
  @Test
  void test3() {
    char[][] board = {
        {'a','b','c','e'},
        {'x','x','c','d'},
        {'x','x','b','a'}
    };
    String[] words = {
        "abc","abcd"
    };
    
    List<String> foundWords = ws.findWords(board, words);
    assertTrue(foundWords.contains("abc") && foundWords.contains("abcd"));
    
  }
  
  @Test
  void test4() {
    char[][] board = {
        {'o','a','a','n'},
        {'e','t','a','e'},
        {'i','h','k','r'},
        {'i','f','l','v'}
    };
    String[] words = {
        "oath","pea","eat","rain","hklf","hf"
    };
    
    List<String> foundWords = ws.findWords(board, words);
    assertTrue(
        foundWords.contains("oath") && foundWords.contains("eat") &&
        foundWords.contains("hklf") && foundWords.contains("hf"));
    
  }
  
  @Test
  void test5() {
    char[][] board = {
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'},
        {'a','a','a','a','a','a','a','a','a','a','a','a'}       
    };
    String[] words = {"lllllll","fffffff","ssss","s","rr","xxxx","ttt","eee","ppppppp","iiiiiiiii","xxxxxxxxxx","pppppp","xxxxxx","yy","jj","ccc","zzz","ffffffff","r","mmmmmmmmm","tttttttt","mm","ttttt","qqqqqqqqqq","z","aaaaaaaa","nnnnnnnnn","v","g","ddddddd","eeeeeeeee","aaaaaaa","ee","n","kkkkkkkkk","ff","qq","vvvvv","kkkk","e","nnn","ooo","kkkkk","o","ooooooo","jjj","lll","ssssssss","mmmm","qqqqq","gggggg","rrrrrrrrrr","iiii","bbbbbbbbb","aaaaaa","hhhh","qqq","zzzzzzzzz","xxxxxxxxx","ww","iiiiiii","pp","vvvvvvvvvv","eeeee","nnnnnnn","nnnnnn","nn","nnnnnnnn","wwwwwwww","vvvvvvvv","fffffffff","aaa","p","ddd","ppppppppp","fffff","aaaaaaaaa","oooooooo","jjjj","xxx","zz","hhhhh","uuuuu","f","ddddddddd","zzzzzz","cccccc","kkkkkk","bbbbbbbb","hhhhhhhhhh","uuuuuuu","cccccccccc","jjjjj","gg","ppp","ccccccccc","rrrrrr","c","cccccccc","yyyyy","uuuu","jjjjjjjj","bb","hhh","l","u","yyyyyy","vvv","mmm","ffffff","eeeeeee","qqqqqqq","zzzzzzzzzz","ggg","zzzzzzz","dddddddddd","jjjjjjj","bbbbb","ttttttt","dddddddd","wwwwwww","vvvvvv","iii","ttttttttt","ggggggg","xx","oooooo","cc","rrrr","qqqq","sssssss","oooo","lllllllll","ii","tttttttttt","uuuuuu","kkkkkkkk","wwwwwwwwww","pppppppppp","uuuuuuuu","yyyyyyy","cccc","ggggg","ddddd","llllllllll","tttt","pppppppp","rrrrrrr","nnnn","x","yyy","iiiiiiiiii","iiiiii","llll","nnnnnnnnnn","aaaaaaaaaa","eeeeeeeeee","m","uuu","rrrrrrrr","h","b","vvvvvvv","ll","vv","mmmmmmm","zzzzz","uu","ccccccc","xxxxxxx","ss","eeeeeeee","llllllll","eeee","y","ppppp","qqqqqq","mmmmmm","gggg","yyyyyyyyy","jjjjjj","rrrrr","a","bbbb","ssssss","sss","ooooo","ffffffffff","kkk","xxxxxxxx","wwwwwwwww","w","iiiiiiii","ffff","dddddd","bbbbbb","uuuuuuuuu","kkkkkkk","gggggggggg","qqqqqqqq","vvvvvvvvv","bbbbbbbbbb","nnnnn","tt","wwww","iiiii","hhhhhhh","zzzzzzzz","ssssssssss","j","fff","bbbbbbb","aaaa","mmmmmmmmmm","jjjjjjjjjj","sssss","yyyyyyyy","hh","q","rrrrrrrrr","mmmmmmmm","wwwww","www","rrr","lllll","uuuuuuuuuu","oo","jjjjjjjjj","dddd","pppp","hhhhhhhhh","kk","gggggggg","xxxxx","vvvv","d","qqqqqqqqq","dd","ggggggggg","t","yyyy","bbb","yyyyyyyyyy","tttttt","ccccc","aa","eeeeee","llllll","kkkkkkkkkk","sssssssss","i","hhhhhh","oooooooooo","wwwwww","ooooooooo","zzzz","k","hhhhhhhh","aaaaa","mmmmm"};
    
    List<String> foundWords = ws.findWords(board, words);
    assertTrue(
        foundWords.contains("aaaaaa") && foundWords.contains("a") &&
        foundWords.contains("aaaaaaaa") && foundWords.contains("aaaaa"));
    
  }
}
