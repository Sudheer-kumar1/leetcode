import java.util.*;
public class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]){
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            
            stack.push(i);
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution(); 
        int[] res = sol.dailyTemperatures(arr);
        System.out.println(Arrays.toString(res)); 
    }
}