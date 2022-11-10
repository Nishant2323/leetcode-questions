class Solution {
    public String removeDuplicates(String s) {
        String ans ="";
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(!st.empty()&&st.peek()==s.charAt(i))st.pop();
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.empty()){
            ans+=st.pop();
        }
        return ans;
    }
}