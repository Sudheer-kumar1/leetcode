class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int max = 0;
        for(int num:arr){
            if(count == 0){
                max = num;
            }
            count += (num == max) ? 1 : -1;
        }
        return max;
    }
}