public class Solution {
    public String strStr(String haystack, String needle) {
        if(haystack==null||needle==null||needle.length()==0) return haystack;
        if(needle.length()>haystack.length()) return null;
        
        for(int i=0; i<=haystack.length()-needle.length();i++){
            boolean match=true;
            for(int j=0;j<needle.length();j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    match=false;
                    break;
                }
            }
            if(match==true){
                return haystack.substring(i);
            }
        }
        
        return null;
    }
}