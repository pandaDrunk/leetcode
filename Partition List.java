/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null) return head;
        ListNode less = new ListNode(0);
        ListNode notless = new ListNode(0);
        ListNode lesshead = less;
        ListNode notlesshead = notless;
        while(head!=null){
            if(head.val<x){
                less.next=head;
                less=less.next;
            }
            else {
                notless.next=head;
                notless=notless.next;
            }
            head=head.next;
        }
        notless.next=null;
        less.next=notlesshead.next;
        
        return lesshead.next;
        
    }
}