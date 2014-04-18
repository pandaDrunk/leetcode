public class Solution {
    public String intToRoman(int num) {
        char[] c=new char[7];
        c[0]='I';// 1
        c[1]='V';// 5
        c[2]='X';// 10
        c[3]='L';// 50
        c[4]='C';// 100
        c[5]='D';// 500
        c[6]='M';// 1000
        
        StringBuilder  roman= new StringBuilder();
        int div=1000;
        
        for(int i=6; i>=0; i-=2){
            int times=num/div;
            
            if(times<=3&&times>0) {
                for(;times>0;times--) roman=roman.append(c[i]);
            }
            else if(times==4){
                roman=roman.append(c[i]);
                roman=roman.append(c[i+1]);
            }
            else if(times==5){
                roman=roman.append(c[i+1]);
            }
            else if(times<=8&&times>5){
                roman=roman.append(c[i+1]);
                for(;times-5>0;times--) roman=roman.append(c[i]);
            }
            else if(times==9){
                roman=roman.append(c[i]);
                roman=roman.append(c[i+2]);
            }
            num=num%div;
            div/=10;
        }
        return roman.toString();
    }
}