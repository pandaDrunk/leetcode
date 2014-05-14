public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> yanghui = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<numRows; i++){
            ArrayList temp=new ArrayList();
            temp.add(1);
            if(i>=1){
                for(int j=0; j<yanghui.get(i-1).size()-1;j++){
                    temp.add(yanghui.get(i-1).get(j)+yanghui.get(i-1).get(j+1));
                }
                temp.add(1);
            }
            yanghui.add(temp);
        }
        return yanghui;
    }
}