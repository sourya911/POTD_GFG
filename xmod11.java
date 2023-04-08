// 3 April


//User function Template for Java

class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
        // java.math.BigInteger a= new java.math.BigInteger(x);
       int c=0,rem=0;
       
       for(int i=0;i<x.length();i++){
           c=rem*10+x.charAt(i)-'0';
           
           rem = c%11;
       }
       return rem;
	}
} 
