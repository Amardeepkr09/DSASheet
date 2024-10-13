// GEEK FOR GEEK :- Next Permutation

class Solution {
    public void nextPermutation(int[] arr) {
        int i = arr.length - 2;
        
        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        // Step 2: If such element is found, find the element just larger than arr[i]
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap the two elements
            swap(arr, i, j);
        }
        
        // Step 4: Reverse the elements after index i
        reverse(arr, i + 1, arr.length - 1);
    }
    
    // Helper function to swap elements
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Helper function to reverse a portion of the array
    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
