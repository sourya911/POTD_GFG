// 4 april

//User function Template for Java

class Solution{
	int minSteps(String str) {
		//Write your code here
		
		int cnt =0;
		for(int i=1;i<str.length();i++){
		    if(str.charAt(i-1)!=str.charAt(i)){
		        cnt++;
		    }
		}
		
		if(cnt%2!=0){
		    return (cnt+1)/2 +1;
		}
		else
		    return (cnt/2) +1;
	}
}
