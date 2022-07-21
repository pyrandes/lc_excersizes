package lc.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lc.easy.PalindromeLinkedList.ListNode;

class PalindromeLinkedListTest {

  @Test
  void test1() {
    PalindromeLinkedList pll = new PalindromeLinkedList();
    
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(2,  new ListNode(1))));
    
    assertTrue(pll.isPalindrome(head));
  }

  @Test
  void test2() {
    PalindromeLinkedList pll = new PalindromeLinkedList();
    
    ListNode head = new ListNode(1, new ListNode(2));
    
    assertFalse(pll.isPalindrome(head));
  }
  
  
  @Test
  void test3() {
    PalindromeLinkedList pll = new PalindromeLinkedList();
    
    ListNode head = new ListNode(1, new ListNode(3, new ListNode(1)));
    
    assertTrue(pll.isPalindrome(head));
  }
  
  @Test
  void test4() {
    PalindromeLinkedList pll = new PalindromeLinkedList();
    
    ListNode head = new ListNode(1, new ListNode(1));
    
    assertTrue(pll.isPalindrome(head));
  }
  
  @Test
  void test5() {
    PalindromeLinkedList pll = new PalindromeLinkedList();
    
    ListNode head = new ListNode(1);
    
    assertTrue(pll.isPalindrome(head));
  }
}
