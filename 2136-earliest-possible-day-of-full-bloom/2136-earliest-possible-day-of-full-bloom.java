class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n= plantTime.length;
        int map[][]= new  int[n][2];
        for(int i=0;i<n;i++){
            map[i][0]=plantTime[i];
            map[i][1]=growTime[i];
        }
        int bloom=0;
        int start=0;
        Arrays.sort(map,(a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            int plant= map[i][0];
            int grow= map[i][1];
            bloom=Math.max(bloom,start+plant+grow);
            start=start+plant;
        }
        return bloom;
    }
}