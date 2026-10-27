package week01.day01;

import java.util.Arrays;

public class RunningSum {

    /*
    Input: Integer Array
    Output: Integer Array
    Simple approach: for each element, add the previous element to it.
    Repeated work: the previous element would be added for every index.
    Information carried forward: the previous element already contains the running sum.
    Expected time complexity: (n)
    Expected space complexity: O(1) if I use normal for loop, O(n) if I use advanced for loop.
    */

    public int[] runningSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i]=nums[i];
            }else{
                nums[i]= nums[i-1]+nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSum solution = new RunningSum();

        int[] input = {2, 5, 1, 3};
        int[] expected = {2, 7, 8, 11};

        int[] actual = solution.runningSum(input);

        System.out.println("Input:    " + Arrays.toString(input));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual:   " + Arrays.toString(actual));
        System.out.println(
                "Passed:   " + Arrays.equals(expected, actual)
        );
    }
}