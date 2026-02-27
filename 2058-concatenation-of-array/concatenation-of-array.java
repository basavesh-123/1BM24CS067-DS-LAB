class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*(nums.length)];
        int i,j=0;
        for(i=0;i<nums.length;i++){
            ans[j]=nums[i];
            j++;
        }
        for(i=0;i<nums.length;i++){
            ans[j]=nums[i];
            j++;
        }
    return ans;    
    }
}