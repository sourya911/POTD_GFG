// 5April  

Map<Integer, Integer> freq = new HashMap<>();
          HashSet<Integer> uniq = new HashSet<Integer>();
          int max = 0;
          for (int i = 0; i < n; i++) 
         {
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
             uniq.add(arr[i]);
             max = Math.max(arr[i], max);
        }
        
         //for every uniq num ,we are going till max in incremental format(M)
         HashSet<Integer> special= new HashSet<Integer>();
        for(int z : uniq) //n
        {
            for (int i = 2 * z; i <= max;  i+= z)  //sieve
                    if (uniq.contains(i)) 
                    special.add(i);

        }
        
        
         int ans=0;
          for (Map.Entry<Integer, Integer> x : freq.entrySet()) 
          {
            if (x.getValue() > 1) 
                ans += x.getValue();
                
            else if (special.contains(x.getKey()))
                ans++;

          }
         
        return ans; 
    }
}
