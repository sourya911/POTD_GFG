// 6 april


class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		
		int i =0;
		int sum =0, sum1 =0;
// 		if(N==1) return 1;
		
		while(i<N){
		    sum+=A[i];
		    i++;
		}
		
		for(i=0;i<N;i++){
		    sum1 = sum1+A[i];
		    sum = sum- A[i];
		    
		    if(sum==sum1-A[i]){
		        return i+1;
		    }
		}
		
		return -1;
	}
}
