class Solution {
    public String reverseWords(String s) {
        String ans= "";
        List<String> ls= new ArrayList<>();
        if(s.length()==1)return s;
        for(char c:s.toCharArray()){
            if(c==' '){
                ls.add(ans);
                ans="";
            }
            else{
                ans=ans+c;
            }
        }
        ls.add(ans);
        ele(ls);
        Collections.reverse(ls);
        ans="";
        for(int i=0;i<=ls.size()-2;i++){
            ans=ans+ls.get(i)+" ";
        }
        ans=ans+ls.get(ls.size()-1);
        return ans;
    }
    public void ele(List<String> ls){
        for(int i=ls.size()-1;i>=0;i--){
            if(ls.get(i).equals(""))ls.remove(i);
        }
    }
}