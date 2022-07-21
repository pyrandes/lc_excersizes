package lc.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lc.medium.RemoveNthFromEnd.ListNode;

class RemoveNthFromEndTest {

  @Test
  void test1() {
    RemoveNthFromEnd rl = new RemoveNthFromEnd();
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
    
    ListNode actRslt = rl.removeNthFromEnd(head, 2);
    int[] expList = {1, 2, 3, 5};
    for(int exp: expList) {
      assertNotNull(actRslt);
      assertEquals(exp, actRslt.val);
      actRslt = actRslt.next;
    }
  }

  @Test
  void test1a() {
    RemoveNthFromEnd rl = new RemoveNthFromEnd();
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
    
    ListNode actRslt = rl.removeNthFromEnd(head, 5);
    int[] expList = {2, 3, 4, 5};
    for(int exp: expList) {
      assertNotNull(actRslt);
      assertEquals(exp, actRslt.val);
      actRslt = actRslt.next;
    }
  }
  
  @Test
  void test2() {
    RemoveNthFromEnd rl = new RemoveNthFromEnd();
    ListNode head = new ListNode(1);
    
    ListNode actRslt = rl.removeNthFromEnd(head, 1);
    
    assertNull(actRslt);
  }
  
  @Test
  void test3() {
    RemoveNthFromEnd rl = new RemoveNthFromEnd();
    ListNode head = new ListNode(1, new ListNode(2));
    
    ListNode actRslt = rl.removeNthFromEnd(head, 1);
    int[] expList = {1};
    for(int exp: expList) {
      assertNotNull(actRslt);
      assertEquals(exp, actRslt.val);
      actRslt = actRslt.next;
    }
  }
}
