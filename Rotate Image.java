public class Solution {
    public void rotate(int[][] matrix) {
        Stack<Integer> temp=new Stack<Integer>();
        int n=matrix.length-1;
        for(int j=n;j>=0;j--){
            for(int i=0;i<=n;i++){
                temp.push(matrix[i][j]);
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                matrix[i][j]=temp.pop();
            }
        }
    }
}
//Stack
public class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int tmp = matrix[i][j];  
                matrix[i][j] = matrix[n-1-i][j];  
                matrix[n-1-i][j] = tmp; 
                //swap(matrix[i][j],matrix[n-1-i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tmp = matrix[i][j];  
                matrix[i][j] = matrix[j][i];  
                matrix[j][i] = tmp;  
                //swap(matrix[i][j],matrix[j][i]);
            }
        }
    }
    public void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    
}
//in-place. This swap is useless. Should use the indexes to write the swap function.