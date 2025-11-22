import day1.Sort012;

import static day1.Duplicate.Duplicate1;
import static day1.KadanesAlgo.KadanesAlgo1;
import static day1.Sort012.Sort;
import static day2.SetMatrixZero.printMatrix;
import static day2.SetMatrixZero.setZeroes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 3};
        int[] nums1 = {0, 1, 2, 0, 1, 2, 1, 0};
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        System.out.println("Contains duplicate: " +Duplicate1(nums));
        int max = KadanesAlgo1(nums);
        System.out.println("Maximum subarray sum: " + max);
         Sort(nums1);
        for (int x : nums1)
        { System.out.print(x + " ");}


        System.out.println("\nMatrix before setZeroes:");
        printMatrix(matrix);
        setZeroes(matrix);
        System.out.println("\nMatrix after setZeroes:");
        printMatrix(matrix);

    }
    }
