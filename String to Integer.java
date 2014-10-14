public class Solution {
    public int atoi(String str) {
        if(str==null||str.length()==0) return 0;
        int i=0;
        char sign='+';
        //store the result in double
        double res=0;
        //remove whitespace
        str=str.trim();
        //sign
        if(str.charAt(0)=='+'){
            i++;
        } 
        else if(str.charAt(0)=='-'){
            sign='-';
            i++;
        }
        //convert string to int
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            res=res*10+(str.charAt(i)-'0');
            i++;
        }
        if(sign=='-') res=-1*res;
        //out of the range
        if (res > Integer.MAX_VALUE)
		    return Integer.MAX_VALUE;
        if (res < Integer.MIN_VALUE)
		    return Integer.MIN_VALUE;
        
        return (int)res;
    }
}