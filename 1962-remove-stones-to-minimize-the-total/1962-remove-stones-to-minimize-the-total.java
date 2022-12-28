class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum=0;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int i: piles){
            q.add(i);
        }
        while(k!=0){
            int t=q.poll();
             t= t-(t/2);
            q.add(t);
            k--;
        }
        while(!q.isEmpty()){
            int t=q.poll();
            sum=sum+t;
        }
        return sum;
    }
}