public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return false;
        if(s.length()==0) return true;
        s=s.toLowerCase();//convert to lower case
        int head=0;
        int tail=s.length()-1;
        while(head<tail){
            while(head<tail&&!isValid(s.charAt(head))){
                head++;
            }
            while(head<tail&&!isValid(s.charAt(tail))){
                tail--;
            }
            if(s.charAt(head)!=s.charAt(tail)) return false;
            
            head++;
            tail--;
        }
        
        return true;
    }
    public boolean isValid(char c){
        if(c>='a'&&c<='z') return true;
        if(c>='0'&&c<='9') return true;
        return false;
    }
}