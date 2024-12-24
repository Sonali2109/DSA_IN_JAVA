class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        
        //optimal approach
        int n1 = a.length;
        int n2 = b.length;
        int i=0;
        int j=0;
        ArrayList<Integer> unionA = new ArrayList<>();
        
        while(i<n1 && j<n2)
        {
            if(a[i] <= b[j])
            {
                if(unionA.size() == 0 || unionA.get(unionA.size()-1) != a[i])
                {
                    unionA.add(a[i]);
                }
                i++;
            }
            else
            {
                if(unionA.size() == 0 || unionA.get(unionA.size()-1) != b[j])
                {
                    unionA.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<n1)
        {
            if(unionA.size() == 0 || unionA.get(unionA.size()-1) != a[i])
            {
                unionA.add(a[i]);
            }
            i++;
        }
        
        while(j<n2)
        {
            if(unionA.size() == 0 || unionA.get(unionA.size()-1) != b[j])
            {
                unionA.add(b[j]);
            }
            j++;   
        }
        
        return unionA;
    }
}
