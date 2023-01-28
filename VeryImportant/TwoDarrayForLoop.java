package VeryImportant;

public class TwoDarrayForLoop {
    public static void main(String[] args) {


        int[][] arr = {{1, 2}, //0
                {3, 4}, //1
                {5, 6}};//2

        for (int row = 0; row < arr.length; row++) {//outer loops iterates over rows
            for (int col = 0; col < arr[row].length; col++) {//iterates over each column
                System.out.print(arr[row][col]+" ");
            }

        }
    }}
