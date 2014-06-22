public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> result= new ArrayList<String[]>();
        int[] queen= new int[n];
        NQueen(n,0,queen,result);
        return result;
    }
    private void NQueen(int n,int currentRow, int[] queen, ArrayList<String[]> result){
        if(currentRow==n){
            print(n,queen,result);
        }
        else{
            for(int i=0;i<n;i++){
               // queen[currentRow]=i;
                if(check(i,currentRow,queen)){
                   queen[currentRow]=i;
                    NQueen(n,currentRow+1,queen,result);
                }
            }
        }
    }
    private boolean check(int column, int currentRow, int[] queen){
        for(int i=0; i<currentRow; i++){
            if(column==queen[i]||(Math.abs(column-queen[i])==currentRow-i)) 
            return false;
        }
        return true;
    }
    private void print(int n,int[] queen, ArrayList<String[]> result){
        String[] board=new String[n];
        for(int i=0;i<n;i++){
            String row=new String();
            for(int j=0;j<n;j++){
                if(j==queen[i]) row+="Q";
                else row+=".";
            }
            board[i]=row;
        }
        result.add(board);
    }
}