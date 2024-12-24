class Solution {
    // Function to find the intersection of two arrays
    //OPTIMAL APPROACH
    ArrayList<Integer> intersection(int[] a, int[] b)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0, j=0;
        
        while(i<a.length && j<b.length)
        {
            if(a[i] < b[j])
                i++;
            else if(b[j] < a[i])
                j++;
            else
            {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) 
                {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        return ans;
    }
}
