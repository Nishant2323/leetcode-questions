/*class Solution {
    public boolean check(String s,String t){
        if(!s.equals("")&&t.equals(""))return false;
        if(s.equals("")&&!t.equals(""))return false;
        HashMap<Character,Integer> w= new HashMap();
        HashMap<Character,Integer> d= new HashMap();
        for(char c1:s.toCharArray()){
            w.put(c1,w.getOrDefault(c1,0)+1);
        }
        for(char c:t.toCharArray()){
            d.put(c,d.getOrDefault(c,0)+1);
        }
        if(!w.equals(d))return false;
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        if(strs.length==1){
            List<String> la=new ArrayList();
            la.add(strs[0]);
            ans.add(la);
            return ans;
        }
        HashSet<String> hs= new HashSet<>();
        for(int i=0;i<strs.length;i++){
            List<String> ls= new ArrayList<>();
            if(!hs.contains(strs[i])){
                ls.add(strs[i]);
                hs.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(check(strs[i],strs[j])){
                       ls.add(strs[j]);
                        hs.add(strs[j]);
                    }
                }
            }
            if(ls.size()>0)ans.add(ls);
        }
        return ans;
    }
}*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

