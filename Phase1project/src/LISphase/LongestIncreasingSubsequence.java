package LISphase;
import java.util.*;

public class LongestIncreasingSubsequence {

	
    public static void main(String[] args) {
    	int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int lisLength = findLISLength(nums);

        System.out.println("Longest Increasing Subsequence Length: " + lisLength);
    }

    private static int findLISLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1); // Initialize LIS array with 1 as the minimum length

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLength = 0;
        for (int length : lis) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

}
