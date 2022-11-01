class Solution {
    
    public void dfs(int i,int j,int[][]g,int s,int[]ans){
        if(i==g.length){
            ans[s]=j;
            return;
        } 
        if(g[i][j]==1){
            if(j+1<g[0].length&&g[i][j+1]==1)dfs(i+1,j+1,g,s,ans);
            else return;
        }
        else if(g[i][j]==-1){
            if(j-1>=0&&g[i][j-1]==-1)dfs(i+1,j-1,g,s,ans);
            else return;
        }
    }
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            ans[i]=-1;
        }
        
        for( int i=0;i<grid[0].length;i++){
            dfs(0,i,grid,i,ans);
        }
        return ans;
    }
}