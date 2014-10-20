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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        int carry =0;
        ListNode res = new ListNode(0);
        ListNode head=res;
        
        while(l1!=null||l2!=null||carry>0){
            int cur=0;
            if(l1!=null){
                cur+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                cur+=l2.val;
                l2=l2.next;
            }
            if(carry>0){
                cur+=carry;
            }
            res.next=new ListNode(cur%10);
            res=res.next;
            carry=cur/10;
        }
        return head.next;
    }
}