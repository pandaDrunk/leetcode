public class Solution {
    public ArrayList<ArrayList<Integer>> subsets1(int[] S) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(S.length==0) return res;
        Arrays.sort(S);
        res.add(new ArrayList<Integer>());
        for(int i=0;i<S.length;i++){
            int size=res.size();
            for(int j=0; j<size; j++){
                ArrayList<Integer> set = new ArrayList<Integer>(res.get(j));
                set.add(S[i]);
                res.add(set);
            }
        }
        return res;
    }//dfs backtracking
    public ArrayList<ArrayList<Integer>> subsets(int[] S) { 
        Arrays.sort(S);
        int num=S.length;
        int sets=1<<num;
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>(sets);
        
        for(int i=0;i<sets;i++){
            ArrayList<Integer> set=new ArrayList<Integer>();
            for(int j=0;j<num;j++){
                if((1&(i>>j))!=0){
                    set.add(S[j]);
                }
            }
            res.add(set);
        }
        return res;
        
    }//bit manipulation
}