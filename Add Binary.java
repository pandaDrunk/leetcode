public class Solution {
    public String addBinary(String a, String b) {
        if(a==null||a.length()==0){
            return b;
        }
        if(b==null||b.length()==0){
            return a;
        }
        
        StringBuilder res = new StringBuilder();
        int aLast=a.length()-1;
        int bLast=b.length()-1;
        int carry=0;
        
        while(aLast>=0||bLast>=0||carry>0){
            int numa=aLast>=0?a.charAt(aLast)-'0':0;
            int numb=bLast>=0?b.charAt(bLast)-'0':0;
            int cur=(numa+numb+carry)%2;
            carry=(numa+numb+carry)/2;
            res.insert(0,cur);
            aLast--;
            bLast--;
        }
        return res.toString();
    }
}