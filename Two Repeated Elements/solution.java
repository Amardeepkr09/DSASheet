// GFG :- Two Repeated Elements

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int n, int arr[]) {
        
        int[] result = new int[2];  // Array to store the two repeated elements
        int index = 0;  
        
        // Traverse through the array
        for (int i = 0; i < n + 2; i++) {
            int absValue = Math.abs(arr[i]);  
            
            if (arr[absValue] > 0) {
                arr[absValue] *= -1;
            } else {
                result[index] = absValue;
                index++;
            }
        }
        
        return result;  // Return the array containing the two repeated elements
    }
}