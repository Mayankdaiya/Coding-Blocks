import java.util.*;

class Main{
    public static void Display_the_Sudoku(int[][] grid) {
        for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid.length;j++) System.out.print(grid[i][j]+" ");
			System.out.println();
        }
    }

    public static boolean isSafe(int[][] grid, int row, int col, int num) {
        //check for row
        for(int r=0;r<grid.length;r++) {
            if(grid[r][col]==num) return false;
        }
        //check for col
        for(int c=0;c<grid.length;c++) {
            if(grid[row][c]==num) return false;
        }
        //check for cell
        int cr = row-(row%3);
        int cc = col-(col%3);
        for(int i=cr;i<cr+3;i++) {
            for(int j=cc;j<cc+3;j++){
                if(grid[i][j]==num) return false;
            }
        }
        return true;
    }

    public static boolean Solve_the_Sudoku(int [][] grid){
        for(int x=0;x<grid.length;x++) {
            for(int y=0;y<grid.length;y++) {
                int cur = grid[x][y];
                if(cur==0){
                    for(int n=1;n<=grid.length;n++){
                        if (isSafe(grid,x,y,n)){
                            grid[x][y]=n;
                            if(Solve_the_Sudoku(grid)) return true;
                            grid[x][y]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        Solve_the_Sudoku(grid);
        Display_the_Sudoku(grid);
    }

}