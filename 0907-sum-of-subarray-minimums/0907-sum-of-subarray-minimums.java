class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] rb =new int[arr.length];
        int[] lb= new int[arr.length];
        Stack<Integer> st =new Stack<>();
        //left array
        for(int i=0;i<arr.length;i++)
        {
            while(!st.empty()&& arr[i]<arr[st.peek()])
            {
                st.pop();
            }
            if(st.empty())
            {
                lb[i]=i+1;
            }
            else
            {
                lb[i]=i-st.peek();
            }
            st.push(i);
        }
        while(!st.empty())
        {
            st.pop();
        }
        //rigth array
         for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.empty()&& arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            if(st.empty())
            {
                rb[i]=arr.length-i;
            }
            else
            {
                rb[i]=st.peek()-i;
            }
             st.push(i);
        }
        long  ans=0;
        int  r= (int)Math.pow(10,9)+7;
        for(int i=0;i<arr.length;i++)
        {
            long  pro= (rb[i]*lb[i])% r;
            ans=(ans+arr[i]*pro)%r;
        }
        return (int)ans;
    }
}