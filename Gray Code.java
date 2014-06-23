public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(n==0){
            res.add(0);
            return res;
        }
        ArrayList<Integer> last=grayCode(n-1);
        //res=last;
        for(int i=0;i<=last.size()-1;i++){
            res.add(last.get(i));
        }
        int head=1<<(n-1);
        for(int i=last.size()-1;i>=0;i--){
            res.add(head+last.get(i));
        }
        return res;
    }
}