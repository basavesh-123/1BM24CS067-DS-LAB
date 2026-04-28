class Solution {
    public boolean judgeCircle(String moves) {
        char[] ans=moves.toCharArray();
        int countrl=0;
        int countud=0;
        int n=ans.length;
        for(int i=0;i<n;i++){
            if(ans[i]=='L'){
                countrl++;
            }
            else if(ans[i]=='R'){
                countrl--;
            }
            else if(ans[i]=='U'){
                countud++;
            }
            else{
                countud--;
            }
        }
        if(countrl==0 && countud==0){
            return true;
        }
        else{
            return false;
        }
    }
}