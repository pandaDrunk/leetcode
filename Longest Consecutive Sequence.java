public class Solution {
    public int longestConsecutive(int[] num) {
        if(num==null||num.length==0) return 0;
        HashSet<Integer> hash= new HashSet<Integer>();
        int res=1;
        
        for(int n:num){
            hash.add(n);
        }
        
        for(int n:num){
            int prev=n-1;
            int next=n+1;
            int length=1;
            
            while(hash.contains(prev)){
                length++;
                hash.remove(prev);
                prev--;
            }
            while(hash.contains(next)){
                length++;
                hash.remove(next);
                next++;
            }
            res=Math.max(length, res);
        }
        
        return res;
    }
}//Hashset