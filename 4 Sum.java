public class Solution {
   public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();//use hashset to remove duplicates
        if(num.length<4) return res;
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                    int rest=num[i]+num[j];
                    int start=j+1;
                    int end=num.length-1;
                    while(start<end){
                        ArrayList<Integer> solution = new ArrayList<Integer>();
                        if(num[start]+num[end]==target-rest){
                            solution.add(num[i]);
                            solution.add(num[j]);
                            solution.add(num[start]);
                            solution.add(num[end]);
                            if(!set.contains(solution)){
                                set.add(solution);
                                res.add(solution);
                            }
                            start++;
                            end--;
                        //remove duplicates
                            /*while(start<end&&num[start]==num[start-1]){
                                start++;
                            }
                            while(start<end&&num[end]==num[end+1]){
                                end--;
                            }*/
                        } 
                        else if(num[start]+num[end]<target-rest){
                            start++;
                        }
                        else {
                            end--;
                        }
                    }
            }
        }
        return res;
    }
}