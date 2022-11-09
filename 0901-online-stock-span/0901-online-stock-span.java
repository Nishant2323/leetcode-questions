class Pair
{
    int val;
    int i;
    public Pair(int val,int i)
    {
        this.val=val;
        this.i=i;
    }
}
class StockSpanner {
     
      Stack<Pair> st;
      int ans;
    int i;
    
    public StockSpanner() {
        st=new Stack<>();
        ans=0;
        i=0;
        
    }
    
    public int next(int price) {
          i++;
           while(!st.empty()&&price>=st.peek().val){
               st.pop();
         }
         if(st.empty()){
           ans= i;
             
         }
         else{
            ans= i-st.peek().i;
            
         }
          
          st.push(new Pair(price,i));
          
    
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */