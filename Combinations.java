public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
         ArrayList<ArrayList<Integer>> res = new  ArrayList<ArrayList<Integer>>();
         if(k==0||n==0||n<k) return res;
         ArrayList<Integer> comb = new ArrayList<Integer>();
         combine(res, comb, n, k, 1);
         return res;
    }
    public void combine(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> comb,int n, int k, int start){
        if(comb.size()==k){
            res.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++){
            comb.add(i);
            combine(res, comb, n, k, i+1);
            comb.remove(comb.size()-1);
        }
    }
}//similar with permutations, enumeration method