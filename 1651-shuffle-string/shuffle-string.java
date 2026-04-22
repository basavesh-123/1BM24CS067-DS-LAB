class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] ans=new char[n];
        ans=s.toCharArray();
        int i=0;
        while(i<n){
            if(indices[i]!=i){
                char temp=ans[indices[i]];
                ans[indices[i]]=ans[i];
                ans[i]=temp;
                int temp1=indices[indices[i]];
                indices[indices[i]]=indices[i];
                indices[i]=temp1;
            }
            else{
                i++;
            }
        }
        String a= new String(ans);
        return a;
    }
}