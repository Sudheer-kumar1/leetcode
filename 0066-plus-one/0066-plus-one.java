class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i] < 10){
                return digits;
            }
            digits[i]=0;
        }
        int[] arr = new int[digits.length + 1];
        arr[0]=1;

        return arr;
    }
}