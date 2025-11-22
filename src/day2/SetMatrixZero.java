package day2;

import java.util.Arrays;

public class  SetMatrixZero {
    public static  void  setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int rows = matrix.length, cols = matrix[0].length;
        boolean rowZero = false, colZero = false;



        for (int i = 0; i < rows; i++)
            if (matrix[i][0] == 0) colZero = true;
        for (int j = 0; j < cols; j++)
            if (matrix[0][j] == 0) rowZero = true;


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if (rowZero)
            for (int j = 0; j < cols; j++) matrix[0][j] = 0;
        if (colZero)
            for (int i = 0; i < rows; i++) matrix[i][0] = 0;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
