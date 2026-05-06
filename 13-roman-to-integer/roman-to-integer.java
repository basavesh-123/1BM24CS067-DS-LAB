class Solution {
    public int romanToInt(String s) {
        char[] ans=s.toCharArray();
        int i=0;
        int n=ans.length;
        int sum=0;
        while(i<n){
            if(ans[i]=='I'){
                if(i<n-1){
                    if(ans[i+1]=='V'){
                        sum+=4;
                        i=i+2;
                    }
                    else if(ans[i+1]=='X'){
                        sum+=9;
                        i=i+2;
                    }
                    else{
                        sum+=1;
                        i=i+1;
                    }
                    
                }
                else{
                    sum+=1;
                    i=i+1;
                }
            }
            else if(ans[i]=='X'){
                if(i<n-1){
                    if(ans[i+1]=='L'){
                        sum+=40;
                        i=i+2;
                    }
                    else if(ans[i+1]=='C'){
                        sum+=90;
                        i=i+2;
                    }
                    else{
                        sum+=10;
                        i=i+1;
                    }
                }    
                else{
                    sum+=10;
                    i=i+1;
                }
            }
            else if(ans[i]=='C'){
                if(i<n-1){
                    if(ans[i+1]=='D'){
                        sum+=400;
                        i=i+2;
                    }
                    else if(ans[i+1]=='M'){
                        sum+=900;
                        i=i+2;
                    }
                    else{
                        sum+=100;
                        i=i+1;
                    }
                }
                else{
                    sum+=100;
                    i=i+1;    
                }
            }    
            else if(ans[i]=='V'){
                sum+=5;
                i=i+1;
            }
            else if(ans[i]=='L'){
                sum+=50;
                i=i+1;
            }else if(ans[i]=='D'){
                sum+=500;
                i=i+1;
            }else{
                sum+=1000;
                i=i+1;
            }    
        }    
    return sum;
    }
}