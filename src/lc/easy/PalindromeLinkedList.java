package lc.easy;

import java.util.Stack;

public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) 
  {
    Stack<Integer> stack = new Stack<>();
    
    int size = 0;
    ListNode slow = head, fast = head;
    while(slow != null) {
      size++;
      slow = slow.next;
    }
    
    slow = head;
    while(fast != null) {
      stack.push(slow.val);
      slow = slow.next;
      fast = fast.next == null ? null : fast.next.next;
    }
    
    if (size %2 == 1) stack.pop();
    
    while(slow != null && !stack.isEmpty()) 
    {
      int val = stack.pop();
      if (val != slow.val) return false;
      slow = slow.next;
    }
    
    return stack.isEmpty();
  }
  
  
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
