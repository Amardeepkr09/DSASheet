// GEEK FOR GEEK :- Minimize the Heights II

class Solution {
    int getMinDiff(int[] arr, int k) {
        
        int size = arr.length;
        Arrays.sort(arr);
        
        int ans = arr[size - 1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[size-1] - k;
        
        int min = 0, max = 0;
        
        for(int i = 0; i < size - 1; i++){
            min = Math.min(smallest, arr[i+1]-k);
            max = Math.max(largest, arr[i]+k);
            
            if(min < 0){
                continue;
            }
            
            ans = Math.min(ans, max - min);
        }
        
        return ans;
        
    }
}



// LEETCODE :- Smallest Range II (910)

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        
        int size = nums.length;
        Arrays.sort(nums); 
        
        int ans = nums[size - 1] - nums[0]; 
        
        
        for (int i = 0; i < size - 1; i++) {
            
            int max = Math.max(nums[size - 1] - k, nums[i] + k);  
            int min = Math.min(nums[0] + k, nums[i + 1] - k); 
            
            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}