class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> ans = new ArrayList<>(); 
        for(Integer i : hm.values()){
            ans.add(i);
        }
        Collections.sort(ans);
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)==ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
}