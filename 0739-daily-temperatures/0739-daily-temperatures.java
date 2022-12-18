class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s= new Stack<>();
        int[] ans= new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
           while(!s.empty()&&temperatures[s.peek()]<=temperatures[i]){
               s.pop();
           } 
           if(s.empty()){
               ans[i]=0;
           } 
            else{
                ans[i]=s.peek()-i;
            }
            s.push(i);
        }
        return ans;
    }
}