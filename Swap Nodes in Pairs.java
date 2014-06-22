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
    public ListNode swapPairs(ListNode head) {
        if(head==null)  return null;
        if(head.next==null) return head;
        ListNode res=new ListNode(0);
        res.next=head.next;
        ListNode first=new ListNode(0);
        first.next=head;
        ListNode sec=head;
        while(sec!=null&&sec.next!=null){
            ListNode temp=new ListNode(0);
            temp.next=sec.next.next;
            sec.next.next=sec;
            first.next=sec.next;
            sec.next=temp.next;
            first=sec;
            sec=sec.next;
        }
        return res.next;
    }
}