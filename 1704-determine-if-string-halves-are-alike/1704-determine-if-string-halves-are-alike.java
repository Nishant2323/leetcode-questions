class Solution {
    public boolean halvesAreAlike(String s) {
      int count =0;
      int count1=0;
       HashSet<Character> st= new HashSet<>();
        st.add('a');
         st.add('e');
         st.add('i');
         st.add('o');
         st.add('u');
         st.add('A');
         st.add('E');
         st.add('I');
         st.add('O');
         st.add('U');
      for( int i=0;i<=s.length()/2-1;i++){
          if(st.contains(s.charAt(i))){
              count++;
          }
      }  
         for( int i=s.length()/2;i<s.length();i++){
          if(st.contains(s.charAt(i))){
              count1++;
          }
      }
       if(count==count1){
           return true;
       } 
        return false;
    }
}