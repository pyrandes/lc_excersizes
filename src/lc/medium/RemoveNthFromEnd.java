package lc.medium;

public class RemoveNthFromEnd {
  public ListNode removeNthFromEnd(ListNode head, int n) 
  {
    if (n == 1 && head.next == null) return null;
    
    int size = 0;
    ListNode iter = head, prev = null;
    while(iter != null) {
      size++;
      iter = iter.next;
    }
    
    if (size-n == 0) return head.next;
    
    // now to navigate to the nth node
    iter = head.next;
    prev = head;
    for(int i = 0; i < size-n-1; i++) {
      iter = iter.next;
      prev = prev.next;
    }
    
    prev.next = iter.next;
    
    return head;
  }
  
  
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
