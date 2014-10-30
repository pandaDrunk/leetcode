public class Solution {
    public String getPermutation1(int n, int k) {
        //if(n==1) return "1";
        StringBuilder res = new StringBuilder();
        StringBuilder copy = new StringBuilder();
        for(int i=0;i<=n;i++){
            copy.append(i);
        }
        //if(k==1) return copy.toString();
        getPerm(copy,res,n,k);
        return res.toString();
    }
    public void getPerm1(StringBuilder str, StringBuilder res, int n, double k){
       if(n>0){
            double m=factorial(n-1);
            int index=0;
            index=(int)Math.ceil(k/m);
            res.append(str.charAt(index));
            str.deleteCharAt(index);
            k-=(index-1)*m;
            n--;
            getPerm1(str,res,n,k);
            return;
        }
    }//Math.ceil need double type input and will return double type
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public String getPermutation(int n, int k) {
        StringBuilder res = new StringBuilder();
        StringBuilder copy = new StringBuilder();
        for(int i=1;i<=n;i++){
            copy.append(i);
        }
        getPerm(copy,res,n,k-1);//k-1 because copy is from 1 to n
        return res.toString();
    }
    public void getPerm(StringBuilder str, StringBuilder res, int n, int k){
       if(n>0){
            int m=factorial(n-1);
            int index=k/m;
            res.append(str.charAt(index));
            str.deleteCharAt(index);
            k=k%m;
            n--;
            getPerm(str,res,n,k);
            return;
        }
    }
    
}