/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null||(root.left==null&&root.right==null)) return;
        if(root.left!=null&&root.right!=null){
            root.left.next=root.right;
        }
        TreeLinkNode p=root.next;
        if(root.next==null){
            if(root.right!=null){
                root.right.next=null;
            }
            else if(root.left!=null){
                root.left.next=null;
            }
            
        }
        else {
            if(root.right!=null){
                while(p!=null){
                    if(p.left!=null){
                        root.right.next=p.left;
                        break;//key
                    }
                    else if (p.right!=null){
                        root.right.next=p.right;
                        break;
                    }
                    p=p.next;
                }
            }
            else if(root.left!=null){
                while(p!=null){
                    if(p.left!=null){
                        root.left.next=p.left;
                        break;
                    }
                    else if (p.right!=null){
                        root.left.next=p.right;
                        break;
                    }
                    p=p.next;
                }
            }
        }
        connect(root.right);
        connect(root.left);
    }
}