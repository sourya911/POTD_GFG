// march 29
//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        // S=S.toCharArray();
        int ans =0;
        for(int i=0;i<S.length();i++){
            int low=0;
            int high=0;
            for(int j=i;j<S.length();j++){
                if(S.charAt(j)>='a' && S.charAt(j)<='z'){
                    low++;
                }
                if(S.charAt(j)>='A' && S.charAt(j)<='Z'){
                    high++;
                }
                
                if(low==high){
                    ans++;
                }
            }   
        }
        return ans;
    }
} 
