import java.util.*;
public class Solution{
    public static int[] nextGreaterElements(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int index = i % n;
            while(!stack.isEmpty() && stack.peek() <= nums[index]){
                stack.pop();
            }
            result[index] = stack.isEmpty() ? -1 : stack.peek();
            
            stack.push(nums[index]);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = nextGreaterElements(arr);
        System.out.println(Arrays.toString(res)); 
    }
}
