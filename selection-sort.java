class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;   
        for(int i=0;i<=n-2; i++)
        {
            int mini = i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[mini] > arr[j])
                {
                   mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}
