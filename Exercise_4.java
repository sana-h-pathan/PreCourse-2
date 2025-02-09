import java.util.Arrays;
// Time Complexity : O(nlogn)
// Space Complexity : O(n)
class MergeSort
{ 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    {  
       //Your code here
        int[] lArr = Arrays.copyOfRange(arr, l, m + 1);
        int[] rArr = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = l, a = 0, b = 0;

        while (a < lArr.length && b < rArr.length) {
            if (lArr[a] <= rArr[b])
                arr[i++] = lArr[a++];
            else
                arr[i++] = rArr[b++];
        }
        while (a < lArr.length) arr[i++] = lArr[a++];
        while (b < rArr.length) arr[i++] = rArr[b++];
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
	    //Write your code here
        //Call mergeSort from here
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        sort(arr, l, m);
        sort(arr, m + 1, r);
        merge(arr, l, m, r);
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 