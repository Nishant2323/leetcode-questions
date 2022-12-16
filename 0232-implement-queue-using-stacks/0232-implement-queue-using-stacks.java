class MyQueue {
    Stack<Integer> s1=null;
    Stack<Integer> s2= null;
    public MyQueue() {
         s1= new Stack<>();
        s2= new Stack<>();
    }
    
    public void push(int x) {
        if(s1.empty()){
            s1.push(x);
        }
        else{
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
            s2.add(x);
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
        }  
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
       return  s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */