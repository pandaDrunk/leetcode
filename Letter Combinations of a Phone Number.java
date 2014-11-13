public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        String[] maps = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> res = new ArrayList<String>();
        letterCombinations(digits, res, new StringBuilder(), 0, maps);
        return res;
        
    }
    public void letterCombinations(String digits, ArrayList<String> res, StringBuilder combo, int n, String[] maps){
        if(digits.length()==n){
            res.add(combo.toString());
            return;
        }
        String map=maps[digits.charAt(n)-'1'];
        for(int i=0;i<map.length();i++){
            combo.append(map.charAt(i));
            letterCombinations(digits, res, combo, n+1, maps);
            combo.deleteCharAt(combo.length()-1);
        }
        
    }
}//dfs