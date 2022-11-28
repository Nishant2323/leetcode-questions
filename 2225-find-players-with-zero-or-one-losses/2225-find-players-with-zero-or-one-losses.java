class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> winners = new HashMap<>();
        HashMap<Integer,Integer> loosers = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            winners.put(matches[i][0],winners.getOrDefault(matches[i][0],0)+1);
            loosers.put(matches[i][1],loosers.getOrDefault(matches[i][1],0)+1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(Integer i:winners.keySet()){
            if(!loosers.containsKey(i)){
                res.add(i);
            }
        }
        Collections.sort(res);
        ans.add(res);
        List<Integer> a= new ArrayList<>();
        for(Integer i:loosers.keySet()){
            if(loosers.get(i)==1){
                a.add(i);
            }
        }
        Collections.sort(a);
        ans.add(a);
        return ans;
    }
}