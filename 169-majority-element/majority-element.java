class Solution {
    public int majorityElement(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int count=0;
            int temp=nums[i];
            
            for(int k=0;k<n;k++){
                if(nums[k]==temp){
                    count++;
                }
            }
            if(count>(n/2)){
                return temp;
            }
            i++;
        }
    return -1;
    }
}