class Solution {
    public String makeGood(String s) {
        StringBuilder ans= new StringBuilder();
        Stack<Character> st= new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.empty()&&Math.abs(st.peek()-s.charAt(i))==32)st.pop();
            else st.push(s.charAt(i));
        }
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}