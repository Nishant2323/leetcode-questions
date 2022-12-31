class Solution {
    int[][] grid;
    int availCells =0;
    int answer =0;
    
    public void dfs(int row, int col, int passedCells){
        if(row <0 || col < 0) return; //out of grid
        if(row >= grid.length || col >= grid[0].length) return; //out of grid
        int cellValue = grid[row][col];
        if(cellValue == 1 || cellValue==-1 || cellValue == -2) return; //start, obstacle or visitted cell
        if(cellValue == 2){
            if(passedCells == availCells) answer++; // we passed all avail cells, success!
            return;
        }
        grid[row][col] = -2; //mark as visitted
        passedCells++;
        dfs(row, col+1, passedCells);
        dfs(row, col-1, passedCells);
        dfs(row+1, col, passedCells);
        dfs(row-1, col, passedCells);
        grid[row][col] = 0;
    }
    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        int startRow=0,startCol=0;
        
        for(int row = 0; row < grid.length; row++){
            for(int col=0; col < grid[0].length; col++){
                if(grid[row][col] == 1){ // find start cell
                     startRow = row;
                     startCol = col;
                }
                if(grid[row][col] == 0)  availCells++; 
            }
        }
        dfs(startRow+1, startCol,0);
        dfs(startRow-1, startCol,0);
        dfs(startRow, startCol+1,0);
        dfs(startRow, startCol-1,0);
        return answer;
    }
}