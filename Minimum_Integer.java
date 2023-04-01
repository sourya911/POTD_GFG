// march 30

class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
        long sum =0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            
        }
            long min=Integer.MAX_VALUE;
        for(int j=0;j<N;j++){
             if(Math.log(sum) <= (Math.log(A[j])+Math.log(N))){
                min = Math.min(A[j],min);
            }
        }
        return (int)min;
    }
}
        
