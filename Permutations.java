//permutation problem usually use a boolean variable to mark the visited item 
//DFS 
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(num.length==0) return res;
        boolean[] visited=new boolean[num.length];
        permutation(res,num,new ArrayList<Integer>(),visited);
        return res;
    }
    public void permutation(ArrayList<ArrayList<Integer>> res,int[] num,ArrayList<Integer> perm,boolean[] visited){
        if(perm.size()==num.length){
            res.add(new ArrayList<Integer>(perm));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(!visited[i]){
                perm.add(num[i]);
                visited[i]=true;
                permutation(res,num,perm,visited);
                visited[i]=false;
                perm.remove(perm.size()-1);
            }
        }
    }
}