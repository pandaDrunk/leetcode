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
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null||n==0) return head;
        ListNode p = head;
        int length=1;
        int m=0;
        while(p.next!=null){
            p=p.next;
            length++;
        }
        n=length-n%length;
        p.next=head;
        
        while(m<n){
            p=p.next;
            m++;
        }
        head=p.next;
        p.next=null;
        return head;
    }
}