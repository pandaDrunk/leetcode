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
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next=head;
        ListNode cur = head;
        
        while(cur!=null&&cur.next!=null){
            if(cur.val>cur.next.val){
                //find the target
                ListNode target = cur.next;
                ListNode pre=fakeHead;
                //find the position to insert
                while(pre.next.val<target.val){
                    pre=pre.next;
                }
                //insert target and cur to the next
                ListNode temp = pre.next;
                pre.next=target;
                cur.next=target.next;
                target.next=temp;
                
            }
            else {
                cur=cur.next;
            }
        }
        return fakeHead.next;
    }
}