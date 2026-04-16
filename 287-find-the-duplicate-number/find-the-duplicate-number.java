class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[nums[i]-1]==nums[i]){
                i++;
            }
            else if(nums[i]==i+1){
                i++;
            }
            else{
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
    return nums[n-1];
    }
}