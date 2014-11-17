/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)
            return null;
        RandomListNode p = head;
        RandomListNode copy = new RandomListNode(head.label);
        RandomListNode q = copy;
        
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        map.put(head, copy);
        
        p=p.next;
        while(p!=null){
            RandomListNode temp = new RandomListNode(p.label);
            map.put(p,temp);
            q.next=temp;
            q=temp;
            p=p.next;
        }
        p=head;
        q=copy;
        while(p!=null){
            if(p.random!=null){
                q.random = map.get(p.random);
            }
            else {
                q.random=null;
            }
            q=q.next;
            p=p.next;
        }
        
        return copy;
    }
}