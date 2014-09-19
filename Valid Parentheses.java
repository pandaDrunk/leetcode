public class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> pair = new HashMap<Character, Character>();
    	pair.put('(', ')');
	    pair.put('[', ']');
    	pair.put('{', '}');
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i=0;i<s.length();i++){
    	    char cur=s.charAt(i);
    	    if(pair.containsKey(cur)){
    	        stack.push(cur);
    	    }
    	    else if(pair.containsValue(cur)){
    	        if(!stack.isEmpty()&&pair.get(stack.peek())==cur){
    	            stack.pop();
    	        }
    	        else
    	            return false;
    	    }
    	}
    	return stack.isEmpty();
    }
}//classical question of stack 