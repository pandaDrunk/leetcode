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
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        //partition the list to 2 equal length sublists
        ListNode first = head;
        ListNode second = head;
        while(second.next!=null){
            second=second.next;
            if(second.next!=null){
                second=second.next;
            }
            else{
                break;
            }
            first=first.next;
        }
        //two new heads
        ListNode head1=head;
        ListNode head2=first.next;
        //detach two sublist
        first.next=null;
        //reverse the second half
        ListNode cur=head2;
        ListNode post=head2.next;
        cur.next=null;
        while(post!=null){
            ListNode temp=post.next;
            post.next=cur;
            cur=post;
            post=temp;
        }
        head2=cur;
        //merge two sublists
        ListNode p = head1, q = head2;  
        while (q != null) {  
            ListNode temp1 = p.next;  
            ListNode temp2 = q.next;  
            p.next = q;  
            q.next = temp1;  
            p = temp1;  
            q = temp2;  
        }  
    }
}