class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum= new int[nums.length];
        int i=0,j=0;
        sum[j]=nums[i];
        j++;
        for(i=1;i<nums.length;i++){
            sum[j]=nums[i]+sum[j-1];
            j++;
        }
    return sum;    
    }
}