class Solution {
    public long minimumSteps(String s) {
        
        int size = s.length();
        int last = 0;
        long swapCount = 0;
        
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == '1'){
                continue;
            }else{
                swapCount += (i - last);
                last++;
            }
        }
        
        return swapCount;
    }
}