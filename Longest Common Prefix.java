public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        String str=strs[0];
        for(int i=0;i<str.length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()==i||strs[j].charAt(i)!=c){
                    return str.substring(0,i);
                }
            }
        }
        return str;
    }
}