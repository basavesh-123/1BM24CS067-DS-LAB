class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        int i=0;
        while(i<row){
            int j=0;
            while(j<col/2){
                int temp=image[i][j];
                image[i][j]=1-image[i][col-1-j];
                image[i][col-1-j]=1-temp;
                j++;
            }
            i++;
        }
        if(col%2!=0){
            for(i=0;i<row;i++){
                image[i][col/2]=1-image[i][col/2];
            }
        }
    return image;
    }
}