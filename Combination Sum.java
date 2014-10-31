public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(candidates == null || candidates.length==0)  
            return res;  
        Arrays.sort(candidates);  
        combinationSum(candidates,target,0,new ArrayList<Integer>(),res);  
        return res; 
    }
    public void combinationSum(int[] candidates, int target, int start, ArrayList<Integer> solution, ArrayList<ArrayList<Integer>> res){
        if(target<0) return;
        if(target==0){
            res.add(new ArrayList<Integer>(solution));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>0&&candidates[i]==candidates[i-1]){
                continue;
            }
            solution.add(candidates[i]);
            combinationSum(candidates, target-candidates[i],i,solution,res);
            solution.remove(solution.size()-1);
        }
    }
}//backtraking, DFS. Similar with Permutations series