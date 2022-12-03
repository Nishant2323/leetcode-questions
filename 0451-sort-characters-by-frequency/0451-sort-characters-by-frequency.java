class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map=new HashMap<>();

       for(char c:s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }

        PriorityQueue<Character> mxhp=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        mxhp.addAll(map.keySet());
        StringBuilder ans=new StringBuilder();
        while(!mxhp.isEmpty()){
            char cur=mxhp.remove();
            int l=map.get(cur);
            while(l-->0)
            ans.append(cur);
        }
        return ans.toString();
    }
}