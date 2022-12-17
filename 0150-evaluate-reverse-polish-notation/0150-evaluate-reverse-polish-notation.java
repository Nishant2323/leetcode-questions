class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
        int v1=0;
        int v2=0;
        for(String t:tokens){
            if(t.equals("+")){
                v1=s.pop();
                v2=s.pop();
                s.push(v2+v1);
            }
            else if(t.equals("-")){
                v1= s.pop();
                v2= s.pop();
                s.push(v2-v1);
            }
              else if(t.equals("*")){
                v1= s.pop();
                v2= s.pop();
                s.push(v2*v1);
            }
              else if(t.equals("/")){
                v1= s.pop();
                v2= s.pop();
                s.push(v2/v1);
            }
            else{
              int c= Integer.parseInt(t);
                s.push(c);
            }
            
        }
        return s.peek();
    }
}