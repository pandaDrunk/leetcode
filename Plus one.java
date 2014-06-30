public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            if(digits[i]==10){
                digits[i]=0;
                carry=1;
            }
            else carry=0;
        }
        if(carry==0){
            return digits;
        }
        else {
            int[] res=new int[digits.length+1];
            res[0]=1;
            for(int i=0;i<digits.length;i++){
                res[i+1]=digits[i];
            }
            return res;
        }
    }
}
//two situations