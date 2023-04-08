// 8 April


class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for(int i :arr){
            if(st.size()>0){
                
                if(st.peek()>=0 && i<0) st.pop();
                else if(st.peek()<0 &&i>=0) st.pop();
                else st.push(i);
            }
            else{
                st.push(i);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.empty()){
            ans.add(st.peek());
            st.pop();
        }
         ArrayList<Integer> ans2 = new ArrayList<>();
        for(int i=ans.size()-1; i>=0;i--){
            ans2.add(ans.get(i));
        }
        
        return ans2;
    }
}
