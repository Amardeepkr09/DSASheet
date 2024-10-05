// This is a LeetCode Problem 53
class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxi = nums[0];
        int size = nums.length;
        
        for(int i = 0; i < size; i++){
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
