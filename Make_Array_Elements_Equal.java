// 1 April


// User function Template for Java

class Solution {
    public long minOperations(int N) {
        // Code here
        if(N%2==0){
            return N*N/4;
        }
        else{
            return (N/2)*(N/2)+1
        }
        
    }
}
