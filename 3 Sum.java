public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length<3) return res;
        Arrays.sort(num);
        
        for(int i=0;i<num.length;i++){
            if(i==0||num[i]!=num[i-1]){
                int rest=0-num[i];
                int start=i+1;
                int end=num.length-1;
                while(start<end){
                    ArrayList<Integer> solution = new ArrayList<Integer>();
                    if(num[start]+num[end]==rest){
                        solution.add(num[i]);
                        solution.add(num[start]);
                        solution.add(num[end]);
                        res.add(solution);
                        start++;
                        end--;
                        //remove duplicates
                        while(start<end&&num[start]==num[start-1]){
                            start++;
                        }
                        while(start<end&&num[end]==num[end+1]){
                            end--;
                        }
                    } 
                    else if(num[start]+num[end]<rest){
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