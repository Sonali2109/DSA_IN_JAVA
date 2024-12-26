class Solution {
    public static int largest(int[] arr) {
        // code here
        // brute approach -->  O(N log N)
    //    int n = arr.length;
    //    Arrays.sort(arr);
    //    return arr[n-1];
        
        //optimal approach --> O(N)
        int largest = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > largest) 
                largest = arr[i];
        }
        return largest;
    }
}
