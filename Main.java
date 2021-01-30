/*
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

Input: 0->2->5, 2->3->4
Output: 0->2->2->3->4->5


*/

class Main {

  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode result = head;

    ListNode p1 = l1;
    ListNode p2 = l2;

    while (p1 != null && p2 != null) {
      if (p1.val < p2.val) {
        result.next = p1;
        p1 = p1.next;
      } else {
        result.next = p2;
        p2 = p1.next;      
      }
      result = result.next;
    }

    if (p1 != null)
      result.next = p1;

    if (p2 != null)
      result.next = p2;
  
    return head.next;
  }

  public static void main(String[] args) {
    
  }
}