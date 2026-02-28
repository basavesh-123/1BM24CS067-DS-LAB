class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] trans= new int[matrix[0].length][matrix.length];
        int rows,col;
        for(rows=0;rows<matrix.length;rows++){
            for(col=0;col<matrix[0].length;col++){
                trans[col][rows]=matrix[rows][col];
            }
        }
    return trans;
    }

}