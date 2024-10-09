// LEETCODE - Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        // Detect the common node
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        fast = 0; // Re-initialize fast

        // Find the start of the linked list
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;  // Return the duplicate number
    }
}