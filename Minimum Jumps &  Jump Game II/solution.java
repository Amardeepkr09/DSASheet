// GEEK FOR GEEK - Minimum Jumps

class Solution {
    static int minJumps(int[] arr) {
        int size = arr.length;
        
        if (size <= 1) {
            return 0;
        }
        
        if (arr[0] == 0) {
            return -1;
        }
        
        int maxReach = arr[0]; // The maximum index that can be reached
        int steps = arr[0];    // The steps we can take
        int jumps = 1;         // At least one jump is needed
        
        for (int i = 1; i < size; i++) {
            if (i == size - 1) {
                return jumps;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            
            if (steps == 0) {
                jumps++; // We must jump
                if (i >= maxReach) {
                    return -1; // Cannot move forward
                }
                
                steps = maxReach - i;
            }
        }
        
        return -1; // If we reach here, we couldn't reach the end
    }
}