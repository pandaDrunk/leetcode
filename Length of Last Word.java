public class Solution {
    public int lengthOfLastWord(String s) {
        if(s!=null&&!s.trim().equals("")){
            String[] words=s.trim().split(" ");
            int length=words[words.length-1].length();
            return length;
        }
        return 0;
    }//use JAVA String library "trim" and "split"
    
    public int lengthOfLastWord1(String s) {
       if(s.equals("")) return 0; 
        String [] results=s.split(" ");
        int length=results.length; 
        if(length==0) return 0; 
        return results[length-1].length(); 
    }//use JAVA String library "split"
}