class Solution {
    public boolean checkOnesSegment(String s) {
        char[] ans =s.toCharArray();
        int n=ans.length;
        int i=0;
        while(i<n && ans[i]!='0'){
            i++;
        }
        for(int j=i;j<n;j++){
            if(ans[j]=='1'){
                return false;
            }
        }
    return true;
    }
}