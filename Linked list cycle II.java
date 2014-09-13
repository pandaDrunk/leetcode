/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//based on the linked list cycle, continue k steps to find the start point
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode one=head;
        ListNode two=head;
        if(head==null||head.next==null) return null;
        while(two!=null&&two.next!=null){
            one=one.next;
            two=two.next.next;
            //if(two==null) return false;
            if(one==two) break;
        }
        if(one!=two) return null;
        one= head;
        while(one!=two){
            one=one.next;
            two=two.next;
        }
        return two;
    }
}