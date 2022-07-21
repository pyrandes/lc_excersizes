package lc.medium;

import static org.junit.jupiter.api.Assertions.*;
import static lc.medium.ReverseLinkedListII.ListNode;
import org.junit.jupiter.api.Test;

class ReverseLinkedListIITest {

  @Test
  void test1() {
    ReverseLinkedListII rl = new ReverseLinkedListII();
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
    
    ListNode actRslt = rl.reverseBetween(head, 2, 4);
    int[] expList = {1, 4, 3, 2, 5};
    for(int exp: expList) {
      assertNotNull(actRslt);
      assertEquals(exp, actRslt.val);
      actRslt = actRslt.next;
    }
  }

  @Test
  void test1a() {
    ReverseLinkedListII rl = new ReverseLinkedListII();
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5)))));
    
    ListNode actRslt = rl.reverseBetween(head, 1, 5);
    int[] expList = {5, 4, 3, 2, 1};
    for(int exp: expList) {
      assertNotNull(actRslt);
      assertEquals(exp, actRslt.val);
      actRslt = actRslt.next;
    }
  }
  
  @Test
  void test2() {
    ReverseLinkedListII rl = new ReverseLinkedListII();
    ListNode head = new ListNode(5);
    
    ListNode actRslt = rl.reverseBetween(head, 1, 1);
    int[] expList = {5};
    for(int exp: expList) {
      assertNotNull(actRslt);
      assertEquals(exp, actRslt.val);
      actRslt = actRslt.next;
    }
  }

}
