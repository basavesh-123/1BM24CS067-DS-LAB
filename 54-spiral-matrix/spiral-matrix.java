class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top = 0, bott = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        while(top <= bott && left <= right){

            int i = top, j = left;

            while(j <= right){
                ans.add(matrix[i][j]);
                j++;
            }
            top++;

            i = top;
            j = right;

            while(i <= bott){
                ans.add(matrix[i][j]);
                i++;
            }
            right--;

            if(top <= bott){
                i = bott;
                j = right;

                while(j >= left){
                    ans.add(matrix[i][j]);
                    j--;
                }
                bott--;
            }

            if(left <= right){
                i = bott;
                j = left;

                while(i >= top){
                    ans.add(matrix[i][j]);
                    i--;
                }
                left++;
            }
        }

        return ans;
    }
}