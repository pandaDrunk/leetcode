public class Solution {
    int count;
    public int totalNQueens(int n) {
        count=0;
        int[] queen= new int[n];
        NQueen(n,0,queen);
        return count;
    }
    private void NQueen(int n,int currentRow,int[] queen){
        if(currentRow==n) {
            count++;
            return;
        }
        else {
            for(int i=0;i<n;i++){
              //  queen[currentRow]=i;
                if(check(i,currentRow,queen)){
                    queen[currentRow]=i;
                    NQueen(n,currentRow+1,queen);
                }
            }
        }
    }
    private boolean check(int column,int Row,int[] queen){
        for(int i=0;i<Row;i++){
            if(column==queen[i]||(Math.abs(column-queen[i])==Row-i))
            return false;
        }
        return true;
    }
    
}