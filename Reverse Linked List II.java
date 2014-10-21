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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode rev = new ListNode(0);
        rev.next=head;
        ListNode begin=rev;
        ListNode cur=rev;
        ListNode prev=rev;
        for(int i=1;i<=n;i++){
            if(i<m){
                begin=begin.next;
            } else if(i==m){
                prev=begin.next;
                cur=prev.next;
            } else {
                prev.next=cur.next;
                cur.next=begin.next;
                begin.next=cur;
                cur=prev.next;
            }
        }
        return rev.next;
    }
}