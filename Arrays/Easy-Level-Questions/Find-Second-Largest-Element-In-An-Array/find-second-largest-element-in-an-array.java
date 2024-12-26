class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
    /*    
        //Better Approach --> O (2N)
        int n = arr.length;      
        int largest = arr[0];
        
        for(int i=0; i<n; i++)
        {
            if(arr[i] > largest)    largest = arr[i];
        }
        
        int secondLargest = -1;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]>secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }
        
        return secondLargest;
    */
    
        // OPTIMAL APPROACH ---> O(N)
        int n = arr.length;      
        int largest = -1;
        int secondLargest = -1;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }
}
