class Solution {
    public String orderlyQueue(String s, int k) {
        char[] arr= s.toCharArray();
        if(k>1){
            Arrays.sort(arr);
            return String.valueOf(arr);
        }
        String ans= s;
        for(int i=0;i<s.length();i++){
            rotateArray(arr);
            int diff= ans.compareTo(String.valueOf(arr));
            if(diff>0){
                ans=String.valueOf(arr);
            }
        }
        return ans;
    }
    public void rotateArray(char[] r){
        char t=r[0];
        for(int i=0;i<r.length-1;i++){
            r[i]=r[i+1];
        }
        r[r.length-1]=t;
    }
}