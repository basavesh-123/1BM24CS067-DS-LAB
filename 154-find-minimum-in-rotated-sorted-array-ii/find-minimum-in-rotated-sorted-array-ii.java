class Solution {
    public int findMin(int[] nums) {
        int peak=find(nums);
        return nums[(peak+1)%nums.length];
    }
    public int find(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                ans=i;
                break;
            }
        }
    return ans;
    }
}