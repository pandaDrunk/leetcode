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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode p = new ListNode(0);
        p.next=head;
        head=p;//a safeguard node
        while(p.next!=null&&p.next.next!=null){
            if(p.next.val==p.next.next.val){
                ListNode q=p.next.next;
                while(q.next!=null&&p.next.val==q.next.val){
                    q=q.next;
                }//skip all duplicates
                p.next=q.next;
            }
            else {
                p=p.next;
            }
        }
        return head.next;
    }
}