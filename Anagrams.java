public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> res = new ArrayList<String>();
        if(strs.length<2) return res;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<strs.length;i++){
            String s=sort(strs[i]);
            if(map.containsKey(s)){
                res.add(strs[i]);
                if(map.get(s)>=0){
                    res.add(strs[map.get(s)]);
                    //modify value to -1 
                    map.remove(s);
                    map.put(s,-1);
                }
            }
            else{
                map.put(s,i);
            }
        }
        return res;
    }
    public String sort(String s){
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}