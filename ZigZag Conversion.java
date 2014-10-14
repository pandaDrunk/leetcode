public class Solution {
    public String convert(String s, int nRows) {
        if(s==null||s.length()==0||nRows<=0) return "";
        if(nRows==1) return s;
        
        int zig=2*nRows-2;
        StringBuilder res = new StringBuilder();
        
        for(int i=0;i<nRows;i++){
            for(int j=i;j<s.length();j+=zig){
                res.append(s.charAt(j));
                if(i!=0&&i!=nRows-1&&j+zig-2*i<s.length()){
                    res.append(s.charAt(j+zig-2*i));//math problem
                }
            }
        }
        return res.toString();
    }
}