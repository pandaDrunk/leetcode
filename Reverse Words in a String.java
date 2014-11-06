public class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0) return "";
        
        String[] words = s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(!words[i].equals("")){
                res.append(words[i]);
                res.append(" ");
            }
        }
        if(res.toString()==" "||res.toString().length()==0) return "";
        return res.toString().substring(0,res.length()-1);
    }
}