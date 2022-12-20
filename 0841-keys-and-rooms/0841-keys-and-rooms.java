class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();
        dfs(0  , rooms , visited);
        // if we visit all the nodes starting from 0 then return true or false
        return visited.size() == rooms.size();
    }
    public void dfs(int i , List<List<Integer>> rooms , HashSet<Integer> visited){
        // simple DFS
        visited.add(i);
        for(Integer neighbour : rooms.get(i)){
            if(!visited.contains(neighbour)){
                dfs(neighbour , rooms , visited);
            }
        }
    }
}
    
