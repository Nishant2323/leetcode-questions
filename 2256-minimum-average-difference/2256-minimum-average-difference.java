class Solution {
    public int minimumAverageDifference(int[] inp) {
        int n=inp.length;
        if(n==1)   return 0;
        long prefix=0,postfix=0;
        for(int i=0;i<n;i++) postfix+=inp[i];
        long min=Integer.MAX_VALUE;
        int ind=0;
        for(int i=0;i<n;i++){
            prefix+=inp[i];
            long temp=prefix/(i+1);
            if(i+1<n)   temp-=(postfix-prefix)/(n-i-1);
            temp=Math.abs(temp);
            if(temp<min){
                min=temp;
                ind=i;
            }
        }
        return ind;
    }
}