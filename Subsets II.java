public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(num.length==0) return res;
        Arrays.sort(num);
        res.add(new ArrayList<Integer>());
        for(int i=0;i<num.length;i++){
            int size=res.size();
            for(int j=0; j<size; j++){
                ArrayList<Integer> set = new ArrayList<Integer>(res.get(j));
                set.add(num[i]);
                //res.add(set);
                //almost the same with subset, check 
                if(!res.contains(set)){
                    res.add(set);
                }
            }
        }
    
        return res;
    }
}