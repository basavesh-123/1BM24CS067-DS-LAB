class Solution {
    public int firstMissingPositive(int[] nums){
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]<=n && nums[i]>0){
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
            else{
                i++;
            }    
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
    return n+1;
    }
}    