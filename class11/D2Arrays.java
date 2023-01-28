package class11;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30},{31,21,11},{2,4}};//first way of creating 2D Array//
        System.out.println(matrix[2][1]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix[0].length ; i++) {
            System.out.println(matrix[0][1]);

        }
    int[] arr=matrix[0];//getting complete first array from 2d array
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);



        }
    }

}
