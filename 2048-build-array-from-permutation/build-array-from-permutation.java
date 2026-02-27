class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans= new int[nums.length];
        int i,j=0;
        for(i=0;i<nums.length;i++){
            ans[j]=nums[nums[i]];
            j++;
        }
    return ans;    
    }
}