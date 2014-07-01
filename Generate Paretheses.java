public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        int l=n;
        int r=n;
        ArrayList<String> res=new ArrayList<String>();
        if(n<=0) return res;
        addParenthesis(l,r,new String(),res);
        return res;
    }
        public void addParenthesis(int l,int r,String ans,ArrayList<String> res){
            if(r<l) return;
            if(l==0&&r==0) res.add(ans);
            if(l>0){
                //ans=ans+"("; will add one more parethesis without run next line
                addParenthesis(l-1,r,ans+"(",res);
            }
            if(r>0){
                //ans=ans+")";
                addParenthesis(l,r-1,ans+")",res);
            }
        }
}