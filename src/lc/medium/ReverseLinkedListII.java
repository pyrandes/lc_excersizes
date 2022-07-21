package lc.medium;

public class ReverseLinkedListII {
  public ListNode reverseBetween(ListNode head, int left, int right) 
  {
    if (left >= right) return head;  // no need to do anything
    
    int lcntr = 0;
    ListNode h = new ListNode();
    
    ListNode iter = head, hiter = h;
    h.next = iter;
    
    while(iter.next != null) {
      lcntr++;
      if (lcntr < left || lcntr >= right) {
        iter = iter.next;
        hiter = hiter.next;       
        continue;
      }
      
      ListNode next = iter.next;
      iter.next = next.next;
      next.next = hiter.next;
      hiter.next = next;
    }
    
    return h.next;
  }
  
  
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
