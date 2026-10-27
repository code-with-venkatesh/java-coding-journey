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

        test(
                solution,
                new int[]{2, 5, 1, 3},
                new int[]{2, 7, 8, 11},
                "Normal positive test case"
        );

        test(
                solution,
                new int[]{5},
                new int[]{5},
                "Single Element test case"
        );

        test(
                solution,
                new int[]{0,0,0},
                new int[]{0,0,0},
                "All zeros test case"
        );

        test(
                solution,
                new int[] {-2, -3, -1, 4},
                new int[] {-2, -5, -6, -2},
                "Negative & negative numbers test case"
        );
    }
    private static void test(
            RunningSum solution,
            int[] input,
            int[] expected,
            String testName
    ){
        int[] actual = solution.runningSum(input.clone());
        boolean passed = Arrays.equals(actual, expected);
        System.out.println("Test :   "+ testName);
        System.out.println("Input:   "+Arrays.toString(input));
        System.out.println("Expected: "+Arrays.toString(expected));
        System.out.println("Actual:   "+Arrays.toString(actual));
        System.out.println("Result:   "+(passed ? "Pass " : "Fail"));
        System.out.println();
    }
}