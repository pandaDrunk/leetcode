public class Solution {
    public String countAndSay(int n) {
        String res="1";
        if(n==1) return res;
        int num=1;
        
        for(int i=0;i<n-1;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<res.length();j++){
                if((j<res.length()-1)&&res.charAt(j)==res.charAt(j+1)){
                    num++;
                }
                else {
                    str.append(num);
                    str.append(res.charAt(j));
                    num=1;
                }
                
            }
            res=str.toString();
        }
        return res;
    }
}