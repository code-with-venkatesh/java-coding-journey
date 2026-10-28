package week01.day01;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int insertPosition =0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        for(int i=insertPosition;i<nums.length;i++) {
            nums[i] = 0;
        }


    }

    public static void main(String[] args) {

        MoveZeroes solution = new MoveZeroes();

        runTest(
                solution,
                "Example 1",
                new int[]{0, 1, 0, 3, 12},
                new int[]{1, 3, 12, 0, 0}
        );

        runTest(
                solution,
                "Single Zero",
                new int[]{0},
                new int[]{0}
        );

        runTest(
                solution,
                "No Zeroes",
                new int[]{1, 2, 3},
                new int[]{1, 2, 3}
        );

        runTest(
                solution,
                "All Zeroes",
                new int[]{0, 0, 0},
                new int[]{0, 0, 0}
        );

        runTest(
                solution,
                "Zero At End",
                new int[]{1, 2, 3, 0},
                new int[]{1, 2, 3, 0}
        );

        runTest(
                solution,
                "Multiple Zeroes",
                new int[]{4, 0, 5, 0, 0, 3},
                new int[]{4, 5, 3, 0, 0, 0}
        );
    }

    private static void runTest(
            MoveZeroes solution,
            String testName,
            int[] input,
            int[] expected) {

        int[] actual = input.clone();

        solution.moveZeroes(actual);

        boolean passed = Arrays.equals(actual, expected);

        System.out.println("================================");
        System.out.println(testName);
        System.out.println("Input    : " + Arrays.toString(input));
        System.out.println("Expected : " + Arrays.toString(expected));
        System.out.println("Actual   : " + Arrays.toString(actual));
        System.out.println(
                passed ? "PASS" : "FAIL"
        );
    }
}