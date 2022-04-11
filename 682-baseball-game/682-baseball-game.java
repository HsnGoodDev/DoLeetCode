class Solution {
    public int calPoints(String[] ops) {
        final Stack<Integer> result = new Stack<>();  
        for(final String op:ops){
            if(op.equals("+")){
                final int add = result.pop() + result.peek(); 
                result.push(add - result.peek()); 
                result.push(add); 
            }else if(op.equals("D")){
                result.push(2* result.peek()); 
            }else if(op.equals("C")){
                result.pop(); 
            }else {
                result.push(Integer.valueOf(op)); 
            }
        }
        return result.stream().mapToInt(Integer::intValue).sum(); 
        
    }
}