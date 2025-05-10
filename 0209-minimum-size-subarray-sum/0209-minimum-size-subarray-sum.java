class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int left = 0 ;
     int right = 0;
     int currentSum = 0;
     int minLength = Integer.MAX_VALUE;

     for(right = 0;right < nums.length; right++) {
        currentSum += nums[right];
        while(currentSum >= target){
            if(right-left+1 < minLength){
                minLength = right-left+1;
            }
            currentSum -= nums[left];
            left++;
        } 
     }
     return minLength != Integer.MAX_VALUE ? minLength : 0 ; 
    }
}