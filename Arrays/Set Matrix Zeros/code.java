class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;

        boolean[][] visited=new boolean[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0 && !visited[i][j]){
                    for(int k=0;k<rows;k++){
                        if(matrix[k][j]==0){
                            continue;
                        }else{
                            matrix[k][j]=0;
                            visited[k][j]=true;
                            
                        }
                        
                    }
                    for(int k=0;k<col;k++){
                        if(matrix[i][k]==0){
                            continue;
                        }else{
                            matrix[i][k]=0;
                            visited[i][k]=true;
                            
                        }
                        
                    }
                }
            }
        }
        
    }
}
