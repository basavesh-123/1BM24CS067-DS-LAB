class Solution {
    public boolean checkIfExist(int[] arr) {
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]*2){
                        return true;
                    }
                }
            }
        }
    return false;
    }
}