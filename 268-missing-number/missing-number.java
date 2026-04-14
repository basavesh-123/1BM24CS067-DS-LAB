class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        int n=arr.length;
        while(i<n){
            if(arr[i]==n){
                i++;
            }
            else if(arr[i]!=i){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
            
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i){
                return i;
            }
        }
    return n;
    }
}